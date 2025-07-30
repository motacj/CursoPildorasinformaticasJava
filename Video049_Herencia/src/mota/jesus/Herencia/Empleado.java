package mota.jesus.Herencia;

import java.util.GregorianCalendar;

public class Empleado implements Comparable{
	
	private String nombre;
	
	private double sueldo;
	
	GregorianCalendar fechaAlta;
			
	private int Id;
			
	private static int IdSiguiente = 1;
	
	/**
	 * Constructor
	 * @param pNombre
	 * @param pSueldo
	 * @param anho
	 * @param mes
	 * @param dia
	 */

	public Empleado(String pNombre, double pSueldo, int anho, int mes, int dia) {
		
		this.nombre = pNombre;
		
		this.sueldo = pSueldo;
		
		this.fechaAlta = new GregorianCalendar(anho, mes, dia);
	
		this.Id = IdSiguiente;
		
		IdSiguiente++;
	}
				
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * @param porcentaje que se le aplica al sueldo to set
	 */
	public void setSubeSueldo(double porcentaje) {
		this.sueldo += (this.sueldo*porcentaje/100);
	}

	/**
	 * @return the fechaAlta
	 */
	public GregorianCalendar getFechaAlta() {
		return fechaAlta;
	}

	public String getDatosEmpleado() {
				
		return "El empleado " + this.nombre + " y tiene el ID " + this.Id +
				" .Tiene un sueldo de " + this.getSueldo() + "€ y entro a trabajar en ";
	}
	
	public static String getIdSiguiente() {

		return "El Id del siguiente empleado sera: " + IdSiguiente;
	}

	@Override
	public int compareTo(Object arg0) {
		
		Empleado otroEmpleado = (Empleado)arg0;
		
		if(this.sueldo < otroEmpleado.sueldo) return 1;
		
		if(this.sueldo > otroEmpleado.sueldo) return -1;
		
		return 0;
		
	}

}
