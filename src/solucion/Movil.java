package solucion;

import java.util.Collections;
import java.util.List;

public class Movil {
	private List<Colgante> colgantes;
	
	public Movil(List<Colgante> colgantes) {
		super();
		this.colgantes = colgantes;
	}
	
	public String cantMoviles() {
		int cantVar = 0;
		int maxPeso = 0;
		
		Collections.sort(colgantes);
		
		for(int i=0;i<colgantes.size()-1;i++) {
			
			if(colgantes.get(i).equals(colgantes.get(i+1))) {
				cantVar++;
				
				if(i != colgantes.size()-2) {
					maxPeso += colgantes.get(i).getPeso()*2;
				}
				
				colgantes.remove(i+1);
				
				colgantes.add(new Colgante(colgantes.get(i).getPeso()*2));
			}
			
		}
		
		return cantVar == 0?"no se puede":maxPeso+" "+cantVar;
	}
}
