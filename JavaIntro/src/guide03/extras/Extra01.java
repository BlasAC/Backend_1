package guide03.extras;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
*/
public class Extra01 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int minutes;
		
		System.out.print("Ingrese la cantidad de minutos: ");
		minutes = scan.nextInt();
		
		//Como <minutes> es de tipo int, los resultados de las divisiones se truncan naturalmente.
		System.out.printf("\n%d minutos equivalen a %d día(s), %d horas y %d minutos.\n\n", minutes, minutes / (60 * 24), (minutes / 60) % 24, minutes % 60);
	}
}
