package mota.jesus.abstraccion_y_interface;

import java.util.Date;

public abstract class Personas {

	private String nombre;

	public Personas(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public abstract String getDescripcion();

}

class Empleado extends Personas implements Comparable, ParaTrabajadores{

	private double Sueldo;

	private Date fechaAlta;

	public Empleado(String nombre, Date fechaAlta, double Sueldo) {
		super(nombre);
		this.fechaAlta = fechaAlta;
		this.Sueldo = Sueldo;
	}

	@Override
	public String getDescripcion() {
		return "El empleado " + super.getNombre() + ". Entro a trabajar el dia " + this.fechaAlta
				+ " y tiene un sueldo de " + this.Sueldo + "€";
	}

	@Override
	public int compareTo(Object o) {

		Empleado otroEmpleado = (Empleado)o;//Casting
		
		if(otroEmpleado.Sueldo < this.Sueldo) return -1;
		
		if(otroEmpleado.Sueldo > this.Sueldo) return 1;
		
		return 0;
	}
	//implementamos la interface ParaTrabajadores
	@Override
	public double setBonus(double gratificacion) {

		return gratificacion + ParaTrabajadores.bonus;
	}
}

class Jefes extends Empleado implements ParaJefes{

	private double Incentivo;
	
	private String cargo;

	public Jefes(String nombre, Date fechaAlta, double Sueldo) {
		super(nombre, fechaAlta, Sueldo);
	}

	public void setIncentivo(double Incentivo) {
		this.Incentivo = Incentivo;
	}
	//de la interface ParaJefes
	@Override
	public void setCargo(String cargo) {

		this.cargo = cargo;
		
	}

	@Override
	public String getCargo() {

		return "Además tiene el cargo de " + this.cargo;
	}
	//de la interface ParaJefes pero hereda de ParaTrabajadores
	@Override
	public double setBonus(double gratificacion) {

		double prima = 2000;
		
		return prima + gratificacion + ParaTrabajadores.bonus;
	}
}

class Alumnos extends Personas {

	private String a_Optativa;

	private String a_Aula;

	public Alumnos(String nombre, String a_Optativa, String a_Alua) {
		super(nombre);
		this.a_Optativa = a_Optativa;
		this.a_Aula = a_Alua;
	}

	@Override
	public String getDescripcion() {
		return "El alumno " + this.getNombre() + " esta en el aula " + this.a_Aula + " y tiene como asignatura optativa "
				+ this.a_Optativa;
	}
	
	

}
