package mota.jesus.arrays;

import javax.swing.JOptionPane;


public class Arrays_Ejemplo03 {

	public static void main(String[] args) {

		float[] numeros = new float[10];

		int i = 0;
		
		float numerosuma = 0;
		
		int n = 0;


		do {

			numeros[i] = Float.parseFloat(JOptionPane.showInputDialog("Introduce 10 numeros. Este es el numero " + (i + 1)));

			i++;

		} while (numeros.length > i);

		for (int j = 0; j < numeros.length; j++) {
			
			if((numeros[j]%2) == 0) {
				
				numerosuma += numeros[j];
				n ++;
				
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "La media de numeros pares es " + (numerosuma/n));

	}

}


