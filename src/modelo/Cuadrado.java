package modelo;

/**
 * 
 * @author Jonathan Lozano
 *
 */
public class Cuadrado implements Figuras {

	/**
	 * Se calcula y devuelve el perimetro de un cuadrado
	 */
	@Override
	public double perimetros(float valor1, float valor2, float valor3) {
		return valor1 * 4;
	}

	/**
	 * Se calcula y devuelve el area de un cuadrado
	 */
	@Override
	public double areas(float lado, float base, float altura, float radio) {
		return lado * lado;
	}

	
}
