package mota.jesus.ejercicios;

public class UsoCuenta {

	public static void main(String[] args) {


		cuentasCorrientes cuenta01 = new cuentasCorrientes(200, "Jesus Mota Campayo", 123456789);
		
		cuentasCorrientes cuenta02 = new cuentasCorrientes(500, "Vanessa Santiago Gabriel", 987654321);
		
		System.err.println("El saldo de la cuenta actual numero " + cuenta01.getNumeroCuenta() + "es de " + cuenta01.getSaldo() + "€");
		
		System.err.println("El saldo de la cuenta actual numero " + cuenta02.getNumeroCuenta() + "es de " + cuenta02.getSaldo() + "€");
		
		cuenta01.transferencias(cuenta01, cuenta02, 300);
		
		System.out.println(cuenta01.getDatosCuenta());
		
		System.out.println(cuenta02.getDatosCuenta());
		
		cuenta02.transferencias(cuenta02, cuenta01, 200);
		
		System.out.println(cuenta01.getDatosCuenta());
		
		System.out.println(cuenta02.getDatosCuenta());

	}

}
