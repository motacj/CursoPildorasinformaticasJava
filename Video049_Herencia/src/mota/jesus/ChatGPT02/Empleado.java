package mota.jesus.ChatGPT02;

public abstract class Empleado {
	
	public void mostrarDatos() {
		
		System.out.println("El nombre es: " + this.nombre + 
				"\nSu DNi es el: " + this.DNI +
				"\nTiene un salario de: "  + this.salario + "€/mes");
		
	}
	
	public abstract double calcularSueldoFinal();

	public Empleado(String nombre, String DNI, double salario) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.salario = salario;
	}

	protected String nombre, DNI;
	
	protected double salario;
}

class EmpleadoTiempoCompleto extends Empleado{

	public EmpleadoTiempoCompleto(String nombre, String DNI, double salario) {
		super(nombre, DNI, salario);
		this.salario = this.calcularSueldoFinal();
	}

	@Override
	public double calcularSueldoFinal() {
		
		return salario + 500;
	}
	
	
	
	public void mostrarDFatos() {
		
		System.out.println("Tipo de Empleado a Tiempo Completo\n");
		this.mostrarDatos();
		System.out.println("====================================");
	}
	
}

class EmpleadoPorHoras extends Empleado{
	
	public void mostrarDFatos() {
		
		System.out.println("Tipo de Empleado por Horas\n");
		this.mostrarDatos();
		System.out.println("====================================");
	}

	public EmpleadoPorHoras(String nombre, String DNI, double salario, int horas) {
		super(nombre, DNI, salario);
		this.horas = horas;
		this.salario = this.calcularSueldoFinal();
	}

	@Override
	public double calcularSueldoFinal() {
		return salario + (this.horas * 15);
	}
	
	private int horas;
	
}