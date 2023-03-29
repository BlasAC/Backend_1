package guide05.exercises;

import java.util.Scanner;
/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,	sus columnas y sus diagonales son idénticas.
	Crear un programa que permita introducir un cuadrado por teclado y	determine si este cuadrado es mágico o no.
	El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.
*/
public class Exercise06 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int arraySize, magicArray[][];
		
		System.out.print("Indique el orden de la matriz (n > 0): ");
		arraySize = scan.nextInt();
		
		magicArray = new int[arraySize][arraySize];
		
		fillArray(magicArray);
		showArray(magicArray);
		
		if(validateMagicArray(magicArray)) {
			System.out.println("\nLa matriz es mágica!\n\n");
		} else {
			System.out.println("\nLa matriz no es mágica.\n\n");
		}
	}
	
	static boolean validateMagicArray(int[][] array) {
		
		int primaryDiagonalSum = 0,
			secondaryDiagonalSum = 0,
			rowSum, columnSum;
		
		boolean valid;
		
		for (int i = 0; i < array.length; i++) {
			primaryDiagonalSum += array[i][i];
			secondaryDiagonalSum += array[i][array.length - 1 - i];
		}
		
		valid = primaryDiagonalSum == secondaryDiagonalSum;
		
		for (int k = 0; valid && k < array.length; k++) {
			for (int i = 0; valid && i < array.length; i++) {
				rowSum = 0;
				columnSum = 0;
				
				for (int j = 0; j < array.length; j++) {
					rowSum += array[i][j];
					columnSum += array[j][i];
				}
				valid = rowSum == columnSum && rowSum == primaryDiagonalSum;
			}
		}
		return valid;
	}
	
	static void fillArray(int[][] array) {
		
		boolean[] usedNumbers = new boolean[array.length * array.length];
		int nextInt, maxNumber = array.length * array.length;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.printf("Ingrese número para posición [%d][%d]:\n", i, j);
				
				while (!((nextInt = scan.nextInt()) > 0 && nextInt <= maxNumber && !(usedNumbers[nextInt - 1]))); //La tentación fue muy grande :$
				
				usedNumbers[nextInt - 1] = true;
				array[i][j] = nextInt;
			}
		}
	}
	
	static void showArray(int[][] array) {
		System.out.println("");
		for (int[] row : array) {
			for (int element : row) {
				System.out.printf(" [%d] ", element);
			}
			System.out.println("");
		}
		System.out.println("");
	}
}
