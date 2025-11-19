package clase_2_PROGRAMADOR;
import java.util.Scanner;
public class Mini_Proyecto {

	public static void main(String[] args) {
		/* Para la primera parte vamos a crear un sistema de login
		 * Va a pedir, Nombre de usuario, contraseña y y son correctas mostrara el menu
		 */

		String user = "Admin";
		String password = "123456789";
		boolean acceso = false;
		Scanner  datos = new Scanner (System.in);
		for (int i = 1; i <= 3; i++) {
			System.out.print("/n--- Este es el intento " + i + " de 3. ---");
			System.out.println(" Por favor ingresa tu nombre de usuario: ");
			String usuario = datos.nextLine();
			System.out.println("Ahora ingresa la contraseña de " + usuario + ".");
			String clave = datos.nextLine ();
		if (usuario.equalsIgnoreCase (user) && password.equals (clave)) {
		  acceso = true;
	break;
}
		else {
		System.out.println ("Usuario y/o contraseña invalido(s). Te quedan " + (3 - i) + " intento(s).");
}
}		
 if (acceso) {
	 
		System.out.println("Perfecto, tienes acceso.");
		System.out.println("MENU PRINCIPAL");
		System.out.println("1. Ver perfil.");
		System.out.println("2. Configuración.");
		System.out.println("3. Salir.");
		int opcion = datos.nextInt();
		if (opcion == 1) {
			System.out.println("Mostrando perfil…");
		}
		else if (opcion == 2) {
			System.out.println("Abriendo configuración…");
		}
		else if (opcion == 3) {
			System.out.println("Saliendo del sistema…");
		}
		else {
			System.out.println("Opción inválida.");
		}
		}
 else {
	 System.out.println("Usuario bloqueado :/.");
 }	
 datos.close();
	}
}
