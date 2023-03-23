package guide3.extras;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Simular la división usando solamente restas. Dados dos números enteros mayores que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
	Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas realizadas es el cociente.
	Por ejemplo: 50 / 13:
	50 – 13 = 37     una resta realizada
	37 – 13 = 24     dos restas realizadas
	24 – 13 = 11     tres restas realizadas
	dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
	¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
*/
public class Extra09 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int dividend, divisor, remainder, quotient = 0;
		
		System.out.print("Ingrese el dividendo (número entero mayor que uno): ");
		remainder = dividend = scan.nextInt();
		
		System.out.print("Ingrese el divisor (número entero mayor que uno): ");
		divisor = scan.nextInt();
		
		while (remainder >= divisor) {
			remainder -= divisor;
			quotient++;
		}
		
		System.out.printf("\n%d / %d = %d (Resto: %d)\n\n", dividend, divisor, quotient, remainder);
	}
}
