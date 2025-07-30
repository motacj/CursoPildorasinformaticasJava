package mota.jesus.Temporizador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;

public class PruebaTemporizador {

	public static void main(String[] args) {
		
		Temporizador oyente = new Temporizador();


		Timer miTemporizador = new Timer(10000, oyente);
		
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");

	}

}

class Temporizador implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Date horaActual = new Date();
		
		System.out.println(horaActual);
	}
	
}
