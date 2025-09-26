package JSpinner_Ejemplo;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class JSpinner_Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCuadroTextoI mimarco = new MarcoCuadroTextoI();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoCuadroTextoI extends JFrame{

	public MarcoCuadroTextoI() throws HeadlessException {
		super();
		
		setBounds(600, 300, 600, 400);
		
		add(new LaminaCuadroEvento());
		
		setVisible(true);
	}
	
}

class LaminaCuadroEvento extends JPanel{

	public LaminaCuadroEvento() {
		super();
		
		setLayout(new BorderLayout());
		
		contador = new JSpinner(new SpinnerNumberModel(5,-5,15,1));
		
		add(contador, BorderLayout.SOUTH);
		
		contador.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				System.out.println(contador.getValue());
			}
		});
		
		String[] mes = {"Enero", "Febrero","Marzo"};
		
		JPanel ctdor2 = new JPanel();
		
		contador2 = new JSpinner(new SpinnerListModel(mes));
		
		contador2.setPreferredSize(new Dimension(100, 20));
		
		ctdor2.add(contador2);
		
		add(ctdor2,BorderLayout.NORTH);
		
		contador2.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				System.out.println(contador2.getValue());
			}
		});
		
	}
	

	private JSpinner contador, contador2;
	
}