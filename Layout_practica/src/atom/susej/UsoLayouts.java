package atom.susej;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class UsoLayouts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaroConLayout miMarco=new MaroConLayout();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}

}

class MaroConLayout extends JFrame{
	
	
	public MaroConLayout(){
		
		setTitle("Disposiciones");
		
		setBounds(600,350,600,300);
		
		PanelconLayout lamina=new PanelconLayout();
		
		PanelconLayout2 lamina2=new PanelconLayout2();
		
		add(lamina,BorderLayout.SOUTH);
		
		add(lamina2,BorderLayout.NORTH);
	
	}
	
}

class PanelconLayout extends JPanel{
	
		public PanelconLayout(){
			
			//setLayout(new FlowLayout(FlowLayout.CENTER,50, 150));
			
			setLayout(new BorderLayout());
			
			add(new JButton("Amarillo"), BorderLayout.WEST);
			
			add(new JButton("Rojo"), BorderLayout.CENTER);	
			
			add(new JButton("Verde"), BorderLayout.EAST);
		}
}

class PanelconLayout2 extends JPanel{
	
	public PanelconLayout2(){
		
		//setLayout(new FlowLayout(FlowLayout.CENTER,50, 150));
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new JButton("Azul"));	

		add(new JButton("Rosa"));	
		
	}
}

