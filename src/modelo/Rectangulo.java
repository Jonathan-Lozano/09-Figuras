package modelo;

/**
 * 
 * @author Jonathan Lozano
 *
 */
public class Rectangulo implements Figuras {

	/**
	 * Se calcula y devuelve el area de un rectangulo
	 */
	@Override
	public double areas(float lado, float base, float altura, float radio) {
		return base * altura;
	}
	
	/**
	 * Se calcula y devuelve el perimetro de un rectangulo 
	 */
	@Override
	public double perimetros(float valor1, float valor2, float valor3) {
		return (valor1 * 2) + (valor2 * 2);
	}

}
