package DisposicionBox;


import java.awt.HeadlessException;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class DisposcionBOX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBox mimarco = new MarcoBox();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoBox extends JFrame{

	public MarcoBox() throws HeadlessException {
		super();
		
		setTitle("Disposicion Box");
		
		setBounds(700, 400, 200, 200);
		
		//---------Primer BOX-------------------------
		
		JLabel nUsuario = new JLabel("Nombre");
		
		JTextField cUsuario = new JTextField(10);
		
		cUsuario.setMaximumSize(cUsuario.getPreferredSize());
		
		Box cajaUsuario = Box.createHorizontalBox();
		
		cajaUsuario.add(nUsuario);
		
		cajaUsuario.add(Box.createHorizontalStrut(10));
		
		cajaUsuario.add(cUsuario);
		
		//---------Segundo BOX-------------------------
		
		JLabel nPass = new JLabel("Contraseña");
		
		JTextField cPass = new JTextField(10);
		
		cPass.setMaximumSize(cUsuario.getPreferredSize());
		
		Box cajaPass = Box.createHorizontalBox();
		
		cajaPass.add(nPass);
		
		cajaPass.add(Box.createHorizontalStrut(10));
		
		cajaPass.add(cPass);
		
		//---------Tercer BOX-------------------------
		
		JButton ok = new JButton("OK");
		
		JButton cancel = new JButton("Cancel");
		
		Box cajaBtn = Box.createHorizontalBox();
		
		cajaBtn.add(ok);
		
		cajaBtn.add(Box.createGlue());
		
		cajaBtn.add(cancel);
		
		//-------------Vertical BOX----------------
		
		Box cajaVertical = Box.createVerticalBox();
		
		cajaVertical.add(cajaUsuario);
		
		cajaVertical.add(cajaPass);
		
		cajaVertical.add(cajaBtn);
		
		add(cajaVertical);

		setVisible(true);
	}
	
}


	

	
	
