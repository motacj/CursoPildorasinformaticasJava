package mota.jesus.POOII;

/**
 * 
 */
public class Colegio {
	
	/**
	 * Atrinutos
	 */
	
	private String nombreColegio;
	
	private Alumno[] alumnos;

	/**
	 * Constructor de la clase Colegio que se le pasa dos parametros
	 * @param nombreColegio
	 * @param numeroAlumnos
	 */
	public Colegio(String nombreColegio, int numeroAlumnos) {

		this.nombreColegio = nombreColegio;
		
		this.alumnos = new Alumno[numeroAlumnos];
	}
	
	/**
	 * Metodo crea un Alumno del colegio 
	 * @param nombreAlumno
	 * @param d
	 */
	public void nuevoAlumno(String nombreAlumno, double d) {
		
		for (int i = 0; i < alumnos.length; i++) {
			
			if (alumnos[i] == null) {
				
				alumnos[i] = new Alumno(nombreAlumno, d);// Creamos y guardamos el alumno
				
				break;
				
			}
		}
		
	}
	
	/**
	 * Metodo lista todos los alumnos del colegio 
	 */
	
	public void getTodosAlumnos() {
		
		/**
		 * Lista todos las posiciones del array hasta que llega al que le devuelven nulo
		 */
		
		for (int i = 0; alumnos[i] != null; i++) {
			
			/*
			 * Asigna el valor de alumnos a una variable tipo alumno
			 */
			
			Alumno a = alumnos[i];
			
			if(a.getNombreAlumno() != null) {
				
				System.out.println("El nombre del Alumno: " + a.getNombreAlumno());
				
				System.out.println("El colegio al que pertenece es: " + this.nombreColegio);
					
				System.out.println("Identificador del alumno: " + a.getIdAlumno());
					
				System.out.println("Su nota media de entrada es: " + a.getNotaMedia());
				
				System.out.println("===========================================\n");
			}
			
		}

	}
	
	/**
	 * Se encarga de listar los datos del alumno que se le pasa por parametro
	 * @param nombreAlumno
	 */

	public void getDatosAlumno(String nombreAlumno) {
		
		for (int i = 0; alumnos[i] != null; i++) {
			
			Alumno a = alumnos[i];
			
			if(a.getNombreAlumno().equals(nombreAlumno)) {
				
				System.out.println("El nombre del Alumno: " + a.getNombreAlumno());
					
				System.out.println("El colegio al que pertenece es: " + this.nombreColegio);
					
				System.out.println("Identificador del alumno: " + a.getIdAlumno());
					
				System.out.println("Su nota media de entrada es: " + a.getNotaMedia());
				
				System.out.println("===========================================\n");
				
				break;
		
			}
			
		}
		
	}
	/**
	 * Se encarga de eliminar el alumno que se le pasa por parametro
	 * @param nombreAlumno
	 */
	public void setExpulsarAlumno(String nombreAlumno) {
		
		for (int i = 0; alumnos[i] != null; i++) {
			
			Alumno a = alumnos[i];
			
			if(a.getNombreAlumno().equals(nombreAlumno)) {
			
				System.out.println("El Alumno " + a.getNombreAlumno() + " va a ser expulsado");
				
				a.setNombreAlumno(null);
				
				a.setNotaMedia(0);
				
				a.setIdAlumno(0);
				
				System.out.println("===========================================\n");
			}
		}
		
	}
		/**
		 * Se encarga de cambiar la nota media del alumno que se le pasa por parametro
		 * @param nombreAlumno
		 * @param notaMedia
		 */
		public void setNotaMedia(String nombreAlumno,double notaMedia) {
			
			for (int i = 0; alumnos[i] != null; i++) {
				
				Alumno a = alumnos[i];
				
				if(a.getNombreAlumno().equals(nombreAlumno)) {
					
					System.out.println("===========================================\n");
				
					System.out.println("Se ha cambido la nota del alumno");
					
					a.setNotaMedia(notaMedia);
					
					getDatosAlumno(nombreAlumno);
					
					System.out.println("===========================================\n");
				}
			}
		

	}
}
