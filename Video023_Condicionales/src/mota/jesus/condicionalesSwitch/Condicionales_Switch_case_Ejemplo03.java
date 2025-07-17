package mota.jesus.condicionalesSwitch;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class Condicionales_Switch_case_Ejemplo03 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Introduce un dia");
		
		Scanner entrada = new Scanner(System.in);

		String diaSemana = entrada.next();
		
		String resultado = switch(diaSemana) {
		
			case "Lunes","Martes","Miercoles","Jueves","Viernes"->"Laborables";
			
			case "Sabado","Domingo"->"Festivo";
			
			default -> {
				JOptionPane.showMessageDialog(null,"Procesando la información introducida...");
                yield "Día no válido";
            }
        };
		
        JOptionPane.showMessageDialog(null,resultado);
        entrada.close();
    }
}
