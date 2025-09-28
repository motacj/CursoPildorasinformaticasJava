package Streams_I_Practica;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.*;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;

/*
 * Genera la parte grafica del programa
 */

public class Streams_I_Practica_G extends JFrame{

	public Streams_I_Practica_G() throws HeadlessException {
		super();
		
		setBounds(600, 300, 600, 400);
		
		setTitle("Escritura en un archivo");
		
		add(new miJpanel());
		
		setVisible(true);
	}
	
}

class miJpanel extends JPanel{
	
	private JTextArea txtTexto;
	
	private JScrollPane scpScroll;
	
	private JButton btnNuevo;
	
	public miJpanel() {
		super();
		
		setLayout(new BorderLayout());
		
		txtTexto = new JTextArea();
		
		scpScroll = new JScrollPane(txtTexto);

		JPanel pnlBotones = new JPanel();
		

		
		add(scpScroll, BorderLayout.CENTER);
		add(pnlBotones, BorderLayout.SOUTH);
		
		
		
	}
	
	private void anahadirBtnCinta(String btn) {
	
		btnNuevo = new JButton(btn);
	
		if (btn.equals("Leer")) {
	
			btnNuevo.addActionListener(null);
	
		} else if (btn.equals("Cursiva")) {
	
			btnNuevo.addActionListener(null);
	
		} else if (btn.equals("Centrada")) {
	
			btnNuevo.addActionListener(null);
	
		}
	
	}
}
