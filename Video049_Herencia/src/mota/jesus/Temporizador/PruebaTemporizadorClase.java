package mota.jesus.Temporizador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;

public class PruebaTemporizadorClase {

	public static void main(String[] args) {


		Timer miTemporizador = new Timer(5000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				Date horaActual = new Date();
				
				System.out.println(horaActual);
			}
		});
		
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");

	}

}

