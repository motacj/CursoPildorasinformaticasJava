package mota.jesus.condicionalesIF;

import javax.swing.JOptionPane;

public class Condicional_If_Ejemplo02 {

	public static void main(String[] args) {

		int edad;
		
		edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, pro favor"));
		
		if (edad < 18) {
			
			JOptionPane.showMessageDialog(null, "Es joven.");
			
		} else if(edad < 40) {
			
			JOptionPane.showMessageDialog(null, "Es maduro.");
			
		} else if(edad < 60) {
			
			JOptionPane.showMessageDialog(null, "Esta para jubilarse.");
			
		} else {
			
			JOptionPane.showMessageDialog(null, "Esta jubilado.");
			
		}
	}

}
