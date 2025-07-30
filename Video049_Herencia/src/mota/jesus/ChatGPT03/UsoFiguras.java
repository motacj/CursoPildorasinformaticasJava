package mota.jesus.ChatGPT03;

public class UsoFiguras {

	public static void main(String[] args) {
		
		
	Figura[] figuras = new Figura[6];
	
	figuras[0] = new TrianguloCarton("Rojo", 3, 4);
	figuras[1] = new TrianguloEquilatero("Amarillo", 5.5);
	figuras[2] = new Rectangulo("Azul", 2, 6);
	figuras[3] = new Cirulo("Negro", 3);
	figuras[4] = new Cuadrado("Añil", 4);
	figuras[5] = new Rectangulo("Violeta", 3, 4);
	
	for (Figura figura : figuras) {
		figura.mostrarInformacion();
	}
	

	}

}
