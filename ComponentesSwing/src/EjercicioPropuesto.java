

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class EjercicioPropuesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFMarco mimarco = new JFMarco();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class JFMarco extends JFrame{

	public JFMarco() throws HeadlessException {
		super();
		
		setBounds(600, 300, 600, 400);
		
		add(new JPLamina());
		
		setVisible(true);
	}
	
}

class JPLamina extends JPanel{

	public JPLamina() {
		super();
		
		setLayout(new BorderLayout());
		
		JPanel jpSuperior = new JPanel();
		
		jlNombre = new JLabel("Nombre");
		
		jlApellidos = new JLabel("Apellidos");
		
		txtNombre = new JTextField(10);
		
		txtApellidos = new JTextField(10);
		
		jpSuperior.add(jlNombre);
		
		jpSuperior.add(txtNombre);
		
		jpSuperior.add(jlApellidos);
		
		jpSuperior.add(txtApellidos);
		
		JPanel jpCentral = new JPanel();
		
		txtArea = new JTextArea(10,31);
		
		scrArea = new JScrollPane(txtArea);
		
		txtArea.setLineWrap(true);
		
		jpCentral.add(add(scrArea));
		
		JPanel jpInferior = new JPanel();
		
		btnUno = new JButton("Boton 1");
		
		btnDos = new JButton("Boton 2");
		
		jpInferior.add(btnUno);
		
		jpInferior.add(btnDos);
		
		btnUno.addActionListener(new estado());
		
		btnDos.addActionListener(new estado());
		
		chkUno = new JCheckBox("Check 1");
		
		chkDos = new JCheckBox("Check 2");
		
		chkUno.setSelected(true);
		
		jpInferior.add(chkUno);
		
		jpInferior.add(chkDos);
		
		chkUno.addActionListener(new estado());
		
		chkDos.addActionListener(new estado());
		
		btngUno = new ButtonGroup();
		
		rbtnUno = new JRadioButton("Opcion 1");

		rbtnDos = new JRadioButton("Opcion 2");
		
		btngUno.add(rbtnUno);
		
		btngUno.add(rbtnDos);
		
		jpInferior.add(rbtnUno);
		
		jpInferior.add(rbtnDos);
		
		rbtnUno.addActionListener(new estado());
		
		rbtnDos.addActionListener(new estado());
		
		add(jpSuperior, BorderLayout.NORTH);
		
		add(jpCentral, BorderLayout.CENTER);
		
		add(jpInferior, BorderLayout.SOUTH);
	}
	
	private class estado implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			if(contador != 0) {
				
				if(e.getSource()==btnUno)txtArea.setText(txtArea.getText() + "Has pulsado el boton 1\n");
				
				if(e.getSource()==btnDos)txtArea.setText(txtArea.getText() + "Has pulsado el boton 2\n");
				
				if(e.getSource()==chkUno) {
				
					if (chkUno.isSelected()) {
						txtArea.setText(txtArea.getText() + "El checkbox 1 está activado\n");
					} else {
						txtArea.setText(txtArea.getText() + "El checkbox 1 está desactivado\n");
					}
				}
				
				if(e.getSource()==chkDos) {
					
					if (chkDos.isSelected()) {
						txtArea.setText(txtArea.getText() + "El checkbox 2 está activado\n");
					} else {
						txtArea.setText(txtArea.getText() + "El checkbox 2 está desactivado\n");
					}
				}
				
				if(e.getSource()==rbtnUno) {
					
					if (rbtnUno.isSelected()) {
						txtArea.setText(txtArea.getText() + "El radiobutton 1 está activado\n");
						txtArea.setText(txtArea.getText() + "El radiobutton 2 está desactivado\n");
					} else {
						txtArea.setText(txtArea.getText() + "El radiobutton 1 está desactivado\n");
						txtArea.setText(txtArea.getText() + "El radiobutton 2 está activado\n");
					}
				}
				
				if(e.getSource()==rbtnDos) {
					
					if (rbtnDos.isSelected()) {
						txtArea.setText(txtArea.getText() + "El radiobutton 2 está activado\n");
						txtArea.setText(txtArea.getText() + "El radiobutton 1 está desactivado\n");
					} else {
						txtArea.setText(txtArea.getText() + "El radiobutton 2 está desactivado\n");
						txtArea.setText(txtArea.getText() + "El radiobutton 1 está activado\n");
					}
				}
				
			}else {
				
				txtArea.setText(txtNombre.getText() + " " + txtApellidos.getText() + "\n");
				
				if(e.getSource()==btnUno)txtArea.setText(txtArea.getText() + "Has pulsado el boton 1\n");
				
				if(e.getSource()==btnDos)txtArea.setText(txtArea.getText() + "Has pulsado el boton 2\n");
				
				if(e.getSource()==chkUno) {
					
					if (chkUno.isSelected()) {
						txtArea.setText(txtArea.getText() + "El checkbox 1 está activado\n");
					} else {
						txtArea.setText(txtArea.getText() + "El checkbox 1 está desactivado\n");
					}
				}
				
				if(e.getSource()==chkDos) {
					
					if (chkDos.isSelected()) {
						txtArea.setText(txtArea.getText() + "El checkbox 2 está activado\n");
					} else {
						txtArea.setText(txtArea.getText() + "El checkbox 2 está desactivado\n");
					}
				}
				
				if(e.getSource()==rbtnUno) {
					
					if (rbtnUno.isSelected()) {
						txtArea.setText(txtArea.getText() + "El radiobutton 1 está activado\n");
						txtArea.setText(txtArea.getText() + "El radiobutton 2 está desactivado\n");
					} else {
						txtArea.setText(txtArea.getText() + "El radiobutton 1 está desactivado\n");
						txtArea.setText(txtArea.getText() + "El radiobutton 2 está activado\n");
					}
				}
				
				if(e.getSource()==rbtnDos) {
					
					if (rbtnDos.isSelected()) {
						txtArea.setText(txtArea.getText() + "El radiobutton 2 está activado\n");
						txtArea.setText(txtArea.getText() + "El radiobutton 1 está desactivado\n");
					} else {
						txtArea.setText(txtArea.getText() + "El radiobutton 2 está desactivado\n");
						txtArea.setText(txtArea.getText() + "El radiobutton 1 está activado\n");
					}
				}

				contador += 1;
			}
		}
		
	}
	
	private JLabel jlNombre, jlApellidos;
	
	private JTextField txtNombre, txtApellidos;
	
	private JTextArea txtArea;
	
	private JButton btnUno,btnDos;
	
	private JCheckBox chkUno, chkDos;
	
	private JRadioButton rbtnUno, rbtnDos;
	
	private JScrollPane scrArea;
	
	private ButtonGroup btngUno;
	
	private int contador = 0;
	
	
}