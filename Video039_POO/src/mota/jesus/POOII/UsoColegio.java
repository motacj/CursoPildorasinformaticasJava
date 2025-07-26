package mota.jesus.POOII;

public class UsoColegio {

	public static void main(String[] args) {

		Colegio SanJavier = new Colegio("San Javier", 200);
		
		Colegio SanLucas = new Colegio("San Javier", 200);
		
		SanJavier.nuevoAlumno("Raul", 5);
		
		SanJavier.nuevoAlumno("Alva", 7.8);
		
		SanJavier.getTodosAlumnos();
		
		SanJavier.setNotaMedia("Alva", 4.5);
		
		SanJavier.setExpulsarAlumno("Alva");
		
		SanJavier.getTodosAlumnos();
		
		System.out.println("*******************************************");
		
		SanLucas.nuevoAlumno("Javier", 8);
		
		SanLucas.nuevoAlumno("Jose", 3.2);
		
		SanLucas.nuevoAlumno("Miguel", 5.2);
		
		SanLucas.getTodosAlumnos();
		
		SanLucas.nuevoAlumno("Mari Jose", 5.2);
		
		SanLucas.setNotaMedia("Miguel", 4.5);
		
		SanLucas.getDatosAlumno("Miguel");
		
		SanLucas.setExpulsarAlumno("Javier");

		SanLucas.getTodosAlumnos();
	}

}
