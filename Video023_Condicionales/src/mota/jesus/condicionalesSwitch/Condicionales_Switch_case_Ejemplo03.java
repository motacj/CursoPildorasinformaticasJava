package mota.jesus.condicionalesSwitch;
/*
 * Java Tutorizado. Control de flujo. Condicional Switch. Novedades. Vídeo 28B
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Condicionales_Switch_case_Ejemplo03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		String diaSemana = entrada.next();
		
		String resultado = switch(diaSemana) {
		
		case "Lunes","Martes","Miercoles","Jueves","Viernes"->"Laborables";
		
		case "Sabado","Domingo"->"Festivo";
		
		default->{
			
			System.out.println("Procesando la informacion introducida...");
			yield "Dia no valido";
			
			}
		}

		};
		
		System.out.println(resultado);
		
		
	}

}
