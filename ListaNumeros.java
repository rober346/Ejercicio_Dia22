package ejercicioArraysList;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNumeros {
	
	public static void main(String [] args) {
		
		Scanner ent = new Scanner(System.in);
		List<Integer> listaNumeros = new ArrayList <>();
		System.out.println("DIGITA 5 NUMEROS PARA ORDENAR DE MENOR A MAYOR: ");
		
		for(int i = 0; i < 5; i++){
			System.out.println("Ingresa una numero: ");
			int numero = ent.nextInt();
			listaNumeros.add (numero);	
		}
		
		Collections.sort(listaNumeros);
		
		System.out.println("Los numeros ordenados son: " + listaNumeros);
		
	}

}
