package solucion;
import java.util.Objects;

public class Colgante implements Comparable<Colgante>{
	private int peso;
	
	public Colgante(int peso) {
		this.peso = peso;
	}
	
	public int getPeso() {
		return this.peso;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(peso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Colgante other = (Colgante) obj;
		return peso == other.peso;
	}

	@Override
	public int compareTo(Colgante o) {
		return this.peso-o.peso;
	}
	
	
}
