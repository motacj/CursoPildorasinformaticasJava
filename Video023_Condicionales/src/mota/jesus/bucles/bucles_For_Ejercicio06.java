package mota.jesus.bucles;

import javax.swing.JOptionPane;

public class bucles_For_Ejercicio06 {

	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero:")) ;
		
		int factorial = numero;
		
		for (int i = 1; i < numero ; i++) {

			factorial *= i ;
			
		}
		
		JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);

	}

}
