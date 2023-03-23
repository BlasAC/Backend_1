package guide4.exercises;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro para que nos
	indique si es o no un número primo, debe devolver true si es primo, sino false.
	Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
	¿Qué son los números primos?
	Básicamente, un número primo es un número natural que tiene solo dos divisores o factores: 1 y el mismo número.
	Es decir, es primo aquel número que se puede dividir por uno y por el mismo número.
	El primer número primo es 2, y hay 25 números primos entre 1 y 100, ellos son:
	2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 y 97.
*/
public class Exercise04 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int number;
		
		System.out.print("Ingrese un número: ");
		
		System.out.printf("\n%d %s\n\n", number = scan.nextInt(), isPrime(number) ? "es primo." : "no es primo.");
	}
	
	static boolean isPrime(int num) {
		//Aprovecho la inicialización para evaluar si num es menor a 2 o si es par. En cuyo caso isPrime se setea en false.
		//Y si num es igual a 2, se setea en true.
		boolean isPrime = !(num < 2 | num % 2 == 0) | num == 2;
		
		//Solo se buscarán posibles divisores impares. La búsqueda se detiene una vez que se encuentra un divisor.
		for (int i = 3; isPrime & i <= Math.sqrt(num); i += 2) {
			isPrime = !(num % i == 0);
		}
		return isPrime;
	}
}
