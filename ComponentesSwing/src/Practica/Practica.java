package Practica;


import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;


public class Practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco mimarco = new Marco();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco extends JFrame{

	public Marco() throws HeadlessException {
		super();
		
		setBounds(600, 300, 600, 400);
		
		add(new LaminaProcesadorTextos());
		
		setVisible(true);
	}
	
}

class LaminaProcesadorTextos extends JPanel{

	public LaminaProcesadorTextos() {
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
		
		if(menu == "fuente") fuente.add(elemNemu);
		
		else if(menu == "estilo") estilo.add(elemNemu);
		
		else if(menu == "tamanho") tamanho.add(elemNemu);
		
		elemNemu.addActionListener(new GestionaEventos(rotulo,tipoLetra,estilos,tamango));
	}
	
	private class GestionaEventos implements ActionListener{

		public GestionaEventos(String rotulo,String tipoLetra, int estilos, int tamango) {
			super();
			
			this.rotulo = rotulo;
			
			this.tipoLetra = tipoLetra;
			
			this.estilos = estilos;
			
			this.tamango = tamango;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			letraExistente = miArea.getFont();
			
			if(rotulo == "Arial" || rotulo == "Courier" || rotulo == "Verdana") {
				
				estilos = letraExistente.getStyle();
				
				tamango = letraExistente.getSize();	
				
			}else if(rotulo == "Cursiva" || rotulo == "Negrita") {
				
				if(letraExistente.getStyle() == 1 || letraExistente.getStyle() == 2) estilos = 3;
				
				tipoLetra = letraExistente.getFontName();
				
				tamango = letraExistente.getSize();	
				
			}else if(rotulo == "10" || rotulo == "12" || rotulo == "24" || rotulo == "26") {
				
				tipoLetra = letraExistente.getFontName();
				
				estilos = letraExistente.getStyle();
			}
			
			miArea.setFont(new Font(tipoLetra,estilos,tamango)); 
		}
		
		private String rotulo,tipoLetra;
	
		private int estilos, tamango;
	};
	
	private JPanel laminaMenu;
	
	private JMenuBar miBarra;
	
	private JTextPane miArea;
	
	private JMenu estilo,tamanho,fuente;
	
	private JMenuItem elemNemu;
	
	private Font letraExistente;
	
	

	
	
}