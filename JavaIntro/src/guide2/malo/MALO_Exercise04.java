package guide2.malo;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables por pantalla.
	Recomendamos que hagan el siguiente experimento: tipear en minúsculas la palabra sout y apenas terminamos de escribirla tocar el botón tab o mejor dicho tabular.
	Esto nos va a generar un System.out.println() para poder escribir lo que queramos.

*/
public class MALO_Exercise04 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String name;
		short age;
		
		//print() difiere de println() en que no realiza un salto de línea al final de la impresión.
		System.out.print("Ingrese su nombre: ");
		name = scan.nextLine();
		System.out.print("Ingrese su edad: ");
		age = scan.nextShort();
		
		//printf es otra de las alternativas de impresión por consola <https://www.baeldung.com/java-printstream-printf>
		System.out.printf("Tu nombre es %s, y tienes %d años de edad.\n", name, age);
	}
}
