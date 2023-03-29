package guide05.exercises;

import java.util.Random;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz A es antisimétrica
	cuando ésta es igual a su propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
	La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
*/
public class Exercise05 {
	
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	
	static final int MIN = -4;
	static final int MAX = 4;
	
	public static void main(String[] args) {
		
		int size;
		int [][] array_A;
		boolean isAntisymmetric = true;
		
		System.out.print("Indique el orden de la matriz: ");
		size = scan.nextInt();
		array_A = new int[size][size];
		
		for (int i = 0; i < array_A.length; i++) {
			for (int j = 0; j < array_A[i].length; j++) {
				array_A[i][j] = scan.nextInt();//(rand.nextInt(MAX - MIN + 1) + MIN);
			}
		}
		
		for (int i = 0; i < array_A.length & isAntisymmetric; i++) {
			for (int j = 0; j < array_A[i].length & isAntisymmetric; j++) {
				if (array_A[i][j] != -array_A[j][i]) {
					isAntisymmetric = false;
				}
			}
		}
		
		for (int i = 0; i < array_A.length; i++) {
			for (int j = 0; j < array_A[i].length; j++) {
				System.out.printf(" [%02d] ", array_A[i][j]);
			}
			System.out.print("\t");
			for (int j = 0; j < array_A[i].length; j++) {
				System.out.printf(" [%02d] ", array_A[j][i]);
			}
			System.out.println("");
		}
		
		if (isAntisymmetric) {
			System.out.printf("\nLa matriz es antisimétrica\n\n");
		} else {
			System.out.printf("\nLa matriz no es antisimétrica\n\n");
		}
	}
}
