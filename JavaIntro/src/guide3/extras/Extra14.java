package guide3.extras;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos.
	Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos
	para averiguar la media de edad de los hijos de todas las familias.
*/
public class Extra14 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int families, children,
			ageSum = 0,
			childrenCounter = 0;
		
		System.out.print("Indique la cantidad de familias: ");
		families = scan.nextInt();
		
		for (int i = 1; i <= families; i++) {
			
			System.out.printf("\nIndique la cantidad de hijos de la familia #%d: ", i);
			childrenCounter += children = scan.nextInt();
			
			for (int j = 1; j <= children; j++) {
				System.out.printf("Edad del hijo #%d: ", j);
				ageSum += scan.nextInt();
			}
		}
		
		System.out.printf("\nEl promedio de edad de todos los hijos es de %.2f\n\n", (float)ageSum / childrenCounter);
	}
}
