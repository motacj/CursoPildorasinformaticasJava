package mota.jesus.condicionalesIF;

import javax.swing.JOptionPane;

public class Condicional_If_Ejemplo04 {

	public static void main(String[] args) {

		int edad;
		
		edad = Integer.parseInt(JOptionPane.showInputDialog("Aque distancia vives en KM."));
		
		
		
		if (edad >= 18) {
			
			String carnet = JOptionPane.showInputDialog("¿Tienes carnet?: ");
			
			//Si solo tiene una linea de codigo se puede suprimir la llaves
			
			if (carnet.equals("Si") || carnet.equals("si")) JOptionPane.showMessageDialog(null, "Puedes comprar un coche");
				
			else JOptionPane.showMessageDialog(null, "Sin carnet no puedes comprar un coche");

			
		}else JOptionPane.showMessageDialog(null, "Si eres menor no puedes tener carnet ni coche");
	}

}
