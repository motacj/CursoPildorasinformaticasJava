package prueba;

public class Clase01 {

	protected String nombre;
	
	protected int numero;
	
	private String[] notas;

	/**
	 * @param nombre
	 * @param numero
	 * @param notas
	 */
	public Clase01(String nombre, int numero, int num_notas) {
		this.nombre = nombre;
		this.numero = numero;
		this.notas = new String[num_notas];
	}
	
	public String getDatos() {
		return "los datos de la Clase01 son:\n   -Nombre: " + this.nombre + "\n   -Numero: " + this.numero;
 	}
}
