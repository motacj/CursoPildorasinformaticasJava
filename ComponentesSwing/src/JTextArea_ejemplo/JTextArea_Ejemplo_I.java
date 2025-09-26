package JTextArea_ejemplo;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class JTextArea_Ejemplo_I {

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
		
		areaTexto = new JTextArea(7,25);
		
		laminaScroll = new JScrollPane(areaTexto);
		
		areaTexto.setLineWrap(true);
				
		add(laminaScroll);
		
		JButton miBoton = new JButton("Push");
		
		add(miBoton);
		
		miBoton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				System.out.println(areaTexto.getText());
				
			}
		});
		
	}
	
	private JTextArea areaTexto;
	
	private JScrollPane laminaScroll;
	
	
}