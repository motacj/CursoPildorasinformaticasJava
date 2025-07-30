package mota.jesus.ChatGPT03;

public abstract class Figura {
	
	public void mostrarInformacion() {
		
		System.out.println("El color de la figura es: " + this.color);
	}
	
	public abstract double calcularPerimetro();
	
	public abstract double calcularArea();

		
	public Figura(String color) {

		this.color = color;
	}

	protected String color;
}

class Rectangulo extends Figura{
	
	@Override
	public double calcularPerimetro() {
	
		return (this.base + this.altura) * 2;
	}

	@Override
	public double calcularArea() {

		return this.base * this.altura;
	}
	
	public void mostrarInformacion() {
		
		System.out.println("La informacion del " + this.getClass().getSimpleName() + " es:");
		super.mostrarInformacion();
		System.out.println("Su Area es " + this.calcularArea() + "m2");
		System.out.println("Su Perimetro es " + this.calcularPerimetro() + "m");
		System.out.println("=============================================\n");
		
		
	}
	
	public Rectangulo(String color, double base, double altura) {
		super(color);
		this.altura = altura;
		this.base = base;
	}

	protected double base;
	
	protected double altura;
	
}

class Cuadrado extends Rectangulo{

	public Cuadrado(String color, double base) {
		super(color, base, base);
		this.base =  base;
	}
	
	@Override
	public double calcularPerimetro() {
	
		return this.base  * 4;
	}

	@Override
	public double calcularArea() {

		return Math.pow(this.base, 2);
	}
	
	public void mostrarInformacion() {
		
		super.mostrarInformacion();
		
	}
	
}

class TrianguloEquilatero extends Figura{

	public TrianguloEquilatero(String color, double lado) {
		super(color);
		this.lado = lado;
	}

	@Override
	public double calcularPerimetro() {

		return 3 * this.lado;
	}

	@Override
	public double calcularArea() {

		return ((Math.sqrt(3)/4) * Math.pow(this.lado,2));
	}
	
	public void mostrarInformacion() {
		
		System.out.println("La informacion del " + this.getClass().getSimpleName() + " es:");
		super.mostrarInformacion();
		System.out.println("Su Area es " + this.calcularArea() + "m2");
		System.out.println("Su Perimetro es " + this.calcularPerimetro() + "m");
		System.out.println("=============================================\n");
		
		
	}
	
	protected double lado;
	
}

class TrianguloCarton extends TrianguloEquilatero{

	public TrianguloCarton(String color, double lado, double grosorCarton) {
		super(color, lado);
		this.grosorCarton = grosorCarton;
	}
	
	public boolean esReforzado() {
		
		boolean refuerzo = false;
		
		 if(this.grosorCarton > 3) refuerzo = true;

		 return refuerzo;
	}
	
	public void mostrarInformacion() {
		
		super.mostrarInformacion();
		System.out.println("El refuerzo es " + this.grosorCarton);
		
	}
	
	protected double grosorCarton;
}

class Cirulo extends Figura{
	
	public Cirulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}
	@Override
	public double calcularPerimetro() {
	
		return 2 * Math.PI * this.radio;
	}
	
	@Override
	public double calcularArea() {
	
		return Math.PI * Math.pow(radio, 2);
	}
	
	
	public void mostrarInformacion() {
		
		System.out.println("La informacion del " + this.getClass().getSimpleName() + " es:");
		super.mostrarInformacion();
		System.out.println("Su Area es " + this.calcularArea() + "m2");
		System.out.println("Su Perimetro es " + this.calcularPerimetro() + "m");
		System.out.println("=============================================\n");
		
	}

	private double radio;
}
	

