package JtextField_ejemplo;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.text.Document;

public class JTextField_Ejemplo_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCuadroTextoI mimarco = new MarcoCuadroTextoI();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoCuadroTextoI extends JFrame{

	public MarcoCuadroTextoI() throws HeadlessException {
		super();
		
		setBounds(600, 300, 600, 400);
		
		add(new LaminaCuadroEvento());
		
		setVisible(true);
	}
	
}

class LaminaCuadroEvento extends JPanel{

	public LaminaCuadroEvento() {
		super();
		
		cuadroTexto = new JTextField(20);
				
		miDocumento = cuadroTexto.getDocument();
		
		miDocumento.addDocumentListener(new EscuchaTexto());
		
		add(cuadroTexto);

		
	}
	
	private class EscuchaTexto implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println("Has insertado un texto");
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println("Has borrado un texto");
			
		}
		
	}
	
	private Document miDocumento;
	
	private JTextField cuadroTexto;
	
	
}