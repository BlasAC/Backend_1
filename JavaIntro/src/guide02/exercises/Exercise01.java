package guide02.exercises;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma
*/
public class Exercise01 {
	
	//Instanciación del Scanner fuera del main para que sea accesible desde cualquier ámbito dentro de la clase.
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int number1, number2;
		
		System.out.print("Ingrese el primer número: ");
		number1 = scan.nextInt();
		System.out.print("Ingrese el segundo número: ");
		number2 = scan.nextInt();
		
		System.out.printf("\n%d + %d = %d\n", number1, number2, number1 + number2);
	}
}
