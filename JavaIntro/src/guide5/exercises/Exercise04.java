package guide5.exercises;

import java.util.Random;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>
	
	Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.
	La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
public class Exercise04 {
	
	static Random rand = new Random();
	
	static final int
			MIN = 0,
			MAX = 9,
			ARRAY_SIZE = 4;
	
	public static void main(String[] args) {

		int[][] matriz = new int[ARRAY_SIZE][ARRAY_SIZE];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(MAX - MIN + 1) + MIN;
				System.out.printf("[%02d] ", matriz[i][j]);
			}
			System.out.println("");
		}

		System.out.println("");

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("[%02d] ", matriz[j][i]);
			}
			System.out.println("");
		}
		
		System.out.println("");
	}
}
