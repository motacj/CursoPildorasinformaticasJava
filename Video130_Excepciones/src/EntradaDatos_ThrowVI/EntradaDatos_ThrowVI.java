package EntradaDatos_ThrowVI;

import javax.swing.JOptionPane;
/*
 * Capturar varias excepciones
 */
public class EntradaDatos_ThrowVI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			division();
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("No se puede dividie por 0");
			//e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("No son numeros");
			//e.printStackTrace();
		} finally {
			System.out.println("Esto siempre lo ejecutara");
		}
	}

	private static void division() {
		// TODO Auto-generated method stub
		int num1= Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
		
		int num2= Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
		
		JOptionPane.showMessageDialog(null, "El resultado es: " + num1/num2);
		
	}

}
