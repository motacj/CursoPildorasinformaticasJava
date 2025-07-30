package mota.jesus.abstraccion_y_interface;

import java.util.Arrays;
import java.util.Date;

public class UsoPersonas {

	public static void main(String[] args) {
		
		/*
		 * NO SE PUEDE INSTANCIAR UNA CLASE ABSTRACTA
		 */

		//Personas cualquiera = new Personas("Juan");
		
		System.out.println("\n\n=========Interface creada por el PROGRAMADOR=============");
		
		Empleado Juan = new Empleado("Juan",new Date(200756),2500);
		
		System.out.println(Juan.getNombre());		
		System.out.println(Juan.getDescripcion());
		
		Jefes Ana = new Jefes("Ana",new Date(500756),2400);

		System.out.println(Ana.getNombre());		
		System.out.println(Ana.getDescripcion());
		System.out.println(Ana.getCargo());
		Ana.setCargo("Directora Comercial");
		System.out.println(Ana.getCargo());
		
		Alumnos Maria = new Alumnos("Maria","Matematicas","Aula-121");
		
		System.out.println(Maria.getNombre());		
		System.out.println(Maria.getDescripcion());
		
		Jefes David = new Jefes("David",new Date(200756),2500);
		
		David.setCargo("Jefe de RRHH");
		System.out.println(David.getNombre());		
		System.out.println(David.getDescripcion());
		System.out.println(David.getCargo());
		
		System.out.println("\n\n=========Interface de la API de JAVA=============");
		
		
		Empleado[] losEmpleados = new Empleado[5];
		
		losEmpleados[0] = new Empleado("Juan",new Date(200756),2500);
		losEmpleados[1] = new Empleado("Ana",new Date(200756),1500);
		losEmpleados[2] = new Empleado("Emilio",new Date(200756),3500);
		losEmpleados[3] = new Empleado("Elvira",new Date(200756),2800);
		losEmpleados[4] = new Empleado("Luis",new Date(200756),5500);
		
	
		
		if(false) Arrays.sort(losEmpleados);//nos da un error porque hay que realizar un casting de Object de la interface
		//el if es para que no se ejecute y asi no salte el error en tiempo de ejecucion
		
		Arrays.sort(losEmpleados);//Una vez programado la interface Comparable si los ordena y no da error de ejecucion
		
		for (Empleado empleado : losEmpleados) {
			
			System.out.println(empleado.getDescripcion());
		}
		
		System.out.println("\n\n=========Herencia de Interface=============");
		
		Jefes Manuel = new Jefes("Manuel",new Date(200756),5500);
		Empleado Sonia = new Empleado("Sonia",new Date(200756),3500);
		
		System.out.println("El trabajador " + Manuel.getNombre() + " tiene un bonus de " + 
			Manuel.setBonus(500));
		
		System.out.println("El trabajador " + Sonia.getNombre() + " tiene un bonus de " + 
				Sonia.setBonus(500));
		
		
	}

}
