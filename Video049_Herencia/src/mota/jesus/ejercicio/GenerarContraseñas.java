package mota.jesus.ejercicio;

import javax.swing.JOptionPane;

public class GenerarContraseñas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstruirContrasenha nueva = new ConstruirContrasenha(
				Integer.parseInt(JOptionPane.showInputDialog("Numero de contraseñas:")),
				Integer.parseInt(JOptionPane.showInputDialog("Numero de caracteres por contraseña:")));
		
		nueva.getPassGenerada();
		
		nueva.generaPass();
		
	}

}