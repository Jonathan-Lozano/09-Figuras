package vista;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.Triangulo;

/**
 * 
 * @author Jonathan Lozano
 *
 */
public class VistaTriangulo extends JFrame implements ActionListener {

	private JLabel lblBase = new JLabel(
			"<html><body>Ingresa la altura (area) o el valor de los lados (perimetro)</body></html>");
	private JLabel lblAltura = new JLabel("Ingresa la base");

	private JTextField txtBase = new JTextField();
	private JTextField txtAltura = new JTextField();

	private JButton btnPerimetro = new JButton("Perimetro");
	private JButton btnArea = new JButton("Area");

	private JLabel lblPerimetro = new JLabel("El perimetro es: ");
	private JLabel lblArea = new JLabel("El area es: ");

	private Container cont = getContentPane();

	private Triangulo t = new Triangulo();

	/**
	 * Contructor para crear una ventana
	 */
	public VistaTriangulo() {
		super("Triangulo");
		setSize(260, 370);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		cargarControles();
	}

	/**
	 * Metodo que carga los controles a la ventana
	 */
	private void cargarControles() {
		cont.setLayout(null);

		lblBase.setBounds(10, 10, 230, 30);
		cont.add(lblBase);

		txtBase.setBounds(10, 45, 230, 30);
		cont.add(txtBase);

		lblAltura.setBounds(10, 70, 230, 30);
		cont.add(lblAltura);

		txtAltura.setBounds(10, 100, 230, 30);
		cont.add(txtAltura);

		btnPerimetro.setBounds(10, 140, 100, 30);
		btnPerimetro.addActionListener(this);
		cont.add(btnPerimetro);

		btnArea.setBounds(120, 140, 100, 30);
		btnArea.addActionListener(this);
		cont.add(btnArea);

		lblPerimetro.setBounds(10, 170, 210, 30);
		cont.add(lblPerimetro);

		lblArea.setBounds(10, 200, 210, 30);
		cont.add(lblArea);
	}

	/**
	 * Se muestra el perimetro o el area segun el boton que se presione
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnPerimetro) {
			lblPerimetro.setText(
					String.format("El perimetro es: %f", t.perimetros(Float.parseFloat(txtBase.getText()), 0, 0)));
		} else if (e.getSource() == btnArea) {
			lblArea.setText(String.format("El area es: %f",
					t.areas(0, Float.parseFloat(txtBase.getText()), Float.parseFloat(txtAltura.getText()), 0)));
		}
	}
}
