

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;


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
		

		
	}
	

	
	
}