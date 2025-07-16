package mota.jesus.condicionalesSwitch;

import javax.swing.JOptionPane;

/*
 * Java Tutorizado. Control de flujo. Condicional Switch. Novedades. Vídeo 28B
 */


public class Condicionales_Switch_Ejemplo02 {

	public static void main(String[] args) {
		
		double salariot1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer salario"));
		
		double salariot2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer salario"));
		
		double salario_mayor;
		
		
		//Con IF
		
		if (salariot1>salariot2) salario_mayor = salariot1;
		
		else salario_mayor = salariot2;
		
		JOptionPane.showMessageDialog(null,"El salario mayor es: " + salario_mayor + "€");
		
		//Con OPERDOR TERNARIO
		
		salario_mayor = (salariot1>salariot2)?salariot1:salariot2;
		
		JOptionPane.showMessageDialog(null,"(operador ternario) - El salario mayor es: " + salario_mayor + "€");
	}

}
