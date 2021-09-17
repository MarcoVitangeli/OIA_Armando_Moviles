package solucion;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CantMovilesTest {

	
	@Test
	public void enunciado() {
		List<Colgante> colgantes = new ArrayList<>();
		
		colgantes.add(new Colgante(4));
		colgantes.add(new Colgante(3));
		colgantes.add(new Colgante(1));
		colgantes.add(new Colgante(2));
		colgantes.add(new Colgante(3));
		colgantes.add(new Colgante(1));
		
		Movil movil = new Movil(colgantes);
		assertEquals("8 2", movil.cantMoviles());
	}
		
	@Test
	public void impares() {
		List<Colgante> colgantes = new ArrayList<>();
		
		colgantes.add(new Colgante(1));
		colgantes.add(new Colgante(1));
		colgantes.add(new Colgante(1));
		colgantes.add(new Colgante(1));
		colgantes.add(new Colgante(1));
		colgantes.add(new Colgante(1));
		colgantes.add(new Colgante(1));
		
		Movil movil = new Movil(colgantes);
		assertEquals("6 3", movil.cantMoviles());
	}

}
