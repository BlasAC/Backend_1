package guide02.exercises;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
	Nota: investigar la función toUpperCase() y toLowerCase() en Java.
*/
public class Exercise03 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String sentence;
		
		System.out.print("Ingrese una frase: ");
		
		//Se pueden realizar asignaciones en los pasajes de parámetros:
		System.out.println("\nFrase original: " + (sentence = scan.nextLine())); //No recomendable si se sacrifica mucha claridad.
		System.out.println("Mayúsculas: " + sentence.toUpperCase());
		System.out.println("Minúsculas: " + sentence.toLowerCase() + "\n");
	}
}
