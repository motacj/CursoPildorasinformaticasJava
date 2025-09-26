package mota.jesus.ChatGPT05;

public class Video extends Archivo implements Multimedia{
	
	public Video(String nombre, double tamanioMB,String resolucion, double duracion) {
		super(nombre, tamanioMB);
		this.resolucion = resolucion;
		this.duracion = duracion;
	}

	private String resolucion;
	
	private double duracion;

	@Override
	public String tipoArchivo() {

		return "Video";
	}

	@Override
	public void reproducir() {
		
		System.out.println("El video " + this.nombre + " se esta reproduciendo");
		
	}

	@Override
	public void mostrarInformacion() {

		System.out.println("\n=====================================================");
		this.abrir();
		System.out.println("La resolucion del video es: " + this.resolucion + " MP");
		System.out.println("El nombre del archivo es: " + this.nombre);
		System.out.println("El tamaño del archivo es: " + this.tamanioMB + " MB");
		System.out.println("La duracion de archivo es: " + this.getDuracion() + " mimutos");
		
	}

	@Override
	public double getDuracion() {

		return this.duracion;
	}

}


