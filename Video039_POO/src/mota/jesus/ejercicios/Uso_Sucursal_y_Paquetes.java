package mota.jesus.ejercicios;

import javax.swing.JOptionPane;

public class Uso_Sucursal_y_Paquetes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sucursal nuevaSucursal = new Sucursal(
				Integer.parseInt(JOptionPane.showInputDialog("Numero de sucursal")),
				JOptionPane.showInputDialog("Direccion de envio"),
				JOptionPane.showInputDialog("Ciudad de envio"));
		
		int numeroPaquetes = Integer.parseInt(JOptionPane.showInputDialog("Numero de paquetes en el envio"));
		
		Paquete[] nuevoPaquete = new Paquete[numeroPaquetes];
				
		for (int j = 0; j < nuevoPaquete.length; j++) {
			nuevoPaquete[j] = new Paquete(
				Integer.parseInt(JOptionPane.showInputDialog("Codigo de referencia del paquete: " + (j+1))), 
				Float.parseFloat(JOptionPane.showInputDialog("Peso del paquete: " + (j+1))), 
				JOptionPane.showInputDialog( "DNI de la persona:" + (j+1)), 
				Byte.parseByte(JOptionPane.showInputDialog("Prioridad del paquete: " + (j+1) + "\n0.-Normal"
						+ "\n1.-Alta"+ "\n2.-Urgente")));
		}
		
		System.out.println(nuevaSucursal.getNumSucursal());
		
		System.out.println(nuevaSucursal.getDireccion());
		
		System.out.println(nuevaSucursal.getCiudad());
		
		System.out.println(numeroPaquetes);
		
		for (int i = 0; i < nuevoPaquete.length; i++) {
			
			System.out.println("====" + (i+1) + " Paquete====");
			
			System.out.println("La referencia del envio del " + (i+1) + " es: " + nuevoPaquete[i].getRefEnvio());
			
			System.out.println("El peso del envio " + (i+1) + " es de: " + nuevoPaquete[i].getPeso() + "Kg.");
			
			System.out.println("La prioridad del paquete " + (i-1) + "es: " + nuevoPaquete[i].getPrioridad());
			
			System.out.println("El precio del paquete " + (i-1) + "es: " + nuevaSucursal.setCalculaPrecio(nuevoPaquete[i]));
		}
				
				
	}

}
