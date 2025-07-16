package mota.jesus.condicionalesSwitch;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class Condicionales_Switch_Ejemplo01 {

	public static void main(String[] args) {

		int hijos = Integer.parseInt(JOptionPane.showInputDialog("Introduce nº de hijos"));

		switch (hijos) {
		case 0:

			JOptionPane.showMessageDialog(null, "La natalidad es baja, tenlo en cuenta");
			break;

		case 1:

			JOptionPane.showMessageDialog(null, "Por algo se empieza");
			break;

		case 2:

			JOptionPane.showMessageDialog(null, "Tienes la pareja");
			break;

		case 3:

			JOptionPane.showMessageDialog(null, "Veo que te estas animando!");
			break;

		case 4:

			JOptionPane.showMessageDialog(null, "Ya tienes familia numerosa");
			break;

		default:
			
			JOptionPane.showMessageDialog(null, "El gobierno esta contento con tigo");
			break;
		}

	}

}
