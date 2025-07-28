package prueba;

public class Clase03 extends Clase02{
	
	private String direccion;

	public Clase03(String nombre, String apellidos, int numero, int num_notas, String direccion) {
		super(nombre, apellidos, numero, num_notas);
		this.direccion = direccion;
		// TODO Auto-generated constructor stub
	}
	public String getDatos() {
		return "Los datos de la Clase03 son:\n   -Nombre: " + super.nombre +
				"\n   -Apellido: " + this.apellidos
				 + "\n   -Numero: " + this.numero + 
				 "\n   -Direccion: " + this.direccion;
 	}
	
	public String getDatos1() {
		
		return super.getDatos();
	}

}
