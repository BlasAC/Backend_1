package guide4.exercises;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir.
	La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main.
*/
public class Exercise01 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double number1, number2;
		
		System.out.println("Ingrese dos números");
		System.out.print("Primer número: ");
		number1 = scan.nextDouble();
		System.out.print("Segundo número: ");
		number2 = scan.nextDouble();
		
		switch (menu()) {
			case 1:
				System.out.printf("\nSuma: %.2f\n\n", add(number1, number2));
				break;
			case 2:
				System.out.printf("\nDiferencia: %.2f\n\n", substract(number1, number2));
				break;
			case 3:
				System.out.printf("\nProducto: %.2f\n\n", multiply(number1, number2));
				break;
			case 4:
				System.out.printf("\nCociente: %.2f\n\n", divide(number1, number2));
				break;
			default:
				System.out.print("\nOpción incorrecta.\n\n");
		}
	}
	
	static int menu() {
		System.out.printf("\nQué desea hacer con los números?\n"
				+ "1. Sumar.\n"
				+ "2. Restar.\n"
				+ "3. Multiplicar.\n"
				+ "4. Dividir\n");
		return scan.nextInt();
	}
	
	static double add(double n1, double n2) {
		return n1 + n2;
	}
	
	static double substract(double n1, double n2) {
		return n1 - n2;
	}
	
	static double multiply(double n1, double n2) {
		return n1 * n2;
	}
	
	static double divide(double n1, double n2) {
		return n1 / n2; //n1 / 0 = Infinity. Jaque mate matemáticos!
	}
}
