package mota.jesus.ejercicios;

public class Paquete {
	
	private int refEnvio;
	
	private float peso;
	
	private String DNI;
	
	private byte prioridad;

	/**
	 * @param refEnvio
	 * @param peso
	 * @param dNI
	 * @param prioridad
	 */
	public Paquete(int refEnvio, float peso, String DNI, byte prioridad) {
		
		this.refEnvio = refEnvio;
		this.peso = peso;
		this.DNI = DNI;
		this.prioridad = prioridad;
	}

	/**
	 * @return the peso
	 */
	public float getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}

	/**
	 * @return the prioridad
	 */
	public String getPrioridad() {
		switch (this.prioridad) {
		case 0:
			return "Con prioridad Normal el precio no se altera";
		case 1:
			return "Con prioridad Alta el precio se incrementa 10€";
		case 2:
			return "Con prioridad Urgente el precio se incrementa 20€";
		default:
			return "No ha introducido ninguna prioridad";
		}
	}

	/**
	 * @param prioridad the prioridad to set
	 */
	public void setPrioridad(byte prioridad) {
		this.prioridad = prioridad;
	}

	/**
	 * @return the refEnvio
	 */
	public int getRefEnvio() {
		return refEnvio;
	}

	/**
	 * @return the dNI
	 */
	public String getDNI() {
		return DNI;
	}
	
	
}
