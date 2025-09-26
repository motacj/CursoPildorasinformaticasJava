package JRationButton;


import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class JRationButton_ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jfMarcoCuadroTextoI mimarco = new jfMarcoCuadroTextoI();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class jfMarcoCuadroTextoI extends JFrame{

	public jfMarcoCuadroTextoI() throws HeadlessException {
		super();
		
		setBounds(600, 300, 600, 400);
		
		add(new jpLaminaCuadroEvento());
		
		setVisible(true);
	}
	
}

class jpLaminaCuadroEvento extends JPanel{

	public jpLaminaCuadroEvento() {
		super();
		
		ButtonGroup btngUno = new ButtonGroup();//Creamos e instanciamos el Grupo de botones
		
		btnUno = new JRadioButton("Masculino");//Instanciamos los JRadioButton
		
		btnDos = new JRadioButton("Femenino"); //Instanciamos los JRadioButton
		
		btnTres = new JRadioButton("Neutro");//Instanciamos los JRadioButton
		
		btnUno.addActionListener(new manejaJRadioButton());//Estan a la escucha
		
		btnDos.addActionListener(new manejaJRadioButton());//Estan a la escucha
		
		btnTres.addActionListener(new manejaJRadioButton());//Estan a la escucha
		
		btngUno.add(btnUno);//Añadimos los JRadioButton al grupo
		
		btngUno.add(btnDos);//Añadimos los JRadioButton al grupo
		
		btngUno.add(btnTres);//Añadimos los JRadioButton al grupo
		
		add(btnUno);//Añadimos el JRadioButton
		
		add(btnDos);//Añadimos el JRadioButton
		
		add(btnTres);//Añadimos el JRadioButton
		
	}
	
	private class manejaJRadioButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(btnUno.isSelected()) System.out.println("Has seleccionado el boton Masculino");//Tomando el estado del JRadioButton
			
			if(btnDos.isSelected()) System.out.println("Has seleccionado el boton Femnino");//Tomando el estado del JRadioButton
			
			if(btnTres.isSelected()) System.out.println("Has seleccionado el boton Neutro");//Tomando el estado del JRadioButton
			
			if(e.getSource()==btnUno) System.out.println("Otra forma de recibir el evento");//recibiendo el evento y sabiendo quien lo ha disparado
			
			if(e.getSource()==btnDos) System.out.println("Otra forma de recibir el evento");//recibiendo el evento y sabiendo quien lo ha disparado
			
			if(e.getSource()==btnTres) System.out.println("Otra forma de recibir el evento");//recibiendo el evento y sabiendo quien lo ha disparado
			
		}
		
	}
	
	private JRadioButton btnUno, btnDos, btnTres;//creamos los JRadioButton
}

	
