package mota.jesus.POO;

public class vehiculos {
	
	//atributos de la clase o propiedades. PRIVATE solo son accesibles de la misma clase
	
	private int ruedas;

	private String color;
	
	private int largo;
	
	private int ancho;
	
	private int peso;
	
	private boolean climatizador;
	
	private boolean gps;
	
	private boolean tapiceria;
	
	private String extras;
	
	public vehiculos(int ruedas, String color, int largo, int ancho, int peso) {
		//Constructor de la clase. Tiene que tener el mismo nombre de la clase. PUBLIC son accesible desde cualquier clase
		this.ruedas = ruedas;
		
		this.color = color;
		
		this.largo = largo;
		
		this.ancho = ancho;
		
		this.peso = peso;
	}
	
	//Metodos Getter y Setter, devuelven y establecen el valor de los atributos
	
	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	

	public String getDatosVehiculo() {
	
		return "Tu vehiculo tiene " + this.ruedas + " ruedas. Además tiene " + this.largo + "m de largo";
		
	}
	
	public void setExtra(boolean climatizador) {
		
		this.climatizador = climatizador;
		
	}
	
	public void getExtra() {
		
		if (climatizador) System.out.println("Tu coche tiene climatizador");
		
		else System.out.println("Tu coche no tiene climatizador");
		
		if (gps) System.out.println("Tu coche tiene gps");
		
		else System.out.println("Tu coche no tiene gps");

		if (tapiceria) System.out.println("Tu coche tiene tapiceria de cuero");
		
		else System.out.println("Tu coche no tiene tapiceria de cuero");
		
	}
	
	public void setExtra(boolean climatizador, boolean gps) {
		
		this.climatizador = climatizador;
		this.climatizador = gps;
		
	}
	
	public void setExtra(boolean climatizador, boolean gps, boolean tapiceria) {
		
		this.climatizador = climatizador;
		this.gps = gps;
		this.tapiceria = tapiceria;
		
		
	}

}
