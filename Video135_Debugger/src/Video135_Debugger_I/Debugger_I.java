package Video135_Debugger_I;

import javax.swing.JOptionPane;

public class Debugger_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de elementos de la matriz"));
		
		int num_aleatorio[] = new int[elementos];
		
		for(int i=0; i<num_aleatorio.length;i++) {
			
			num_aleatorio[i] = (int)(Math.random()*100);
			
		}
		
		for (int i : num_aleatorio) System.out.println(i);
	}

}
