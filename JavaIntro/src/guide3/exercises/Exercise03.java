package guide3.exercises;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Realizar un programa que solo permita introducir frases o palabras de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá
	imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
*/
public class Exercise03 {
	
	static Scanner scan = new Scanner(System.in);
	
	static final int LENGTH = 8;
	
	public static void main(String[] args) {
		
		System.out.printf("Ingrese una palabra o frase de %d caracteres de largo: ", LENGTH);
		
		//Un bucle no es más que un if en loop
		while (scan.nextLine().length() != LENGTH) {
			System.out.print("Longitud incorrecta. Intente nuevamente: ");
		}
		
		System.out.println("CORRECTO.");
	}
}
