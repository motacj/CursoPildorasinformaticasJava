package mota.jesus.ChatGPT01;

public abstract class Vehiculo {
	
	public void mostrarInformacion() {
		
		System.out.println("La marca del vehiculo es:              " + this.marca);
		System.out.println("El modelo del vehiculo es:             " + this.modelo);
		System.out.println("El año de fabricacion del vehiculo es: " + this.anioFabricacion);
	}
	
	public abstract double calcularImpuesto();

	public Vehiculo(String marca, String modelo, int anioFabricacion) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
	}

	protected String marca, modelo;
	
	protected int anioFabricacion;

}

class Coche extends Vehiculo{

	public Coche(String marca, String modelo, int anioFabricacion) {
		super(marca, modelo, anioFabricacion);
	}

	@Override
	public double calcularImpuesto() {
		return ((anioFabricacion*0.05) * 10);
	}
	
	public void mostrarInformacion() {
		
		System.out.println("Tipo Coche");
		super.mostrarInformacion();
		System.out.println("Impuesto: " + calcularImpuesto());
        System.out.println("-----------------------------");
	}
	
	
}

class Motocicleta extends Vehiculo{

	public Motocicleta(String marca, String modelo, int anioFabricacion) {
		super(marca, modelo, anioFabricacion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularImpuesto() {
		return ((anioFabricacion*0.03) * 7);
	}

	
	public void mostrarInformacion() {

		System.out.println("Tipo Motocicleta");
		super.mostrarInformacion();
		System.out.println("Impuesto: " + calcularImpuesto());
        System.out.println("-----------------------------");
	}
}