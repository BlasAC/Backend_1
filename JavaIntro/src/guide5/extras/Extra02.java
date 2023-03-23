package guide5.extras;

import java.util.Random;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
*/
public class Extra02 {
	
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	
	static final int RANDOM_MIN = 0;
	static final int RANDOM_MAX = 9;
	
	public static void main(String[] args) {
		
		int[] vector1, vector2;
		
		System.out.print("Indique el tamanio de los vectores: ");
		vector1 = new int[scan.nextInt()];
		vector2 = new int[vector1.length];
		
		fillVector(vector1);
		fillVector(vector2);
		
		showVector(vector1);
		showVector(vector2);
		
		if (areEquals(vector1, vector2)) {
			System.out.println("\nLos vectores son iguales.\n\n");
		} else {
			System.out.println("\nLos vectores son distintos.\n\n");
		}
	}
	
	//En lo personal, prefiero usar variables de tipo lógico por sobre la sentencia break en estos casos.
	static boolean areEquals(int[] vector1, int[] vector2) {
		
		boolean equals = true;
		
		//En el bloque de condición, del bucle for, se evalúa también el valor de equals.
		for (int i = 0; equals && i < vector1.length; i++) {
			equals = vector1[i] == vector2[i];
		}
		
		return equals;
	}
	
	static void showVector(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("[%d] ", vector[i]);
		}
		System.out.println("");
	}
	
	static void fillVector(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			vector[i] = rand.nextInt(RANDOM_MAX - RANDOM_MIN + 1) + RANDOM_MIN;
		}
	}
}
