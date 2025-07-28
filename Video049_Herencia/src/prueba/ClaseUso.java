package prueba;

public class ClaseUso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clase01 clase1 = new Clase03("Juan", "Ramirez", 3, 6, "Calle Avila");
		
		System.out.println(clase1.getDatos());
		
		Clase01 clase2 = new Clase02("Juan", "Ramirez", 3, 6);
		
		System.out.println(clase2.getDatos());
		
		Clase01 clase3 = new Clase01("Juan", 3, 6);
		
		System.out.println(clase3.getDatos());
/*
 * Sobre escribe el metodo getDatos y el que vale es el de new
 * 
 * Para solicitar que se haga el del padre habra que declararlo como super
 * 
 */
		
		Clase02 clase4 = new Clase03("Ana", "Ramirez", 3, 6, "Calle Edinalva");
		
		System.out.println(clase4.getDatos1());//Asi accede al metodo de la Clase02
		
		Clase02 clase5 = new Clase02("Ana", "Ramirez", 3, 6);
		
		System.out.println(clase5.getDatos1());//Asi accede al metodo de la Clase02
	}

}
