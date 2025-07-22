package mota.jesus.ejercicios;

public class Sucursal {

	private int numSucursal;

	private String direccion;

	private String ciudad;

	/**
	 * @param numSucursal
	 * @param direccion
	 * @param ciudad
	 */
	public Sucursal(int numSucursal, String direccion, String ciudad) {

		this.numSucursal = numSucursal;
		this.direccion = direccion;
		this.ciudad = ciudad;
	}

	/**
	 * @return the numSucursal
	 */
	public int getNumSucursal() {
		return numSucursal;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	public String setCalculaPrecio(Paquete pPaquete) {
		
		switch (pPaquete.getPrioridad()) {
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

}
