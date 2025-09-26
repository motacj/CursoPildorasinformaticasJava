package MenusEmergenes_Ejemplo;


import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;


public class ejemplo {

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
		
		JPopupMenu emergente = new JPopupMenu();
		
		JMenuItem azul = new JMenuItem("Azul");
		
		JMenuItem verde = new JMenuItem("Verde");
		
		JMenuItem rojo = new JMenuItem("Rojo");
		
		azul.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				setBackground(Color.BLUE);
			}
		});
		
		verde.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				setBackground(Color.GREEN);
			}
		});
		
		rojo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				setBackground(Color.RED);
			}
		});
		
		emergente.add(azul);
		
		emergente.add(verde);
		
		emergente.add(rojo);
		
		setComponentPopupMenu(emergente);
		
	}
		
}