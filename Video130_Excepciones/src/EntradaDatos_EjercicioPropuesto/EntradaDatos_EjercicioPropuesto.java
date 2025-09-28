package EntradaDatos_EjercicioPropuesto;

import java.io.IOException;

import javax.swing.JOptionPane;

public class EntradaDatos_EjercicioPropuesto {

	public static void main(String[] args) {
		
		int numero = 0;
		
		try {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero del 1 al 100"));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("No son numeros");
			System.exit(0);
		}

		try {
			examinaNumero(numero);
		} catch (NumeroIntroducidoEsErroneo e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("No esta entre los numeros indicados");
			System.exit(0);
		}
		
		System.out.println("Numero correcto");
	}

	private static void examinaNumero(int numero) throws NumeroIntroducidoEsErroneo {
		// TODO Auto-generated method stub

		if (numero < 1 || numero > 100) {

			NumeroIntroducidoEsErroneo miException = new NumeroIntroducidoEsErroneo(
					"El numero no esta entre el 1 y el 100");

			throw miException;

		}

	}

}

class NumeroIntroducidoEsErroneo extends IOException {
	// Necesita dos constructores
	public NumeroIntroducidoEsErroneo() {
		super();
	}

	public NumeroIntroducidoEsErroneo(String mensajeError) {
		super(mensajeError);
	}

}
