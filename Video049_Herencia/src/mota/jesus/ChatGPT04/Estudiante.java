package mota.jesus.ChatGPT04;

/**
 * @author JMC095
 * @version 1.0
 * @since 30 jul 2025
 */

public class Estudiante extends Persona{

	// 1.-Constantes

	// 2.-Atributos
	
	protected double notaMedia;
	
	// 3.-Constructor por defecto

	// 4.-Constructor con parámetros
	
	/**
	 * @param nombre
	 * @param edad
	 * @param notaMedia
	 */
	public Estudiante(String nombre, int edad, double notaMedia) {
		super(nombre, edad);
		this.notaMedia = notaMedia;
	}

	// 5.-Getters y Setters

	// 6.-Métodos
	
	@Override
	public void mostrarInformacion() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);
		System.out.println("Nota media: " + this.notaMedia);
	}
	
	public void estudiar() {
		System.out.println(this.nombre + " está estudiando");
	}

	
}

class Becario extends Estudiante{

	// 1.-Constantes

	// 2.-Atributos
	
	protected String empresaPracticas;
	
	// 3.-Constructor por defecto

	// 4.-Constructor con parámetros
	
	public Becario(String nombre, int edad, double notaMedia, String empresaPracticas) {
			super(nombre, edad, notaMedia);
			this.empresaPracticas = empresaPracticas;
		}
	
	// 5.-Getters y Setters

	// 6.-Métodos
	
	public void realizarPracticas() {
		System.out.println(this.nombre + " está realizando practicas en " + this.empresaPracticas);
	}
		
}




