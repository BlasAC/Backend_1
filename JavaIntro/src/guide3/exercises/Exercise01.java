package guide3.exercises;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crear un programa que dado un número determine si es par o impar.
*/
public class Exercise01 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int number;
		
		//Una asignación realizada dentro de la condición de un if.
		if ((number = scan.nextInt()) % 2 == 0) {
			System.out.printf("\n%d es un numero PAR\n", number);
		} else {
			System.out.printf("\n%d es un numero IMPAR\n", number);
		}
	}
}
