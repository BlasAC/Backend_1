package guide02.exercises;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
public class Exercise04 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float celsius;
		
		System.out.print("Ingrese la temperatura en °C: ");
		celsius = scan.nextFloat();
		
		System.out.println("\nEquivalente en Fahrenheit: " + (32 + (9 * celsius / 5)) + "\n");
	}
}
