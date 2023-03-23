package guide2.exercises;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
*/
public class Exercise02 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String name;
		
		System.out.print("Ingrese su nombre: ");
		name = scan.nextLine();
		
		System.out.println("\nNombre ingresado: " + name + "\n");
	}
}
