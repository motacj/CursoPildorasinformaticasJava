package atom.susej;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;


public class UsoGridLayouts_calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaroConGrid miMarco=new MaroConGrid();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}

}

class MaroConGrid extends JFrame{
	
	
	public MaroConGrid(){
		
		setTitle("Calculadora");
		
		setBounds(600,350,300,300);
		
		PanelPantalla pantalla=new PanelPantalla();
		
		add(pantalla);

	}
	
}

class PanelPantalla extends JPanel{

	public PanelPantalla() {
		super();
		
		bandera = true;
		
		setLayout(new BorderLayout());
		
		pantalla = new JTextField("0");
		
		Font fuente = new FontUIResource("Arial", Font.BOLD, 25);
		
		pantalla.setHorizontalAlignment(JTextField.RIGHT);
		
		pantalla.setFont(fuente);
		
		add(pantalla, BorderLayout.NORTH);		
		
		numeracion = new JPanel();
		
		numeracion.setLayout(new GridLayout(4,4));
		
		InsertarNumero insertar = new InsertarNumero();
		
		Operacion relizarOperacion = new Operacion();
		
		ponerBoton("7",insertar);
		ponerBoton("8",insertar);
		ponerBoton("9",insertar);
		ponerBotonOperaciones("x",relizarOperacion);
		
		ponerBoton("4",insertar);
		ponerBoton("5",insertar);
		ponerBoton("6",insertar);
		ponerBotonOperaciones("-",relizarOperacion);
		
		ponerBoton("1",insertar);
		ponerBoton("2",insertar);
		ponerBoton("3",insertar);
		ponerBotonOperaciones("+",relizarOperacion);
		
		ponerBoton("0",insertar);
		ponerBoton(".",insertar);
		ponerBotonOperaciones("=",relizarOperacion);
		ponerBotonOperaciones("/",relizarOperacion);
		
		add(numeracion, BorderLayout.CENTER);

	}
	
	private  void ponerBoton ( String textBoton, InsertarNumero oyente) {
		
		JButton boton = new JButton(textBoton);
		
		boton.addActionListener(oyente);
		
		numeracion.add(boton);
		
	}
	
	private  void ponerBotonOperaciones ( String textBoton, Operacion oyente) {
		
		JButton boton = new JButton(textBoton);
		
		boton.addActionListener(oyente);
		
		numeracion.add(boton);
		
	}
	
	private class InsertarNumero implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String entrada = e.getActionCommand();
		
		if(bandera) {
			
			pantalla.setText(entrada);
			
			bandera = false;
			
		} else {

		pantalla.setText(pantalla.getText() + entrada);

		}
		
		ultimoValor = Double.parseDouble(pantalla.getText());
	
	}
}
	private class Operacion implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String operacionPulsada=e.getActionCommand();
			
			if (operacionPulsada.equals("+")) {
			
				resultado+=ultimoValor;
			
				pantalla.setText("" + resultado);
				
				ultimaOperacion="+";
			
			}else if(operacionPulsada.equals("-")) {
				
				double valor=Double.parseDouble(pantalla.getText());
				
				if(contador==0) resultado=valor;
				
				else { resultado-=ultimoValor;}
				
				pantalla.setText("" + resultado);
				
				ultimaOperacion="-";
				
				contador++;
				
				
			}else if(operacionPulsada.equals("x")) {
				
				double valor=Double.parseDouble(pantalla.getText());
				
				if(contador==0) resultado=valor*1;
				
				else { resultado*=ultimoValor;}
				
				pantalla.setText("" + resultado);
				
				ultimaOperacion="x";
				
				contador++;
			}
			
			else if(operacionPulsada.equals("/")) {
				
				double valor=Double.parseDouble(pantalla.getText());
				
				if(contador==0) resultado=valor;
				
				else { resultado/=ultimoValor;}
				
				pantalla.setText("" + resultado);
				
				ultimaOperacion="/";
				
				contador++;
			}
		
			else {
				
				if(ultimaOperacion.equals("+")) resultado+=ultimoValor; 
				if(ultimaOperacion.equals("-")) resultado-=ultimoValor; contador=0;
				if(ultimaOperacion.equals("x")) resultado*=ultimoValor; contador=0;
				if(ultimaOperacion.equals("/")) resultado/=ultimoValor; contador=0;
				
				pantalla.setText("" + resultado);
				
				ultimoValor=0;
				
			}				
				
			bandera=true;			
			
		}
		private String ultimaOperacion;
		private int contador;
		
	}
	
	private JPanel numeracion;
	
	private JTextField pantalla;
	
	private boolean bandera;
	
	private String ultimaOperacion = "";
	
	private double resultado, ultimoValor;
}

