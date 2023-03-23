package guide5.extras;

import java.util.Random;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
*/
public class Extra05 {
	
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	
	static final int
			RANDOM_MIN = 0,
			RANDOM_MAX = 9;
	
	public static void main(String[] args) {
		
		int rows, columns, numArray[][];
		
		System.out.println("Indique las dimensiones de la matriz a crear:");
		System.out.print("Filas: ");
		rows = scan.nextInt();
		System.out.print("Columnas: ");
		columns = scan.nextInt();
		
		numArray = new int[rows][columns];
		
		fillArray(numArray);
		showArray(numArray);
	}
	
	static void fillArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(RANDOM_MAX - RANDOM_MIN + 1) + RANDOM_MIN;
			}
		}
	}

	static void showArray(int[][] numArray) {
		for (int i = 0; i < numArray.length; i++) {
			for (int j = 0; j < numArray[i].length; j++) {
				System.out.printf(" [%d]", numArray[i][j]);
			}
			System.out.println("");
		}
	}
}
