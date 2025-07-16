package mota.jesus.bucles;

import javax.swing.JOptionPane;

public class bucles_While_Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave = "Jesus";
		
		String acceso = "";
		
		while (!clave.equals(acceso)) {
			
			acceso = JOptionPane.showInputDialog("Introduce la clave da acceso");
			
		}
		
		JOptionPane.showMessageDialog(null, "Bienvenido a la zona de acceso");
		
	}

}
