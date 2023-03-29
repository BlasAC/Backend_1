package guide03.exercises;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá imprimir
	un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
*/
public class Exercise04 {
	
	static Scanner scan = new Scanner(System.in);
	
	//final, en este caso, indica que se está declarando una CONSTANTE, en lugar de una variable. El contenido de la misma no puede ser modificado <https://www.javatpoint.com/final-keyword>
	//Por convensión, se escriben en MAYÚSCULAS y se separan las palabras con guión_bajo: MI_CONSTANTE <https://www.javatpoint.com/java-naming-conventions>
	static final String START = "A";
	
	public static void main(String[] args) {
		
		String word;
		
		System.out.printf("Ingrese una frase o palabra que comience con \"%s\": ", START);
		word = scan.nextLine();
		
		if (word.substring(0, 1).equalsIgnoreCase(START)) {
			System.out.println("\nCORRECTO.\n");
		} else {
			System.out.println("\nINCORRECTO.\n");
		}
	}
}
