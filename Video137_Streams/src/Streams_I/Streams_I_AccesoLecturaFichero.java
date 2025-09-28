package Streams_I;

import java.io.*;

public class Streams_I_AccesoLecturaFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leerFicheros acceso_externo = new leerFicheros();
		
		acceso_externo.leeDatos();
	}

}

class leerFicheros{
	
	public void leeDatos() {
		
		try {
			//creamos nuestro Stream de datos (puente de datos)- NO LO LEE
			FileReader entrada = new FileReader("src\\Streams_I\\Texto.txt");
			//Leemos el Stream
			int caracter = entrada.read();
			//Escribimos los caracateres
			while(caracter!=-1) {
				
				System.out.print((char)caracter);
				
				caracter = entrada.read();
				
			}
			
			entrada.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}