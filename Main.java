package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hola mundo.");
		
		// Vamos a definir las variables a continuacion usando "string, float, boolean"
		
		String Nombre = "Luis Uribe";
		int Edad = 26;
		float Sueldo = 2500000;
		boolean Programador = true;
		
		// Vamos a imprimir en consola las variables
		
		System.out.println("Nombre: " + Nombre + ". ");
		System.out.println("Edad: " + Edad + ".");
		System.out.println("¿Cuanto ganas al mes? "+Sueldo+".");
		System.out.println("¿Quieres ser programador? "+Programador+".");
		
		// Ahora vamos a pedir algunos datos al usuario, esto hara el proyecto mas dinamico
		
		Scanner Datos = new Scanner(System.in);
		
		System.out.println("Escribe tu nombre completo: ");
		String nombre = Datos.nextLine();
		
		System.out.println("Dame tu edad: ");
		int edad = Datos.nextInt();
		
		System.out.println("¿Cuanto ganas el mes?");
		double sueldo = Datos.nextDouble();
		
		System.out.println("¿Quieres ser millonario/a?, escribe 'true' si es asi, si no pon 'false.'" );
		boolean millonario = Datos.nextBoolean();
		
		System.out.println("Hola!, Tu nombre es, " +nombre+", y tu edad es,"+edad+", actualmente ganas: "+sueldo+" COP al mes, y quieres ser millonario? "+millonario);
		
	}

}
