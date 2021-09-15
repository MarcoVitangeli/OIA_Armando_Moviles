package solucion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileHandler {
	private String inputPath;
	private String outputPath;
	
	public FileHandler(String inputPath, String outputPath) {
		super();
		this.inputPath = inputPath;
		this.outputPath = outputPath;
	}
	
	public Movil readFile() throws FileNotFoundException{
		Scanner in = new Scanner(new File(inputPath));
		
		int c = in.nextInt();
		List<Colgante> lista = new ArrayList<Colgante>();
		
		for(int i=0;i<c;i++) {
			lista.add(new Colgante(in.nextInt()));
		}
		
		in.close();
		
		return new Movil(lista);
	}
	
	public void writeFile(String output) throws IOException {
		File file = new File(outputPath); 

		if (!file.exists()) {
			file.createNewFile();
		}
		
		FileWriter fw = new FileWriter(file); 
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(output);
		
		bw.close();
	}
}
