package guide03.extras;

import java.util.Scanner;
import java.util.Random;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10.
	El programa debe indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario
	ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
*/
public class Extra10 {
	
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	
	static int MIN = 0;
	static int MAX = 10;
	
	public static void main(String[] args) {
		
		int secretNumber = (rand.nextInt(MAX - MIN + 1) + MIN) * (rand.nextInt(MAX - MIN + 1) + MIN);
		
		System.out.printf("Adivine el número secreto entre %d y %d: ", MIN * MIN, MAX * MAX);
		
		while (scan.nextInt() != secretNumber) {
			System.out.print("Incorrecto! Intente nuevamente: ");
		}
		
		System.out.print("\nCORRECTO!\n\n");
	}
}
