package JtextField_ejemplo;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTextField_Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoDeTexto mimarco = new MarcoDeTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoDeTexto extends JFrame{

	public MarcoDeTexto() throws HeadlessException {
		super();
		
		setBounds(600, 300, 600, 400);
		
		add(new LaminaDeTexto());
		
		setVisible(true);
	}
	
}

class LaminaDeTexto extends JPanel{

	public LaminaDeTexto() {
		super();
		
		setLayout(new GridLayout(3,1));
		
		cuadroTexto = new JTextField(20);
		
		add(cuadroTexto);
		
		JButton boton = new JButton("Obtener");
		
		boton.addActionListener(new obtenerTexto());
		
		add(boton);
		
		labelTexto = new JLabel();
		
		add(labelTexto);
		
	}
	
	private class obtenerTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String texto = cuadroTexto.getText();
			
			int contador = 0;
			
			for (int i = 0; i < texto.length(); i++) {
				
				if(texto.charAt(i)=='@') contador++;
				
			}
			
			if (contador == 0) labelTexto.setText("EL email incorrecto. No tiene @");
			else if (contador == 1) labelTexto.setText("EL email es correcto");
			else labelTexto.setText("EL email es incorrecto. Tiene mas de una @");

		}
		
	}
	
	private JTextField cuadroTexto;
	
	private JLabel labelTexto;
	
	
}