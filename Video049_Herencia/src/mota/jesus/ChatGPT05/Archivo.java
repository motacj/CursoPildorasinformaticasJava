package mota.jesus.ChatGPT05;

public abstract class Archivo {
	
	protected String nombre;
	
	protected double tamanioMB;
	
	public Archivo(String nombre, double tamanioMB) {
		super();
		this.nombre = nombre;
		this.tamanioMB = tamanioMB;
	}
	
	public abstract String tipoArchivo();
	
	public void abrir() {
		
		System.out.println("El archivo esta abierto");
		
	}

}
