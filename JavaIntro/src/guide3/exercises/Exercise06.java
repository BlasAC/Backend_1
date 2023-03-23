package guide3.exercises;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción
	y el programa deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
	Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
	¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
*/
public class Exercise06 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String option;
		double num1, num2;
		
		do {
			System.out.print("\nIngrese un numero: ");
			num1 = scan.nextDouble();
			System.out.print("Ingrese otro numero: ");
			num2 = scan.nextDouble();
			
			System.out.printf(	"\n1. Sumar\n"
								+ "2. Restar\n"
								+ "3. Multiplicar\n"
								+ "4. Dividir\n"
								+ "5. Salir\n"
								+ "Elija una opcion: ");
			option = scan.next();
			
			switch (option) {
				case "1":
					System.out.printf("\n%.2f + %.2f = %.2f\n", num1, num2, num1 + num2);
					break;
				case "2":
					System.out.printf("\n%.2f + %.2f = %.2f\n", num1, num2, num1 - num2);
					break;
				case "3":
					System.out.printf("\n%.2f + %.2f = %.2f\n", num1, num2, num1 * num2);
					break;
				case "4":
					System.out.printf("\n%.2f + %.2f = %.2f\n", num1, num2, num1 / num2); //Funny stuff when num2 == 0 rofl
					break;
				case "5":
					System.out.print("Esta seguro de que desea salir del programa (S/N)?: ");
					option = scan.next();
					break;
				default: System.out.println("Opcion incorrecta.");
			}
		} while (!option.equalsIgnoreCase("S"));
	}
}
