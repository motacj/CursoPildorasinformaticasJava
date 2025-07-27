package mota.jesus.Herencia;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clase1 obj = new Clase2();
		
		obj.metodo1();
	}

	class Clase1{
		public void metodo1() {
			System.out.println(datos);
		}
		
		String datos = "datos";
	}
	
	class Clase2 extends Clase1{
		public void metodo1() {
			super.metodo1();
			System.out.println(datos);
		}
		
		String datos = "Muchos datos";
	}
	
}
