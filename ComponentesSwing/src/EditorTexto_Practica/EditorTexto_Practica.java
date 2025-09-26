package EditorTexto_Practica;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;

public class EditorTexto_Practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JframePrincipal mimarco = new JframePrincipal();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class JframePrincipal extends JFrame {

	public JframePrincipal() throws HeadlessException {
		super();

		setBounds(600, 300, 600, 480);

		add(new JpanelPrincipal());

		setVisible(true);
	}

}

class JpanelPrincipal extends JPanel {

	public JpanelPrincipal() {
		super();

		// -----------definimos el Layout del Jpanel--------------------

		setLayout(new BorderLayout());

		// -----------definimos los Jmenu y los añadimos a la barra--------------------

		miBarra = new JMenuBar();

		// -----------definimos los JmenuItem y los añadimos a la
		// Jmenu--------------------

		miEstilo = new JMenu("Estilo");

		miFuente = new JMenu("Fuente");

		miTamanho = new JMenu("Tamaño");

		miBarra.add(miEstilo);

		miBarra.add(miFuente);

		miBarra.add(miTamanho);

		anhadirMenu("miEstilo", "Negrita", "", Font.BOLD, 12);

		anhadirMenu("miEstilo", "Cursiva", "", Font.ITALIC, 12);

		anhadirMenu("miFuente", "Arial", "Arial", 1, 12);

		anhadirMenu("miFuente", "Verdana", "Verdana", 1, 12);

		anhadirMenu("miFuente", "Courier", "Courier", 1, 12);

		anhadirMenu("miTamanho", "12", "", 1, 12);

		anhadirMenu("miTamanho", "14", "", 1, 14);

		anhadirMenu("miTamanho", "24", "", 1, 24);

		anhadirMenu("miTamanho", "26", "", 1, 26);

		// -----------Instanciamos Jtextpane-------------------

		miTexto = new JTextPane();

		miScroll = new JScrollPane(miTexto);

		// ------------Instanciamos JtoolBar y añadimos los botones--------------------

		miCinta = new JToolBar();

		miCinta.setOrientation(JToolBar.VERTICAL);

		anahadirBtnCinta("Negrita", "src\\EditorTExto_Practica\\btnNegrita.png");

		anahadirBtnCinta("Cursiva", "src\\EditorTExto_Practica\\btnCursiva.jpg");

		anahadirBtnCinta("Centrada", "src\\EditorTExto_Practica\\btnCentral.png");

		anahadirBtnCinta("Derecha", "src\\EditorTExto_Practica\\btnDerecha.png");

		anahadirBtnCinta("Izquierda", "src\\EditorTExto_Practica\\btnIzquierda.png");

		anahadirBtnCinta("Azul", "src\\EditorTExto_Practica\\btnAzul.png");

		anahadirBtnCinta("Rojo", "src\\EditorTExto_Practica\\btnRojo.png");

		anahadirBtnCinta("Verde", "src\\EditorTExto_Practica\\btnVerde.png");

		// -----------añadimos la barra en el cuadrante del BorderLayout que nos
		// interese--------------------

		add(miBarra, BorderLayout.NORTH);

		add(miScroll, BorderLayout.CENTER);

		add(miCinta, BorderLayout.WEST);

	}

	private void anhadirMenu(String miJMenu, String miJMenuItem, String miLetra, int miJEstilo, int miJTamanho) {
		// --------------------Añadimos los jMenuItems segun el valor
		// menu---------------------------
		this.miJMenuItem = new JMenuItem(miJMenuItem);

		if (miJMenu == "miFuente") {

			miFuente.add(this.miJMenuItem);

			this.miJMenuItem.addActionListener(new StyledEditorKit.FontFamilyAction("Cambia Letra", miLetra));
		}

		else if (miJMenu == "miEstilo") {

			miEstilo.add(this.miJMenuItem);

			if (miJEstilo == Font.BOLD)
				
				this.miJMenuItem.addActionListener(new StyledEditorKit.BoldAction());
			
			else if (miJEstilo == Font.ITALIC)
				
				this.miJMenuItem.addActionListener(new StyledEditorKit.ItalicAction());
		}

		else if (miJMenu == "miTamanho") {

			miTamanho.add(this.miJMenuItem);

			this.miJMenuItem.addActionListener(new StyledEditorKit.FontSizeAction("Cambio de tamaño", miJTamanho));
		}
	}

	private void anahadirBtnCinta(String btn, String icon) {

		nuevoBtn = new JButton("", new ImageIcon(icon));

		if (btn.equals("Negrita")) {

			nuevoBtn.addActionListener(new StyledEditorKit.BoldAction());

			miCinta.add(nuevoBtn);

		} else if (btn.equals("Cursiva")) {

			nuevoBtn.addActionListener(new StyledEditorKit.ItalicAction());

			miCinta.add(nuevoBtn);

		} else if (btn.equals("Centrada")) {

			nuevoBtn.addActionListener(
					new StyledEditorKit.AlignmentAction("center-align", StyleConstants.ALIGN_CENTER));

			miCinta.add(nuevoBtn);

		} else if (btn.equals("Derecha")) {

			nuevoBtn.addActionListener(new StyledEditorKit.AlignmentAction("right-align", StyleConstants.ALIGN_RIGHT));

			miCinta.add(nuevoBtn);

		} else if (btn.equals("Izquierda")) {

			nuevoBtn.addActionListener(new StyledEditorKit.AlignmentAction("left-align", StyleConstants.ALIGN_LEFT));

			miCinta.add(nuevoBtn);

		} else if (btn.equals("Azul")) {

			nuevoBtn.addActionListener(new StyledEditorKit.ForegroundAction("azul", Color.BLUE));

			miCinta.add(nuevoBtn);

		} else if (btn.equals("Rojo")) {

			nuevoBtn.addActionListener(new StyledEditorKit.ForegroundAction("rojo", Color.RED));

			miCinta.add(nuevoBtn);

		} else if (btn.equals("Verde")) {

			nuevoBtn.addActionListener(new StyledEditorKit.ForegroundAction("verde", Color.GREEN));

			miCinta.add(nuevoBtn);
		}

	};

	private JMenuBar miBarra;

	private JMenu miFuente, miEstilo, miTamanho;

	private JTextPane miTexto;

	private JScrollPane miScroll;

	private JMenuItem miJMenuItem;

	private JToolBar miCinta;

	private JButton nuevoBtn;

}
