package prueba;

public class Clase02 extends Clase01{
	
	protected String apellidos;

	public Clase02(String nombre, String apellidos, int numero, int num_notas) {
		super(nombre, numero, num_notas);
		this.apellidos = apellidos;
	}
	
	public String getDatos() {
		return "Los datos de la Clase02 son:\n   -Nombre: " + this.nombre +
				"\n   -Apellido: " + this.apellidos
				 + "\n   -Numero: " + this.numero;
	}
	
	public String getDatos1() {
		
		return super.getDatos();
	}

}
