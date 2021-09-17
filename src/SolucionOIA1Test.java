import static org.junit.Assert.*;
import solucion.Colgante;
import solucion.Movil;
import java.util.List;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;


public class SolucionOIA1Test {
	
	List<Colgante> colgantes;
	Movil m;
	@Before
	public void setup() {
		colgantes = new ArrayList<Colgante>();
		m = new Movil(colgantes);
 	}
	
	@Test
	public void casoEnunciado() {
		int[] pesos = {4,3,1,2,3,1};
		
		for(int peso : pesos) {
			colgantes.add(new Colgante(peso));
		}
		
		assertTrue(m.cantMoviles().equals("8 2"));
		
		colgantes.clear();
	}
	
	@Test
	public void todosIguales() {
		int[] pesos = {4,4,4,4};
		
		for(int peso : pesos) {
			colgantes.add(new Colgante(peso));
		}
		 
		assertTrue(m.cantMoviles().equals("16 2"));
		
		colgantes.clear();
	}
	
	@Test
	public void todosDistintosCantidadMaxima() {
		for(int i=1;i<=100;i++) {
			colgantes.add(new Colgante(i));
		}
		
		assertTrue(m.cantMoviles().equals("no se puede"));
		
		colgantes.clear();
	}
	
	@Test
	public void sinColgantes() {
		assertTrue(m.cantMoviles().equals("no se puede"));
		colgantes.clear();
	}
	
	@Test
	public void maximoValor() {
		for(int i=1;i<=1000;i++) {
			colgantes.add(new Colgante(100));
		}
		System.out.print(m.cantMoviles());
		assertTrue(m.cantMoviles().equals("100000 500"));
	}

}
