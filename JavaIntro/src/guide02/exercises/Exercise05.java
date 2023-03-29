package guide02.exercises;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
	Nota: investigar la función Math.sqrt().
*/
public class Exercise05 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int number;
		
		System.out.print("Ingrese un número entero: ");
		number = scan.nextInt();
		
		System.out.printf("\nDoble:\t%d", number * 2);
		System.out.printf("\nTriple:\t%d", number * 3);
		System.out.printf("\nRaiz:\t%.2f\n", Math.sqrt(number));
	}
}
