package JtextField_ejemplo;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTextField_Ejemplo_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCuadroTexto mimarco = new MarcoCuadroTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoCuadroTexto extends JFrame{

	public MarcoCuadroTexto() throws HeadlessException {
		super();
		
		setBounds(600, 300, 600, 400);
		
		add(new LaminaCuadroTExto());
		
		setVisible(true);
	}
	
}

class LaminaCuadroTExto extends JPanel{

	public LaminaCuadroTExto() {
		super();
		
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
			
			labelTexto.setText(cuadroTexto.getText());
			
		}
		
	}
	
	private JTextField cuadroTexto;
	
	private JLabel labelTexto;
	
	
}