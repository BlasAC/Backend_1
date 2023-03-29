package guide03.extras;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número.
	Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. Calcular la cantidad de dígitos
	matemáticamente utilizando el operador de división.
	Nota: recordar que las variables de tipo entero truncan los números o resultados.
*/
public class Extra11 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double number;
		int digits = 0;
		
		System.out.print("Ingrese un número entero: ");
		number = scan.nextDouble();
		
		while(number > 1) {
			number /= 10;
			digits++;
		}
		
		System.out.printf("\nSe ingresó un número de %d dígitos.\n\n", digits);
	}
}
