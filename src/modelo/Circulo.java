package modelo;

/**
 * 
 * @author Jonathan Lozano
 *
 */
public class Circulo implements Figuras{

	/**
	 * Se calcula y devuelve el area de un circulo
	 */
	@Override
	public double areas(float lado, float base, float altura, float radio) {
		return 3.1416 * Math.pow(radio, 2);
	}

	/**
	 * Se calcula y devuelve el perimetro de un circulo
	 */
	@Override
	public double perimetros(float valor1, float valor2, float valor3) {
		return 3.1416 * valor1;
	}

}
