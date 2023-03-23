package guide5.exercises;

import java.util.Random;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
*/
public class Exercise03 {
	
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();

	static final int
			MAX_DIGITS = 5,
			MIN = 0,
			MAX = (int) Math.pow(10, MAX_DIGITS);

	public static void main(String[] args) {

		int digitCounters[] = new int[MAX_DIGITS];

		System.out.print("Indique la cantidad de números a generar: ");
		int[] numbers = new int[scan.nextInt()];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(MAX - MIN) + MIN;
		}

		for (int i = 0; i < numbers.length; i++) {
			digitCounters[String.valueOf(numbers[i]).length() - 1]++;
		}

		System.out.printf("\nDe los %d números\n" //This should be a loop xD
				+ "%d son de 1 cifra\n"
				+ "%d son de 2 cifras\n"
				+ "%d son de 3 cifras\n"
				+ "%d son de 4 cifras\n"
				+ "%d son de 5 cifras\n\n", numbers.length, digitCounters[0], digitCounters[1], digitCounters[2], digitCounters[3], digitCounters[4]);
	}
}
