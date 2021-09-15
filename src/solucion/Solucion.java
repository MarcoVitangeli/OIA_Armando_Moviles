package solucion;
import java.io.IOException;

public class Solucion {
	public static void main(String[] args) {
		FileHandler fileHandler = new FileHandler("input","output.txt");
		
		try {
			Movil movil = fileHandler.readFile();
			
			fileHandler.writeFile(movil.cantMoviles());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

