package mota.jesus.condicionalesIF;

import javax.swing.JOptionPane;

public class Condicional_If_Ejemplo03 {

	public static void main(String[] args) {

		int distancia;
		
		double renta;
		
		byte hermanos;
		
		distancia = Integer.parseInt(JOptionPane.showInputDialog("Aque distancia vives en KM."));
		
		renta = Double.parseDouble(JOptionPane.showInputDialog("Renta familiar es."));
		
		hermanos = Byte.parseByte(JOptionPane.showInputDialog("Renta familiar es."));
		
		if (distancia > 10 && renta < 20000 && hermanos > 2) {
			
			JOptionPane.showMessageDialog(null, "Se te concede el 100% de la ayuda.");
			
		} else if (distancia > 10 || renta < 20000 || hermanos > 2) {
			
			JOptionPane.showMessageDialog(null, "Se te concede el 50% de la ayuda..");
			
		} else {
			
			JOptionPane.showMessageDialog(null, "No se te concede la ayuda.");
			
		}
	}

}
