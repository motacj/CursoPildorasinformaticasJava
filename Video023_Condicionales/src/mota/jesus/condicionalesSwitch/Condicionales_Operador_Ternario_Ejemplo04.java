package mota.jesus.condicionalesSwitch;

import javax.swing.JOptionPane;

/*
 * Java Tutorizado. Control de flujo. Condicional Switch. Novedades. Vídeo 28B
 */


public class Condicionales_Operador_Ternario_Ejemplo04 {

	public static void main(String[] args) {
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		
		String mayor = (edad>18)?"Eres a mayor de edad":"Eres menor de edad";
		
		JOptionPane.showMessageDialog(null,"(operador ternario) - " + mayor);
	}

}
