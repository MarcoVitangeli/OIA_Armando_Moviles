package solucion;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Movil {
	private List<Colgante> colgantes;
	
	public Movil(List<Colgante> colgantes) {
		super();
		this.colgantes = colgantes;
	}
	
	public String cantMoviles() {
		
		Map<Colgante,Integer> frecuencia = new HashMap<Colgante,Integer>();
		int varillas = 0;
		int maxPeso = 0;
		
		for(Colgante c : colgantes) {
			frecuencia.put(c,frecuencia.getOrDefault(c,0)+1);
		}
		
		for(Colgante c : frecuencia.keySet()) {
			
			int apariciones = frecuencia.get(c);
				
			if(apariciones >= 2) {
				varillas += apariciones/2;
				maxPeso  += c.getPeso()*2 * (apariciones/2);
			}
		}
		
		return varillas == 0?"no se puede":maxPeso+" "+varillas;
	}
		
}
