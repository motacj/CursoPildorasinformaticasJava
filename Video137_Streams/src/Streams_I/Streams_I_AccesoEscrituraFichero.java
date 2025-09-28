package Streams_I;

import java.io.*;

public class Streams_I_AccesoEscrituraFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		escrituraFicheros acceso_externo = new escrituraFicheros();
		
		acceso_externo.leeDatos();
	}

}

class escrituraFicheros{
	
	public void leeDatos() {
		
		String texto = "Estamos escribiendo en un fichero II";
		
		try {
			//creamos nuestro Stream de datos (puente de datos)- NO LO LEE
			FileWriter salida = new FileWriter("src\\Streams_I\\TextoII.txt");
			//Escribimos los caracateres
			for (int i = 0; i < texto.length(); i++) {
				salida.write(texto.charAt(i));
			}
			
			salida.close();
			
			System.out.println("Se ha escrito el fichero");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}