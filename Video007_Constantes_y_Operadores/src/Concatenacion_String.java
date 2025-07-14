import java.util.Scanner;

public class Concatenacion_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salario = 1850.55;
		
		
		final double CONVERSION_EURO = 0.86;
		
		System.out.println("El salario de Manuel es: " + salario*CONVERSION_EURO + "$");
		System.out.println("El salario de Manuel es: " + salario + "€");
		
		System.out.println("===========================================");
		
		int edad;
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Introduce la edad, pr favor: ");
			edad = entrada.nextInt();
		}
		System.out.println("La edad introducida es " + edad + " años");
		
		

	}

}
