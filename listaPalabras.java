package ejercicioArraysList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listaPalabras {
	
	public static void main(String [] args) {
		
		Scanner ent = new Scanner(System.in);
		
		List<String> listaPalabras = new ArrayList <>();
		
		System.out.println("Digita la cantidad de palabras: ");
		int cantpal = ent.nextInt();
				
		ent.nextLine(); //consume el salto de linea vacio que deja el nextInt luego de recibir un valor
		for(int i = 0; i < cantpal; i++){
			System.out.println("Ingresa una palabra: ");
			String palabra = ent.nextLine();
			listaPalabras.add (palabra);	
		}
		System.out.println("La lista de palabras es: ");
		for (String listaPalabras1 : listaPalabras) {
			System.out.println("--" + listaPalabras1);
		}
						
		System.out.println("Digita la palabra a verificar si esta listada");
		String verificaListado = ent.nextLine();
				
		if (listaPalabras.contains(verificaListado)) {
			System.out.println("Palabra YA listada");
		}else{
			System.out.println("Palabra NO listada");
		}
			
	}
}
