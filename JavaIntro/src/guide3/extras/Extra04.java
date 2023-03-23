package guide3.extras;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
*/
public class Extra04 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] decimalDigits = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] romanDigits = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		
		StringBuilder roman = new StringBuilder(); //Otra forma de trabajar con strings.
		
		int number, aux;
		
		System.out.print("Ingrese un número entero positivo en base 10: ");
		//Lo que se lee desde consola se asigna a <number>, y luego lo que está en <number> se asigna a <aux>.
		aux = number = scan.nextInt();
		
		for (int i = 0; i < decimalDigits.length; i++) {
			
			while (aux >= decimalDigits[i]) {
				aux -= decimalDigits[i];
				roman.append(romanDigits[i]);
			}
		}
		
		System.out.printf("\n%d -> %s\n\n", number, roman.toString());
	}
}
