package JComboBox_Ejemplo;


import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class JComboBox_Ejemplo {

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
		
		setLayout(new BorderLayout());
		
		texto = new JLabel("En breve aprenderemos JavaFX");
		
		texto.setFont(new Font("Serif", Font.PLAIN, 18));
		
		add(texto,BorderLayout.CENTER);
		
		JPanel superior = new JPanel();
		
		combo = new JComboBox();
		
		combo.addItem("Serif");
		
		combo.addItem("Tahoma");
		
		combo.addItem("Arial");
		
		combo.addItem("Verdana");
		
		combo.addActionListener(new actionCombo());
		
		superior.add(combo);
		
		add(superior, BorderLayout.NORTH);
		
	}
	
	private class actionCombo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			texto.setFont(new Font((String) combo.getSelectedItem(),Font.PLAIN,18));
		}
		
	}

	private JComboBox combo;
	
	private JLabel texto;
	
}