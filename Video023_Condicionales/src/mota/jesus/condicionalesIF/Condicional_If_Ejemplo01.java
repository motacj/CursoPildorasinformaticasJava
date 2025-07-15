package mota.jesus.condicionalesIF;

import javax.swing.JOptionPane;

public class Condicional_If_Ejemplo01 {

	public static void main(String[] args) {

		int edad;
		
		edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, pro favor"));
		
		if (edad >= 18) {
			
			JOptionPane.showMessageDialog(null, "Es mayor de edad.");
			
		} else {
			
			JOptionPane.showMessageDialog(null, "Es menor de edad.");
			
		}
	}

}
