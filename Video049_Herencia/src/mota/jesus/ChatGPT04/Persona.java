package mota.jesus.ChatGPT04;

/**
 * @author JMC095
 * @version 1.0
 * @since 30 jul 2025
 */

public abstract class Persona {

	// 1.-Constantes

    // 2.-Atributos
	
	protected String nombre;
	
	protected int edad;

    // 3.-Constructor por defecto

    // 4.-Constructor con parámetros
	
	/**
	 * @param nombre
	 * @param edad
	 */
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
    // 5.-Getters y Setters

    // 6.-Métodos

	public abstract void mostrarInformacion();
}

