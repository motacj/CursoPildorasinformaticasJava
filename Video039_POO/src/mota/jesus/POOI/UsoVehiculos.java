package mota.jesus.POOI;

public class UsoVehiculos {

	public static void main(String[] args) {

		vehiculos miCoche1 = new vehiculos(4,"Rojo",4,2,1000);
		
		System.out.println(miCoche1.getColor());
		
		System.out.println(miCoche1.getPeso());
		
		vehiculos miCoche2 = new vehiculos(3,"Azul",5,3,1500);
		
		System.out.println(miCoche2.getColor());
		
		System.out.println(miCoche2.getPeso());
		
		System.out.println(miCoche1.getDatosVehiculo());
		

		miCoche1.setExtra(true, false, true);
		
		miCoche1.getExtra();

	}

}
