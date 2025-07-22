package mota.jesus.arrays;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Arrays_Ejemplo02 {

	public static void main(String[] args) {

		int[] numeros = new int[10];

		int i = 0;
		int cero, positivo, negativo;
		cero = 0;
		positivo = 0;
		negativo = 0;

		do {

			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce 10 numeros. Este es el numero " + (i + 1)));

			i++;

		} while (numeros.length > i);

		for (int j = 0; j < numeros.length; j++) {

			if (numeros[j] == 0) {

				cero++;

			} else if(numeros[j] >= 1){
				
				positivo++;

			} else {
				
				negativo++;
				
			}
		}
		
		JOptionPane.showMessageDialog(null, "Hay " + positivo + " numeros positivos");
		JOptionPane.showMessageDialog(null, "Hay " + negativo + " numeros negativos");
		JOptionPane.showMessageDialog(null, "Hay " + cero + " numeros que son ceros");

	}

}
