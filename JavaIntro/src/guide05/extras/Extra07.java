package guide05.extras;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci.
	Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números:
	1, 1, 2, 3, 5, 8, 13, 21, 34, ...
	Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
	La sucesión del número 2 se calcula sumando (1+1)
	Análogamente, la sucesión del número 3 es (1+2),
	Y la del 5 es (2+3),
	Y así sucesivamente…
	La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
	Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
	Fibonaccin = 1 para todo n<=1
	Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba como parámetro
	el valor de “n” y que calcule la serie hasta llegar a ese valor.
	Para conocer más acerca de la serie de Fibonacci consultar el siguiente link: https://quantdare.com/numeros-de-fibonacci/
*/
public class Extra07 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int fibonacciSequence[];
		
		System.out.print("Indique el nivel de la secuencia Fibonacci a calcular: ");
		fibonacciSequence = new int[scan.nextInt() + 1]; //el + 1 es para que el vector tenga al menos una posición si se pide Fibonacci(0)
		
		generateFibonacciSequence(fibonacciSequence);
		
		System.out.printf("Mostrando hasta F(%d):\n", fibonacciSequence.length);
		showVector(fibonacciSequence);
	}
	
	static void showVector(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("F(%d):\t%d\n", i, vector[i]);
		}
		System.out.println("");
	}
	
	static void generateFibonacciSequence(int[] vector) {
		//F(N) = F(N - 1) + F(N - 2), donde (N - 2) sería el menor de ambos sumandos.
		//F(n) = F( n_1 ) + F( n_2 ).
		int n_2 = 0,
			n_1 = 1;
		
		for (int i = 0; i < vector.length; i++) {
			vector[i] = n_2;
			
			//Estas dos líneas se encargan de preparar n_2 para la siguiente vuelta.
			n_1 += n_2;
			n_2 = n_1 - n_2;
		}
	}
}
