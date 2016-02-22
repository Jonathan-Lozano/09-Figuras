package modelo;

/**
 * 
 * @author Jonathan Lozano
 *
 */
public interface Figuras {
		
	/**
	 * 
	 * @param lado
	 * @param base
	 * @param altura
	 * @param radio
	 * @return
	 * Metodo que recibe parametro necesarios para devolver el area de una figura geometrica
	 */
		public double areas(float lado, float base, float altura, float  radio);
		
	/**
	 * 
	 * @param valor1
	 * @param valor2
	 * @param valor3
	 * @return
	 * Metodo que recibe parametros necesarios para devolver el perimetro de una figura geometrica
	 */
		public double perimetros(float valor1, float valor2, float valor3);	
}
