package mota.jesus.ChatGPT05;



public class Cancion extends Archivo implements Multimedia, Comparable<Cancion>{
	
	public Cancion(String nombre, double tamanioMB, String artista,double duracion) {
		super(nombre, tamanioMB);
		this.artista = artista;
		this.duracion = duracion;
	}

	private String artista;
	
	private double duracion;

	@Override
	public void reproducir() {

		System.out.println("La cancion " + this.nombre + " se esta reproduciendo");
		
	}

	@Override
	public void mostrarInformacion() {
		
	System.out.println("\n=====================================================");
	this.abrir();
	System.out.println("El artista es: " + this.artista );
	System.out.println("El nombre del archivo es: " + this.nombre);
	System.out.println("El tamaño del archivo es: " + this.tamanioMB + " MB");
	System.out.println("La duracion de archivo es: " + this.getDuracion() + " mimutos");
		
	}

	@Override
	public double getDuracion() {
		
		return this.duracion;
		
	}

	@Override
	public String tipoArchivo() {

		return "Cancion";
	}

	@Override
	public int compareTo(Cancion otra) {

		return Double.compare(this.duracion, otra.duracion);
	}

}

