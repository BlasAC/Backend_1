package guide3.extras;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. Caso contrario mostrar un mensaje.
	Nota: investigar la función equals() de la clase String.
*/
public class Extra03 {
	
	static Scanner scan = new Scanner(System.in);
	
	static final String VOWELS = "aeiouáéíóú";
	
	public static void main(String[] args) {
		
		System.out.print("Ingrese una letra: ");
		
		//indexOf() retorna la posición del elemento buscado. Si no se encuentra dicho elemento, retorna -1
		if (VOWELS.indexOf(scan.next().toLowerCase().charAt(0)) >= 0) {
			System.out.println("\nEs una vocal.\n\n");
		} else {
			System.out.println("\nNo es una vocal\n\n");
		}
		
		//Una alternativa, utilizando el operador ternario <?>
		//System.out.printf("\n%s una vocal.\n\n", VOWELS.indexOf(scan.next().toLowerCase().charAt(0)) >= 0 ? "Es" : "No es");
	}
}
