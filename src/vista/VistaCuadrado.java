package vista;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Cuadrado;

/**
 * 
 * @author Jonathan Lozano
 *
 */
public class VistaCuadrado extends JFrame implements ActionListener {

	private JTextField txtLado = new JTextField();
	private JButton btnPerimetro = new JButton("Perimetro");
	private JButton btnArea = new JButton("Area");
	private JLabel lblLado = new JLabel("Ingresa el valor del lado");
	private JLabel lblPerimetro = new JLabel("El perimetro es: ");
	private JLabel lblArea = new JLabel("El area es: ");
	private Container cont = getContentPane();
	private Cuadrado c = new Cuadrado();

	/**
	 * Se crea un constructor para crear una ventana
	 */
	public VistaCuadrado() {
		super("Cuadrado");
		setSize(240, 320);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		agregarControles();

	}

	/**
	 * Se agregan los controles a la ventana creada
	 */
	private void agregarControles() {
		cont.setLayout(null);

		lblLado.setBounds(10, 10, 210, 30);
		cont.add(lblLado);

		txtLado.setBounds(10, 40, 210, 30);
		cont.add(txtLado);

		btnPerimetro.setBounds(10, 80, 100, 30);
		btnPerimetro.addActionListener(this);
		cont.add(btnPerimetro);

		btnArea.setBounds(120, 80, 100, 30);
		btnArea.addActionListener(this);
		cont.add(btnArea);
		
		lblPerimetro.setBounds(10, 120, 210, 30);
		cont.add(lblPerimetro);

		lblArea.setBounds(10, 150, 210, 30);
		cont.add(lblArea);
	}

	/**
	 * Se muestra el perimetro o el area segun el boton que se presione
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnPerimetro) {
			lblPerimetro.setText(
					String.format("El perimetro es: %f", c.perimetros(Float.parseFloat(txtLado.getText()), 0, 0)));
		} else if (e.getSource() == btnArea) {
			lblArea.setText(
					String.format("El area es: %f", c.areas(Float.parseFloat(txtLado.getText()), 0, 0, 0)));
		}
	}
}
