package Clase4;

import java.util.Scanner;

public class Ejercicio4Clase4CiclosyLogica {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Por favor ingresa un numero para saber cuantos digitos tiene.");
		System.out.println();
		int numero = datos.nextInt();
		
		// Aqui cometi el error de que no puse el "numero != 0" puse fue "numero < 10", lo cual era incorrecto
		int n = 0;
		while( numero != 0 ) {
			numero = numero / 10;
			System.out.println(n);
			n++;
			
		}
		datos.close();
	}

}
