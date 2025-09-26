package DisposicionLibre;

import java.awt.*;
import javax.swing.*;

public class DisposcionLibreII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoLibre_II mimarco = new MarcoLibre_II();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoLibre_II extends JFrame {

	public MarcoLibre_II() throws HeadlessException {
		super();

		setTitle("Disposicion Libre");

		setBounds(300, 400, 300, 300);

		add(new JPanelLibre_II());

		setVisible(true);
	}

}

class JPanelLibre_II extends JPanel {

	public JPanelLibre_II() {
		super();
		// Definimos el tipo de Layout como libre poniendo la clase que hemos definido
		// su posicion
		setLayout(new enColumnas());

		JLabel lblNombre = new JLabel("Nombre:");

		JTextField txtNombre = new JTextField();

		JLabel lblPass = new JLabel("Contraseña:");

		JTextField txtPass = new JTextField();
		
		JLabel lblTelefono = new JLabel("Telefono:");

		JTextField txtTelefono = new JTextField();

		add(lblNombre);

		add(txtNombre);

		add(lblPass);

		add(txtPass);

		add(lblTelefono);

		add(txtTelefono);
	}

}

class enColumnas implements LayoutManager {

	@Override
	public void addLayoutComponent(String arg0, Component arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void layoutContainer(Container miContenedor) {
		// TODO Auto-generated method stub
		//Definimos la mitad del contenedor para ubicarlos centrados
		int d = miContenedor.getWidth();
		//Incializamos las coordenadas
		x = d/2;
		
		y = 20;
		// No dice cuanto contenedores tenemos
		int n = miContenedor.getComponentCount();

		int contador = 0;
		// recorremos los componentes
		for (int i = 0; i < n; i++) {
			contador++;
			// Guardamos el componente
			Component c = miContenedor.getComponent(i);
			// Ubicamos el componente
			c.setBounds(x - 100, y, 100, 20);
			// Incrementamos la posicion en x
			x += 100;
			// Para la posicion en y como van por parejas de componentes
			if (contador % 2 == 0) {

				x = d / 2;
				
				y += 20;
			}
		}

	}

	@Override
	public Dimension minimumLayoutSize(Container arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension preferredLayoutSize(Container arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLayoutComponent(Component arg0) {
		// TODO Auto-generated method stub

	}

	// Definimos la posicion del primer contenedor
	private int x;

	private int y;
}
