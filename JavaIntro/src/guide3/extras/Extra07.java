package guide3.extras;

import java.util.Scanner;
import java.util.Random;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0).
	El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario.
	Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
*/
public class Extra07 {
	
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	
	public static void main(String[] args) {
		
		int n;
		
		System.out.print("Indique la cantidad de números a ingresar: ");
		n = scan.nextInt();
		
		usingWhile(n);
		usingDoWhile(n);
	}
	
	static void usingWhile(int n) { //Mientras
		
		int num, minimum, maximum, average, i = 1;
		
		System.out.print("Ingrese un número: ");
		num = scan.nextInt();
		
		minimum = num;
		maximum = num;
		average = num;
		
		while ( i < n) {
			
			System.out.print("Ingrese otro número: ");
			num = scan.nextInt();
			
			if (num > maximum) {
				maximum = num;
			} else if (num < minimum) {
				minimum = num;
			}
			
			average += num;
			
			i++;
		}
		
		System.out.printf("Se ingresaron %d números.\n"
						+ "El mínimo ingresado fue: %d\n"
						+ "El máximo ingresados fue: %d\n"
						+ "Y el promedio es %.2f\n\n", n, minimum, maximum, (float)average / n);
	}
	
	static void usingDoWhile(int n) { //Repetir - Mientras Que
		
		//Otra forma de lidiar con el asunto de en cuánto inicializar las variables para mínimo y máximo es aprovechar que Integer
		//tiene almacenadas, en sendas constantes, las cantidades mínimas y máximas posibles para un int:
		int num,
			minimum = Integer.MAX_VALUE,
			maximum = Integer.MIN_VALUE,
			average = 0,
			i = 0;
		
		do {
			num = rand.nextInt(50); //Con Random porque por qué no?

			if (num < minimum) {
				minimum = num;
			}
			if (num > maximum) {
				maximum = num;
			}
			average += num;
			i++;
		} while (i < n);
		
		System.out.printf("Se ingresaron %d números.\n"
						+ "El mínimo ingresado fue: %d\n"
						+ "El máximo ingresados fue: %d\n"
						+ "Y el promedio es %.2f\n\n", n, minimum, maximum, (float)average / n);
	}
}