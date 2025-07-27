package mota.jesus.Herencia;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		/**
		 * Empleado Antonio = new Empleado("Antonio", 2300.5, 2025, 7, 26);
		
		Jefe Julia = new Jefe("Julia", 5300.7, 2025, 1, 12);
		
		System.out.println(Antonio.getDatosEmpleado());
		
		System.out.println(Julia.getDatosEmpleado());
		
		System.out.println(Julia.getSueldo());
		
		Julia.setIncentivo(200.3);

		System.out.println(Julia.getSueldo());
	
		 */
		Jefe Juan = new Jefe("Juan",10300.5, 2024,5,15);
		
		Juan.setIncentivo(200);
		
		Empleado[] losEmpleados = new Empleado[6];
		
		losEmpleados[0] = new Empleado("Antonio",2300.5, 2025,7,5);
		
		losEmpleados[1] = new Empleado("Carlos",5300.5, 2023,1,2);
		
		losEmpleados[2] = new Empleado("Maria",1300.5, 2021,3,15);
		
		losEmpleados[3] = new Empleado("Ana",5300.5, 2025,1,30);
		
		losEmpleados[4] = Juan;	//principio de sustitucion. Como Jefe "ES-UN" Epleado puedo guardarlo  
								//en un array de la clase Empleado
		losEmpleados[5] = new Jefe("Isabel", 8000, 2007,3,21);
		
		Jefe Isabel = (Jefe)losEmpleados[5];
		
		Isabel.setIncentivo(500);
		
		/**Empleado Patricia = new Jefe("Patricia", 2550, 2007, 5 ,6);//Casting implicito downcasting
		
		Jefe PatriciaSecretaria = (Jefe) Patricia;*/
		
		for (Empleado empleado : losEmpleados) {
			
			System.out.print(empleado.getDatosEmpleado());
			
			System.out.println(". Su sueldo es de " + empleado.getSueldo() + "€");	// Polimorfismo getSueldo viene de Jefe
																					// a pesar de que tiene su propio metodo
																					// lo realiza el interprete de JAVA			
			
		}
	}	

}

