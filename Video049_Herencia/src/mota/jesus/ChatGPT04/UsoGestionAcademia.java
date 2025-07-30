package mota.jesus.ChatGPT04;



/**
 * @author JMC095
 * @version 1.0
 * @since 30 jul 2025
 */

public class UsoGestionAcademia {

	public static void main(String[] args) {

		Persona[] listado = new Persona[6];
		
		listado[0] = new Empleado("Miguel", 34, 2800.34);
		listado[1] = new Estudiante("Ruben", 18, 7.5);
		listado[2] = new Becario("Ana", 27, 8.1, "FCC S.L.");
		listado[3] = new Docente("Emilio", 54, 2300, "Matematicas");
		listado[4] = new Administrativo("Gabriela", 35, 1500, "Administrativo");
		listado[5] = new Empleado("Laura", 24, 1800.34);
		
		for (Persona persona : listado) {
			persona.mostrarInformacion();
			
			if (persona instanceof Empleado) {
				((Empleado) persona).trabajar();	
			}
			if(persona instanceof Docente){
				((Docente) persona).impartirClase();
			}
			if(persona instanceof Administrativo) {
				((Administrativo) persona).gestionarDocumentos();
			}
			if(persona instanceof Estudiante) {
				((Estudiante) persona).estudiar();;
			}
			if(persona instanceof Becario) {
				((Becario) persona).realizarPracticas();;
			}
			
			System.out.println("-------------------------------------------");
		}


	}

}




