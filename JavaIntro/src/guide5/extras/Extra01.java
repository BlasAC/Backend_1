package guide5.extras;

import java.util.Random;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.
*/
public class Extra01 {
	
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	
	static final int RANDOM_MIN = 0;
	static final int RANDOM_MAX = 9;
	
	public static void main(String[] args) {
		
		int numbers[], sum = 0;
		
		System.out.print("Indique la cantidad delementos del vector: ");
		numbers = new int[scan.nextInt()];
		
		System.out.println("Ingrese los números que llenarán el vector: ");
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt(); //User input
//			sum += numbers[i] = rand.nextInt(RANDOM_MAX - RANDOM_MIN + 1) + RANDOM_MIN; System.out.printf(" [%d] ", numbers[i]); //Random
		}
		
		System.out.printf("\nLa suma de los %d elementos del vector es: %d\n\n", numbers.length, sum);
	}
}
