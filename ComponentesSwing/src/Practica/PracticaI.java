package Practica;


import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.*;
import javax.swing.text.*;


public class PracticaI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoI mimarco = new MarcoI();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoI extends JFrame{

	public MarcoI() throws HeadlessException {
		super();
		
		setBounds(600, 300, 600, 400);
		
		add(new LaminaProcesadorTextosI());
		
		setVisible(true);
	}
	
}

class LaminaProcesadorTextosI extends JPanel{

	public LaminaProcesadorTextosI() {
		super();
		
		setLayout(new BorderLayout());//Definimos el Layout de LaminaProcesadorTextos
		
		laminaMenu = new JPanel();//Instanciamos el panel del menu
		
		miBarra = new JMenuBar();//Instanciamos la barra del menu
		
		miArea = new JTextPane();//Instanciamos la area del texto

		//---------------------Añadir los items---------------------------
		
		estilo = new JMenu("Estilo");
		
		fuente = new JMenu("Fuente");
		
		tamanho = new JMenu("Tamaño");
		
		//---------------------Añadir los items a la barra---------------------------		
		
		miBarra.add(estilo);
		
		miBarra.add(fuente);
		
		miBarra.add(tamanho);
		
		//---------------------Añadir los items a los menus por metodo---------------------------

		configurarMenu("Negrita", "estilo", "", Font.BOLD, 12);
		configurarMenu("Cursiva", "estilo", "", Font.ITALIC, 12);
		configurarMenu("Arial", "fuente", "Arial", 1, 12);
		configurarMenu("Verdana", "fuente", "Verdana", 1, 12);
		configurarMenu("Courier", "fuente", "Courier", 1, 12);
		configurarMenu("10", "tamanho", "", 1, 10);
		configurarMenu("12", "tamanho", "", 1, 12);
		configurarMenu("24", "tamanho", "", 1, 24);
		configurarMenu("26", "tamanho", "", 1, 26);
		
		
		
		add(miBarra, BorderLayout.NORTH);
		
		add(new JScrollPane(miArea), BorderLayout.CENTER);
		
	}
	
	public void configurarMenu(String rotulo, String menu, String tipoLetra, int estilos, int tamango) {
		
		//--------------------Añadimos los jMenuItems segun el valor menu---------------------------
		elemNemu = new JMenuItem(rotulo);
		
		if(menu == "fuente") {
			
			fuente.add(elemNemu);
			
			elemNemu.addActionListener(new StyledEditorKit.FontFamilyAction("Cambia Letra", tipoLetra));
		}
		
		else if(menu == "estilo") {
			
			estilo.add(elemNemu);
			
			if(estilos == Font.BOLD)elemNemu.addActionListener(new StyledEditorKit.BoldAction());
			else if(estilos == Font.ITALIC)elemNemu.addActionListener(new StyledEditorKit.ItalicAction());
		}
		
		else if(menu == "tamanho") {
			
			tamanho.add(elemNemu);
			
			elemNemu.addActionListener(new StyledEditorKit.FontSizeAction("Cambio de tamaño", tamango));
		}
		
		
	}
	
	
	
	private JPanel laminaMenu;
	
	private JMenuBar miBarra;
	
	private JTextPane miArea;
	
	private JMenu estilo,tamanho,fuente;
	
	private JMenuItem elemNemu;
	
	private Font letraExistente;
	
	

	
	
}