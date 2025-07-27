package mota.jesus.Herencia;

public class Jefe extends Empleado{
	
	private double incentivo;

	public Jefe(String pNombre, double pSueldo, int anho, int mes, int dia) {
		super(pNombre, pSueldo, anho, mes, dia);
		// TODO Auto-generated constructor stub
	}
	
	public void setIncentivo(double incentivo) {
		
		this.incentivo = incentivo;
	}
	
	public double getSueldo() {
		
		double sueldoJefe = super.getSueldo();
		
		return sueldoJefe + this.incentivo;
	}

}
