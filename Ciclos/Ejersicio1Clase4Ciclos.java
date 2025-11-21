package Clase4;
import java.util.Scanner;
public class Ejersicio1Clase4Ciclos {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que:
		 * Pida un número al usuario.
		 * Imprima todos los números desde 1 hasta ese número.
		 */
		Scanner datos = new Scanner (System.in);
		System.out.println("Bienvenido a la clase 4, el dia de hoy vamos a intentar completar un programa para los ciclos.");
		System.out.println(" ");
		System.out.println("Ingrese un numero, para realizar el conteo hasta ese numero");
		int numero = datos.nextInt();
		int i = 1;
		while (i <= numero) {
			System.out.println(i);
			i++;
		}
		datos.close();	
	}

}
