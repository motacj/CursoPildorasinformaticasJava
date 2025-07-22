package mota.jesus.arrays;

import java.util.Random;

import javax.swing.JOptionPane;


public class Arrays_Ejemplo04 {

	public static void main(String[] args) {

		int[] numeros = new int[100];
		
		Random rand = new Random();
		
		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i]=rand.nextInt(100) + 1;
			
		}
		
		int j = 0;

		for (int i : numeros) {
			
			j++;
			
			System.out.println("El " + j + "º es " + i );
		}
			
	

		
		
		

	}

}


