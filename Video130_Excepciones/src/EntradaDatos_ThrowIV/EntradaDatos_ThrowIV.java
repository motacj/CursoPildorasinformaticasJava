package EntradaDatos_ThrowIV;

import javax.swing.JOptionPane;


/*
 * Creamos nuestra exception controlada
 */
public class EntradaDatos_ThrowIV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mail = JOptionPane.showInputDialog("Introduce mail");
		
		examinaMail(mail);

	}

	private static void examinaMail(String mail) throws LongitudMialErronea {
		// TODO Auto-generated method stub
		int arroba = 0;
		
		boolean punto = false;
		
		if(mail.length()<=3) {
			
			LongitudMialErronea miException = new LongitudMialErronea("La longitud es incorrecta");
			
			throw miException;

		}
		
		for( int i = 0; i<mail.length(); i++) {
			
			if(mail.charAt(i) == '@') {
				
				arroba++;
			}
			
			if(mail.charAt(i) == '.') {
				
				punto = true;
				
			}
		}
		
		if(arroba == 1 && punto == true) {
			
			JOptionPane.showMessageDialog(null, "Email correcto");
			
		}
	}

}

class LongitudMialErronea extends RuntimeException{
	//Necesita dos constructores
	public LongitudMialErronea() {
		super();
	}
	
	public LongitudMialErronea(String mensajeError) {
		super(mensajeError);
	}
	
}
