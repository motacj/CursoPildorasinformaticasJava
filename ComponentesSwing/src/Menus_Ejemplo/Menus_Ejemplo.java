package Menus_Ejemplo;


import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class Menus_Ejemplo {

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
		
		JMenuBar miBarra = new JMenuBar();//Contenedor de Menus
		
		//---------------------Añadir los items---------------------------
		
		JMenu archivo = new JMenu("Archivo");//Contenedor de Items
		
		JMenu edicion = new JMenu("Edicion");//Contenedor de Items
		
		JMenu herramientas = new JMenu("Herramientas");//Contenedor de Items
		
		miBarra.add(archivo);
		
		miBarra.add(edicion);
		
		miBarra.add(herramientas);
		
		//---------------------Añadir los SubItems---------------------------
		
		JMenuItem abrir = new JMenuItem("Abrir");//Items
		
		JMenuItem guardar = new JMenuItem("Guardar");//Items
		
		JMenuItem guardarcomo = new JMenuItem("Guardar como...");//Items
		
		abrir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Vamos abrir un archivo");
			}
		});
		
		archivo.add(abrir);
		
		archivo.add(guardar);
		
		archivo.add(guardarcomo);
		
		JMenuItem cortar = new JMenuItem("Cortar");//Items
		
		JMenuItem pegar = new JMenuItem("Pegar");//Items
		
		JMenuItem copiar = new JMenuItem("Copiar");//Items
		
		edicion.add(cortar);
		
		edicion.add(pegar);
		
		edicion.add(copiar);
		
		JMenuItem opciones = new JMenuItem("Opciones");//Items
		
		JMenu preferecias = new JMenu("Preferencias");//Contenedor de Items
		
		herramientas.add(opciones);
		
		herramientas.addSeparator();//Separador de grupos
		
		herramientas.add(preferecias);
		
		JMenuItem generales = new JMenuItem("Generales");//Items
		
		JMenuItem ayuda = new JMenuItem("Ayuda");//Items
		
		preferecias.add(generales);
		
		preferecias.add(ayuda);
		
		//---------------------Añadir los items a la barra---------------------------
		
		add(miBarra, BorderLayout.EAST);
		
	}
	

	
	
}