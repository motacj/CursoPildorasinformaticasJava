package DisposicionSpring;


import java.awt.*;
import javax.swing.*;



public class DisposcionSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoSpring mimarco = new MarcoSpring();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoSpring extends JFrame{

	public MarcoSpring() throws HeadlessException {
		super();
		
		setTitle("Disposicion Spring");
		
		setBounds(300, 400, 1000, 350);
		
		add(new JPanelSpring());

		setVisible(true);
	}
	
}

class JPanelSpring extends JPanel{

	public JPanelSpring() {
		super();
		
		//Instanciamos el tipo de Layout
		
		SpringLayout layout = new SpringLayout();
		
		setLayout(layout);
		
		//Instanciamos botones
		
		JButton btn1  = new JButton("Bonton 1");
		
		JButton btn2  = new JButton("Bonton 2");
		
		JButton btn3  = new JButton("Bonton 3");
		
		//Añadimos botones al JPanel
		
		add(btn1);
		
		add(btn2);
		
		add(btn3);
		
		//Diseñamos el muelle
		
		Spring miMuelle = Spring.constant(0, 10, 20);
		
		//Colocamos el muelle
				
		//Definimos los espacios donde colocaremos los muelles en el Layout entre cada uno de los elementos
		//layout.putConstraint([Origen del destino], [Hasta donde], [el nombre del muelle], [Origen del inicio], [Donde inicia])
		//[Origen del destino] es el lado izquierdo del btn1
		//[Hasta donde] hasta el elemento , en este caso el btn1
		//[el nombre del muelle] el muelle creado, puede ser mas de un tipo de muelle
		//[Origen del inicio] el lado izquierdo del JPanel
		//[Donde inicia] En este caso en el propio JPanel
		
		layout.putConstraint(SpringLayout.WEST, btn1, miMuelle, SpringLayout.WEST, this);
		
		layout.putConstraint(SpringLayout.WEST, btn2, miMuelle, SpringLayout.EAST, btn1);
		
		layout.putConstraint(SpringLayout.WEST, btn3, miMuelle, SpringLayout.EAST, btn2);
		
		layout.putConstraint(SpringLayout.EAST, this, miMuelle, SpringLayout.EAST, btn3);
		
	}
	
}


	

	
	
