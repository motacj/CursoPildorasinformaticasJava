package mota.jesus.ejercicios;

public class cuentasCorrientes {
	
	private double saldo;
	
	private String nombreTitular;
	
	private long numeroCuenta;

	
	public cuentasCorrientes(double saldo, String nombreTitular, long numeroCuenta) {
		super();
		this.saldo = saldo;
		this.nombreTitular = nombreTitular;
		this.numeroCuenta = numeroCuenta;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public long getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public void transferencias(cuentasCorrientes pnumCuenta01, cuentasCorrientes pnumCuenta02, double cantidad ) {
		
		pnumCuenta01.saldo -= cantidad;
		
		pnumCuenta02.saldo += cantidad;
		
	}
	
	public String getDatosCuenta() {
		
		return "Titular de la cuenta " + this.numeroCuenta + " es " + this.nombreTitular +  " y tiene un saldo de " + this.saldo + "€";
		
	}

}
