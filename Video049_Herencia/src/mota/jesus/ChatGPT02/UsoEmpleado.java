package mota.jesus.ChatGPT02;

public class UsoEmpleado {

	public static void main(String[] args) {


		Empleado[] empleados = new Empleado[4];
		
		empleados[0] = new EmpleadoPorHoras("Julian", "51931224F", 1800.23, 10);
		empleados[1] = new EmpleadoTiempoCompleto("Gabriel", "Y0551078N", 2400.34);
		empleados[2] = new EmpleadoTiempoCompleto("Ana", "Y0526789N", 5400.34);
		empleados[3] = new EmpleadoPorHoras("Antonio", "Y0551078N", 2400.34,25);
		
		for (Empleado empleado : empleados) {
			empleado.mostrarDatos();
		}

	}

}
