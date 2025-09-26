package DisposicionLibre;


import java.awt.*;
import javax.swing.*;



public class DisposcionLibreI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoLibre_I mimarco = new MarcoLibre_I();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoLibre_I extends JFrame{

	public MarcoLibre_I() throws HeadlessException {
		super();
		
		setTitle("Disposicion Libre");
		
		setBounds(300, 400, 1000, 350);
		
		add(new JPanelLibre_I());

		setVisible(true);
	}
	
}

class JPanelLibre_I extends JPanel{

	public JPanelLibre_I() {
		super();
		//Definimos el tipo de Layout como libre poniendo null
		setLayout(null);
		
		JButton btn1 = new JButton("Boton 1");
		
		btn1.setBounds(200, 200,100,30);

		add(btn1);
	}
	
}


	

	
	
