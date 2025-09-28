package EntradaDatos_ThrowV;

import javax.swing.JOptionPane;

/*
 * Creamos nuestra exception controlada pero en el bloque try le definimos el error que antepone
 * al de la superclase
 */
public class EntradaDatos_ThrowV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mail = JOptionPane.showInputDialog("Introduce mail");

		try {
			examinaMail(mail);
		} catch (LongitudMialErroneaV e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Error menos de 3 letras");
		}
	}

	

	private static void examinaMail(String mail) throws LongitudMialErroneaV {
		// TODO Auto-generated method stub
		int arroba = 0;

		boolean punto = false;

		if (mail.length() <= 3) {

			LongitudMialErroneaV miException = new LongitudMialErroneaV("La longitud es incorrecta");

			throw miException;

		}

		for (int i = 0; i < mail.length(); i++) {

			if (mail.charAt(i) == '@') {

				arroba++;
			}

			if (mail.charAt(i) == '.') {

				punto = true;

			}
		}

		if (arroba == 1 && punto == true) {

			JOptionPane.showMessageDialog(null, "Email correcto");

		}
	}

}

class LongitudMialErroneaV extends Exception {
	// Necesita dos constructores
	public LongitudMialErroneaV() {
		super();
	}

	public LongitudMialErroneaV(String mensajeError) {
		super(mensajeError);
	}

}
