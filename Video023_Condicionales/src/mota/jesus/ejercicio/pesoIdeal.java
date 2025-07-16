package mota.jesus.ejercicio;

import javax.swing.JOptionPane;

public class pesoIdeal {

	public static void main(String[] args) {

		
			float altura;
			
			String genero;
			
		
			altura = Float.parseFloat(JOptionPane.showInputDialog("¿Que altura tienes (m)?"));
			
			genero = JOptionPane.showInputDialog("Hombre o Mujer");
			
			if (genero.equals("Hombre")) {
				
				JOptionPane.showMessageDialog(null, "Su peso ideal es: " + (altura - 110) + "Kg");
				
			}else if (genero.equals("Mujer")) {
				
				JOptionPane.showMessageDialog(null, "Su peso ideal es: " + (altura - 120) + "Kg");
				
			}else {
				
				JOptionPane.showMessageDialog(null, "No has introducido una respuesa correcta");
				 
			}


	}

}
