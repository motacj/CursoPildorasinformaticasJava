package JCheckBox_ejemplo;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class JCheckBox_Ejemplo_I {

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
		
		add(new jpLamina_I());//Creamos lo JPanel en el JFrame y los añade
		
		setVisible(true);
	}
	
}

//Definimos los JPanel

class jpLamina_I extends JPanel{

	public jpLamina_I() {
		super();
		
		setLayout(new BorderLayout());//Definimos el Borderlayout del JPanel principal
		
		Font ftFuente = new Font("Arial", Font.PLAIN, 40);//Definimos la fuente instanciando una class tipo Font
		
		lbltexto = new JLabel("Titulo");//Instanciamos JLabel
		
		lbltexto.setFont(ftFuente);//Mosifica la fuente con el metodo setFont()
		
		JPanel jpSuperior = new JPanel();//Creamos e instanciamos los JPanel 
		
		JPanel jpInferior = new JPanel();//Creamos e instanciamos los JPanel 
		
		jpSuperior.add(lbltexto);//Añadimos el JLabel y lo colocamos en la parte Norte del BorderLayaout
		
		chkNegrita = new JCheckBox("Nefgrita");//Instanciamos los checkbox
		
		chkCursiva = new JCheckBox("Cursiva");//Instanciamos los checkbox
		
		chkNegrita.addActionListener(new manipulaChk());//Se ponen a la escucha
		
		chkCursiva.addActionListener(new manipulaChk());//Se ponen a la escucha
		
		jpInferior.add(chkCursiva);//Añadimos los Checkbox a su correcpondiente JPanel
		
		jpInferior.add(chkNegrita);//Añadimos los Checkbox a su correcpondiente JPanel
		
		add(jpSuperior, BorderLayout.NORTH);//Añadimos cada uno de los JPanel al JPanel principal
		
		add(jpInferior, BorderLayout.SOUTH);//Añadimos cada uno de los JPanel al JPanel principal
		
	}
	
	private class manipulaChk implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int negrita_cursiva = Font.PLAIN;
			
			if(chkNegrita.isSelected())negrita_cursiva+=Font.BOLD;
			
			if(chkCursiva.isSelected())negrita_cursiva+=Font.ITALIC;

			lbltexto.setFont(new Font("Arial", negrita_cursiva, 40));
		}
		
	}
		
	private JLabel lbltexto;//Creamos un JLabel
	
	private JCheckBox chkNegrita,chkCursiva;//Creamos los Checkbox
	
}


