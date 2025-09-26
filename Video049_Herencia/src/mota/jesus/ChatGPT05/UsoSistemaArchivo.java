package mota.jesus.ChatGPT05;

import java.util.Arrays;

public class UsoSistemaArchivo {

	public static void main(String[] args) {

		Archivo[] misArchivos = new Archivo[5];

		misArchivos[0] = new Cancion("Sing in the rain", 127, "Freddy Merucry", 360);
		misArchivos[1] = new Cancion("Moon light shadow", 348, "MIke O'ldfield", 540);
		misArchivos[2] = new Video("Radio gaga", 250, "1080x900", 360);
		misArchivos[3] = new Video("Top Gun", 450, "1080x900", 260);
		misArchivos[4] = new Imagen("La belleza es pura", 670, "1080x900");
		
		Cancion[] canciones = new Cancion[2];
		int i = 0;

		for (Archivo archivo : misArchivos) {

			if (archivo.tipoArchivo().equals("Cancion")) {
				
				canciones[i] = (Cancion) archivo;
				
				((Cancion) archivo).mostrarInformacion();
				
				i++;

			}
			if (archivo.tipoArchivo().equals("Video")) {
				
				((Video) archivo).mostrarInformacion();
			}
			if (archivo.tipoArchivo().equals("Imagen")) {
				
				((Imagen) archivo).mostrarInformacion();
			}

		}
		
		System.out.println("\n\n============Ordenar informacion de canciones========================");
		
		Arrays.sort(canciones);
		
		for (Cancion cancion : canciones) {
			
			cancion.mostrarInformacion();
		}

	}

}
