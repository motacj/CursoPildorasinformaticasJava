package mota.jesus.bucles;

import javax.swing.JOptionPane;

public class bucles_While_Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num_aleatorio = (int) (Math.random()*100)+1;
		
		int numero_introducido = JOptionPane.showConfirmDialog(null, "Introduce un numero");
		
		System.out.println(num_aleatorio);
		
	}

}
