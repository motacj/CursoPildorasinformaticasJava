package Video130_Excepciones;
import java.io.IOException;
import java.util.*;

public class EntradaDatos_ThrowI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("¿Que deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");

		Scanner entrada = new Scanner(System.in);

		int decision = entrada.nextInt();

		if (decision == 1) {
			//Incluimos el try_catch en el punto que ejecuta y da el error
			try {
				
				pedirDatos();
				
			} catch (InputMismatchException e) {

				System.out.println("No es un numero");
				//Imprimela pila de errores para comprobar
				e.printStackTrace();
				
			}
			

		} else {

			System.out.println("Adios");

			System.exit(0);
		}

		entrada.close();

		System.out.println("Hemos terminado");

	}
	//Insertamos una excepcion con el nombre del error qeu nos da
	static void pedirDatos() throws InputMismatchException {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce tu nombre, por favor");

		String nombre_usuario = entrada.nextLine();

		System.out.println("Introduce edad, por favor");

		int edad = entrada.nextInt();

		System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + (edad + 1) + " años");

		entrada.close();

	}

}
