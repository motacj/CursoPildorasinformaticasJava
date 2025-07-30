package mota.jesus.ChatGPT04;

/**
 * @author JMC095
 * @version 1.0
 * @since 30 jul 2025
 */

public class Empleado extends Persona{

	// 1.-Constantes

	// 2.-Atributos
	
	public double salario;

	// 3.-Constructor por defecto

	// 4.-Constructor con parámetros
	
	public Empleado(String nombre, int edad, double salario) {
			super(nombre, edad);
			this.salario = salario;
		}
	
	// 5.-Getters y Setters

	// 6.-Métodos
	
	@Override
	public void mostrarInformacion() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);
		System.out.println("Salario: " + this.salario + "€/mes");
		
	}
	
	public void trabajar() {
		
		System.out.println(this.nombre + " esta trabajando");
		
	}
}

class Docente extends Empleado{

	// 1.-Constantes

	// 2.-Atributos
	
	private String materia;

	// 3.-Constructor por defecto

	// 4.-Constructor con parámetros
	
	public Docente(String nombre, int edad, double salario, String materia) {
		super(nombre, edad, salario);
		this.materia = materia;
	}
	
	// 5.-Getters y Setters

	// 6.-Métodos
	
	public void impartirClase() {
		
		System.out.println("Imparte la clase de: " + this.materia);
		
	}
	
}

class Administrativo extends Empleado{

	// 1.-Constantes

	// 2.-Atributos
	
	private String puesto;

	// 3.-Constructor por defecto

	// 4.-Constructor con parámetros
	
	public Administrativo(String nombre, int edad, double salario, String puesto) {
		super(nombre, edad, salario);
		this.puesto = puesto;
	}
	
	// 5.-Getters y Setters

	// 6.-Métodos
	
	public void gestionarDocumentos() {
		
		System.out.println(this.nombre + " esta ocupando el puesto de " + this.puesto);
		
	}
	
}


