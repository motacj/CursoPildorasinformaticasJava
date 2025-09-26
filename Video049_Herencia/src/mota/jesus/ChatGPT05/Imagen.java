package mota.jesus.ChatGPT05;

public class Imagen extends Archivo{
	
	public Imagen(String nombre, double tamanioMB, String resolucion) {
		super(nombre, tamanioMB);
		this.resolucion = resolucion;
	}
	
	@Override
	public String tipoArchivo() {
		
		return "Imagen";
	}
	
	public void mostrar() {
		
		System.out.println("El archivo se esta mostrando");
		
	}
	public void mostrarInformacion() {

		System.out.println("\n=====================================================");
		this.abrir();
		System.out.println("El nombre del archivo es: " + this.nombre);
		System.out.println("El tamaño del archivo es: " + this.tamanioMB + " MB");
		System.out.println("La resolucion del video es: " + this.resolucion + " MP");
			
	}

	private String resolucion;

}
	