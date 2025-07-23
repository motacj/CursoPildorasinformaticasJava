package mota.jesus.POOI;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		
		Empleados empleado01 = new Empleados("Jesus Mota Campayo");
		Empleados empleado02 = new Empleados("Ramon Sanchez Arevalo");
		Empleados empleado03 = new Empleados("Alberto Sanchez Arevalo");
		
		System.out.println(empleado01.getDatosEmpleado());
		

		
		empleado01.setSeccion("RRHH");
		//En un principio no queremos que se modifique el atributo nombre
		//Para ello le ponemos la sentencia FINAL al declararlo y lo convertimos asi en CONSTANTE
		//nuevo.setNombre("Alberto Sanchez");
		System.out.println(empleado01.getDatosEmpleado());
		System.out.println(empleado02.getDatosEmpleado());	
		System.out.println(empleado03.getDatosEmpleado());	
		
		System.out.println(Empleados.getIdSiguiente());

	}

}	
	class Empleados{
		//Si aqui incluimos FINAL se convertira en una CONSTANTE y no podra ser modificada por nadie a pesar de estar sel setNombre()	
		//private final String nombre;
		private String nombre;
			
		private String seccion;
		
		private int Id;
		
		private static int IdSiguiente = 1;

		public Empleados(String pNombre) {
			this.nombre = pNombre;
			this.seccion = "Administración";
			this.Id = IdSiguiente;
			IdSiguiente++;
		}

		/*
		 * public void setNombre(String nombre) {
		 * this.nombre = nombre;
		}
		 */
			

		public void setSeccion(String seccion) {
			this.seccion = seccion;
		}
		
		public String getDatosEmpleado() {
			
			return "El empleado " + this.nombre + " pertenece ala sección de " + this.seccion + " y tiene el numero " + this.Id;
		}
		//Solo puede acceder a variables static
		public static String getIdSiguiente() {
			return "El Id del siguiente empleado sera: " + IdSiguiente;
		}
			
	}
			

