package Clase4;

import java.util.Scanner;

public class Ejercicio3Clase4Ciclos {


	public static void main (String[] args) {
		/*
		 * Imprime la tabla de multiplicar que el usuario quiera, del 1 al 10.
		 */
		Scanner datos = new Scanner(System.in);
		System.out.println("Vamos a imprimir la tabla de multiplicar del numero que ingreses hasta el 10.");
		System.out.println(" ");
		System.out.println("Ingresa el numero, por favor.");
		int numero = datos.nextInt();
		
		int i = 1;
		
		while (i <= 10) {
			int r = i * numero;
			System.out.println("Para WHILE: " + i+" x "+numero+" = "+r);
			i++;
		}
		for (int j = 1; j <= 10; j++) {
			int k = j * numero;
			System.out.println("Para FOR: " + j+" x "+numero+" = "+k);
		}
		datos.close();
	}

}
