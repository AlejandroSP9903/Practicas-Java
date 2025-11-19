package clase_2_PROGRAMADOR;
import java.util.Scanner;
public class Ejercisio_2 {

	public static void main(String[] args) {
		/* Vamos a crear un programa ahora que pida:
		 *  Nombre de usuario
		 * Rol en el sistema
		 * Segun el rol imprima un mensaje distinto:
		 * Admin: Tienes todos los accesos.
		 * Moderador:Puedes gestionar accesos y contenido.
		 * Usuario: Puedes navegar y usar funciones basicas.
		 * Cualquier otro: Rol no reconocido
		 */
		Scanner Datos = new Scanner (System.in);
		System.out.println ("Por favor dame tu nombre; ");
		String Name = Datos.nextLine ();
		System.out.println ("Gracias "+ Name +", ahora dame tu rol; ");
		String Rol = Datos.nextLine();
		
		if (Rol.equalsIgnoreCase ("Admin")) {
			System.out.println("Eres administrador, tienes acceso a todo.");
		}
		else if (Rol.equalsIgnoreCase("Moderador")) {
			System.out.println ("Eres Moderador, puedes gestionar accesos y contenido.");
	    }
		else if (Rol.equalsIgnoreCase("Usuario")){
			System.out.println("Eres un usaurio, puedes navegar y usar funciones basicas");
		}
		else {
			System.out.println("Rol no valido.");
		}
		Datos.close();
}
}
