package guide05.extras;

import java.util.Random;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. Después haremos otra función o procedimiento que imprima el vector.
*/
public class Extra03 {

	static Random rand = new Random();
	
	static final int RANDOM_MIN = 0;
	static final int RANDOM_MAX = 9;
	
	static final int ARRAY_SIZE = 5;
	
	public static void main(String[] args) {
		
		int[] numArray = new int[ARRAY_SIZE];
		
		fillVector(numArray);
		showVector(numArray);
	}
	
	static void fillVector(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(RANDOM_MAX - RANDOM_MIN + 1) + RANDOM_MIN;
		}
	}
	
	static void showVector(int[] array) {
		System.out.println("");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("[%d] ", array[i]);
		}
		System.out.println("\n");
	}
}
