package guide03.malo;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de tantos asteriscos como indique su valor.
	Por ejemplo:
	5 *****
	3 ***
	11 ***********
	2 **
*/
public class MALO_Exercise10 {

	static Scanner scan = new Scanner(System.in);
	
	static final byte QUANTITY = 4;
	static final byte MIN = 1;
	static final byte MAX = 20;
	
	public static void main(String[] args) {
		
		int[] numbers = new int[QUANTITY];
		
		for (byte i = 0; i < numbers.length; i++) {
			
			System.out.printf("Ingrese un numero entre %d y %d: ", MIN, MAX);
			
			while ((numbers[i] = scan.nextInt()) < MIN || numbers[i] > MAX) {
				System.out.printf("El numero debe estar entre %d y %d, inclusive. Intente nuevamente: ", MIN, MAX);
			}
		}
		
		for (byte i = 0; i < numbers.length; i++) {
			
			System.out.printf("%2d\t", numbers[i]);
			
			for (byte j = 0; j < numbers[i]; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
}
