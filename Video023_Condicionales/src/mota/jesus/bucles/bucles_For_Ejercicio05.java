package mota.jesus.bucles;

import javax.swing.JOptionPane;

public class bucles_For_Ejercicio05 {

	public static void main(String[] args) {

		String mail;

		char letra;

		int contador_letra = 0;
		int contador_punto = 0;

		do {

			mail = JOptionPane.showInputDialog("Introduce tu mail con mas de 4 letras:");

			for (int i = 0; i < mail.length(); i++) {

				letra = mail.charAt(i);

				if (letra == '@')
					contador_letra++;
				if (letra == '.')
					contador_punto++;

			}

			if (!(contador_letra == 1)) {
				JOptionPane.showMessageDialog(null, "No tienen o tiene mas de 2 @");}
			if (contador_punto < 1) {
				JOptionPane.showMessageDialog(null, "El mail al mentos tiene que tener un punto");}
			if (mail.length() < 4) {
				JOptionPane.showMessageDialog(null, "Tiene menos de 4 letras");}


		} while (!(contador_letra == 1) || contador_punto < 1 || mail.length() < 4);

		JOptionPane.showMessageDialog(null, "Escrito correctamente");

	}

}
