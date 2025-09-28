package Video130_Excepciones;
import java.io.EOFException;
import java.io.IOException;
import java.util.*;

import javax.swing.JOptionPane;

public class EntradaDatos_ThrowII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mail = JOptionPane.showInputDialog("Introduce mail");
		
		try {
			examinaMail(mail);
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void examinaMail(String mail) throws EOFException {
		// TODO Auto-generated method stub
		int arroba = 0;
		
		boolean punto = false;
		
		if(mail.length()<=3) {
			
			EOFException miExcepcion = new EOFException();
			
			throw miExcepcion;
			
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
