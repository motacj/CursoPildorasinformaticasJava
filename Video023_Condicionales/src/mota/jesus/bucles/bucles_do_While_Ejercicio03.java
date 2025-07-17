package mota.jesus.bucles;

import javax.swing.JOptionPane;

public class bucles_do_While_Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador = 0;

		int num_aleatorio = (int) (Math.random()*100)+1;
		
		int numero_introducido;
		
		
		do {
			
			numero_introducido = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
			
			if (numero_introducido>num_aleatorio) {
				
				JOptionPane.showMessageDialog(null,"El numero es menor");
				
			} else if (numero_introducido<num_aleatorio ){
				
				JOptionPane.showMessageDialog(null,"El numero es mayor");

			} else {

				JOptionPane.showMessageDialog(null,"El numero es igual");

			}
			
			contador++;
			
		}while (!(num_aleatorio == numero_introducido));

		JOptionPane.showMessageDialog(null,"Correcto. El numero de intentos ha sido: " + contador);
		
	}

}
