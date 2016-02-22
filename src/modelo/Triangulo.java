package modelo;

/**
 * 
 * @author Jonathan Lozano
 *
 */
public class Triangulo implements Figuras {

	/**
	 * Se calcula y devuelve el area de  un triangulo
	 */
	@Override
	public double areas(float lado, float base, float altura, float radio) {
		return (base * altura) / 2;
	}

	/**
	 * Se calcula y devuelve el perimetro de un triangulo
	 */
	@Override
	public double perimetros(float valor1, float valor2, float valor3) {
		return valor1 * 3;
	}

}
