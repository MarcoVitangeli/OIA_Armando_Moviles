package solucion;
import java.io.IOException;
import java.util.List;

public class Solucion {
	public static void main(String[] args) {
		FileHandler fileHandler = new FileHandler("input","output.txt");
		
		try {
			List<Colgante> colgantes = fileHandler.parsearColgantes();
			
			Movil movil = new Movil(colgantes);
			
			fileHandler.writeFile(movil.cantMoviles());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}