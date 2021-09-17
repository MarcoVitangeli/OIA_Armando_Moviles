package solucion;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CantMovilesTest {

	@Test
	public void enunciado() {
		List<Colgante> colgantes = new ArrayList<>();
		int[] pesos = { 4, 3, 1, 2, 3, 1 };

		for (int peso : pesos) {
			colgantes.add(new Colgante(peso));
		}

		Movil movil = new Movil(colgantes);

		assertEquals("8 2", movil.cantMoviles());
	}

	@Test
	public void todosIguales() {
		List<Colgante> colgantes = new ArrayList<>();
		int[] pesos = { 4, 4, 4, 4 };

		for (int peso : pesos) {
			colgantes.add(new Colgante(peso));
		}

		Movil movil = new Movil(colgantes);
		assertEquals("16 2", movil.cantMoviles());
	}

	@Test
	public void todosDistintosCantidadMaxima() {
		List<Colgante> colgantes = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			colgantes.add(new Colgante(i));
		}

		Movil movil = new Movil(colgantes);
		assertEquals("no se puede", movil.cantMoviles());
	}

	@Test
	public void sinColgantes() {
		List<Colgante> colgantes = new ArrayList<>();

		Movil movil = new Movil(colgantes);

		assertEquals("no se puede", movil.cantMoviles());
	}

	@Test
	public void maximoValor() {
		List<Colgante> colgantes = new ArrayList<>();

		for (int i = 1; i <= 1000; i++) {
			colgantes.add(new Colgante(100));
		}

		Movil movil = new Movil(colgantes);
		assertEquals("100000 500", movil.cantMoviles());
	}

}
