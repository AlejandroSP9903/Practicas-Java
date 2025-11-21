package Clase4;
import java.util.Scanner;
public class Ejercicio2Clase4Ciclos {

	public static void main(String[] args) {
		
		/*Haz un programa que:
		 * Pida un número al usuario.
		 * Imprima solo los números pares desde 1 hasta ese número.
		 * Ejemplo: si ingresa 10 → imprime: 2, 4, 6, 8, 10.
		 */
		Scanner datos = new Scanner (System.in);
		System.out.println("Para el segundo ejercicio usare for.");
		System.out.println(" ");
		System.out.println("Por favor ingresa un numero para imprimir todos los pares hasta ese numero.");
		int numero = datos.nextInt();
		System.out.println("Gracias.");
		
		for (int i = 2; i <= numero; i += 2) {
			System.out.println(i);
		}
		// Aqui cometi un error de ya que puse inicialmente "h =+ 2", lo que genero que el ciclo
		// fuera infinito, debo tener mas cuidado con este tipo de errores.
		int h = 2;
		while (h <= numero) {
			System.out.println("Ahora con while :):"+ h);
			h += 2;
		}
		datos.close();	
	}
}
