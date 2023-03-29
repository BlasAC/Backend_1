package guide03.malo;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.
*/
public class MALO_Exercise06 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int number1, number2;
		
		System.out.print("Ingrese un numero entero: ");
		number1 = scan.nextInt();
		System.out.print("Ingrese otro numero entero: ");
		number2 = scan.nextInt();
		
		if (number1 > 25 || number2 > 25) {
			System.out.println("Al menos uno de los numeros es mayor a 25.");
		} else {
			System.out.println("Ninguno de los numeros es mayor a 25.");
		}
	}
}
