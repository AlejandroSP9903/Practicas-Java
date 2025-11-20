package clase_3_PROGRAMADOR;
import java.util.Scanner;
public class ejercicio1Clase3 {
	
	/* Vamos a realizar un ejercisio donde nos pida Nombre, Nacionalidad y si tiene o no cedula.
	 * 
	 * 
	 */
	public static void main(String[] args) {
	Scanner datos = new Scanner (System.in);
	
	System.out.println("Por favor digite su edad.");
	int edad = datos.nextInt();
	datos.nextLine();
	System.out.println("Muchas gracias, ahora por favor digite si es colombiano o extranjero.");
	String nacionalidad = datos.nextLine();
	System.out.println("¿Tiene cedula?, escriba true ó false.");
	boolean cedula = datos.nextBoolean();

	// NOTA: tube un error en la verificacion de nacionalidad
	// para textos nunca debemos usar (nacionalidad == "colombiano") ya que
	// JAVA nunca lo detectara como si fuera el texto directamente
	// debemos usar para verificacion de textos (.equalsIgnoreCase("el texto que debe cumplirse") ó equals("texto"))
	
		
	if (edad >= 18 && nacionalidad.equalsIgnoreCase ("colombiano") && cedula) {
		System.out.println("Puedes ingresar al sistema de votacion.");
	}else if (edad >= 18 && !cedula) {
		System.out.println("No puedes votar por no tener cedula.");
	
	}else if (edad < 18) {
			System.out.println("No puedes votar por ser menor de edad.");
		}else {
			System.out.println("Lo sentimos, por el momento no puedes votar.");
	 }datos.close();	
	}
  }

