package guide04.malo;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>
	
	Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario,
	validando que el primer número múltiplo del segundo e imprima si el primer número es
	múltiplo del segundo, sino informe que no lo son.
*/
public class MALO_Exercise12 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int number1, number2;
		
		System.out.println("Ingrese dos números enteros:");
		System.out.print("Primer número: ");
		number1 = scan.nextInt();
		System.out.print("Primer número: ");
		number2 = scan.nextInt(); //Ojo con el cero.
		
		if (esMultiplo(number1, number2)) {
			System.out.printf("\n%d es múltiplo de %d\n\n", number1, number2);
		} else {
			System.out.printf("\n%d no es múltiplo de %d\n\n", number1, number2);
		}
	}
	
	public static boolean esMultiplo(int n1, int n2) {
		return n1 % n2 == 0;
	}
}
