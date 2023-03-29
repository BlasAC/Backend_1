package guide03.extras;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos,
	la cantidad de números pares y la cantidad de números impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse.
	Nota: recordar el uso de la sentencia break.
*/
public class Extra08 {
	
	static Scanner scan = new Scanner(System.in);
	
	static final int FACTOR = 5;
	
	public static void main(String[] args) {
		
		int number,
			evenNumbers = 0,
			oddNumbers = 0;
		
		do {
			System.out.print("Ingrese un número entero: ");
			number = scan.nextInt();
			
			if (number >= 0) {
				if (number % 2 == 0) {
					evenNumbers++;
				} else {
					oddNumbers++;
				}
			}
		} while (number % FACTOR != 0);
		
		System.out.printf("\nSe ingresaron %d números:\n%d son pares\n%d son impares\n\n", evenNumbers + oddNumbers, evenNumbers, oddNumbers);
	}
}
