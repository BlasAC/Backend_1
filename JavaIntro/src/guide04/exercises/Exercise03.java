package guide04.exercises;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda,
	estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir
	que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
	El cambio de divisas es:
	* 0.86 libras es un 1 €
	* 1.28611 $ es un 1 €
	* 129.852 yenes es un 1 €
*/
public class Exercise03 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String exchangeTo;
		double euros;
		
		System.out.print("Ingrese la cantidad de euros a cambiar: ");
		euros = scan.nextDouble();
		System.out.print("Indique a qué moneda desea cambiar (dolar, yen, libra): ");
		exchangeTo = scan.next();
		
		currencyExchange(euros, exchangeTo);
	}
	
	static void currencyExchange(double eu, String change) {
		switch (change) {
			case "dolar":
				System.out.printf("\n%.4f Euros equivalen a %.4f Dólares.\n\n", eu, eu * 1.28611);
				break;
			case "yen":
				System.out.printf("\n%.4f Euros equivalen a %.4f Yenes.\n\n", eu, eu * 129.852);
				break;
			case "libra":
				System.out.printf("\n%.4f Euros equivalen a %.4f Libras.\n\n", eu, eu * .86);
				break;
			default:
				System.out.printf("\nMoneda incorrecta.\n\n");
		}
	}
}
