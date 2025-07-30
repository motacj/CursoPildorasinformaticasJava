package mota.jesus.ChatGPT01;

public class UsoVehiculos {

	public static void main(String[] args) {
		
		Vehiculo[] vehiculos = new Vehiculo[4];

        vehiculos[0] = new Coche("Toyota", "Corolla", 2015);
        vehiculos[1] = new Motocicleta("Yamaha", "MT-07", 2018);
        vehiculos[2] = new Coche("Ford", "Focus", 2020);
        vehiculos[3] = new Motocicleta("Honda", "CBR500R", 2022);

        for (Vehiculo v : vehiculos) {
            v.mostrarInformacion();
        }

	}

}
