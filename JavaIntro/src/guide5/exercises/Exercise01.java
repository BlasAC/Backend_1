package guide5.exercises;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>
	
	Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.
 */
public class Exercise01 {
	
	static final int QUANTITY = 100;

	public static void main(String[] args) {
		
		int[] vector = new int[QUANTITY];
		
		//Si bien se puede llenar y mostrar directamente en orden descendente, decidí llenarlo en orden ascendente y mostrarlo luego en orden inverso.
		for (int i = 0; i < vector.length; i++) {
			vector[i] = i + 1;
		}
		
		for (int i = vector.length - 1; i >= 0; i--) {
			System.out.println("El valor del vector es [" + vector[i] + "]");
		}
	}
}
