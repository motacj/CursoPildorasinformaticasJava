package BarraHerramientas_Ejemplo;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;


public class Barra_Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCuadroTextoI mimarco = new MarcoCuadroTextoI();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class MarcoCuadroTextoI extends JFrame{

	public MarcoCuadroTextoI() throws HeadlessException {
		super();
		
		setBounds(600, 300, 600, 400);
		
		milamina = new JPanel();
		
		add(milamina);

		EventoColorFondo colorAzul = new EventoColorFondo("Azul", Color.BLUE, new ImageIcon("src/BarraHerramientas_Ejemplo/java.ico"));
		
		EventoColorFondo colorRojo = new EventoColorFondo("Rojo", Color.RED, new ImageIcon("src/BarraHerramientas_Ejemplo/java.ico"));
		
		EventoColorFondo colorVerde = new EventoColorFondo("Verde", Color.GREEN, new ImageIcon("src/BarraHerramientas_Ejemplo/java.ico"));
		
		barra = new JToolBar();
		
		barra.add(colorAzul);
		
		barra.add(colorRojo);
		
		barra.add(colorVerde);
		
		add(barra,BorderLayout.NORTH);
		
		
	}
		
		private class EventoColorFondo extends AbstractAction{
	
			public EventoColorFondo(String nombre, Color color_fondo, Icon icono) {
				super();
				
				putValue(Action.NAME, nombre);
				
				putValue(Action.SMALL_ICON, icono);
				
				putValue(Action.SHORT_DESCRIPTION, "Ponme la lamina o Jpanel de color " + nombre);
				
				putValue("color_fonod_Jpanel", color_fondo);
			}
	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Color c = (Color)getValue("color_fondo_JPanel");
				
				setBackground(c);
				
				System.out.println("Nombre " + getValue(Action.NAME) + " Descripcion " + getValue(Action.SHORT_DESCRIPTION));
			}
			
		}
		
		private JPanel milamina;
		
		private JToolBar barra;
		
	}


 
	
