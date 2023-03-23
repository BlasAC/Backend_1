package guide3.extras;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
*/
public class Extra06 {
	
	static Scanner scan = new Scanner(System.in);
	
	static final float HEIGHT_THRESHOLD = 1.6f;
	
	public static void main(String[] args) {
		
		int dataQuantity, under1_6Quantity = 0;
		
		float	height,
				totalHeightSum = 0,
				under1_6HeightSum = 0;
		
		System.out.print("Indique la cantidad de datos a ingresar: ");
		dataQuantity = scan.nextInt();
		
		System.out.println("Ingrese los datos:");
		for (int i = 0; i < dataQuantity; i++) {
			if ((height = scan.nextFloat()) < HEIGHT_THRESHOLD) {
				under1_6HeightSum += height;
				under1_6Quantity++;
			}
			totalHeightSum += height;
		}
		
		System.out.println("\nPromedio de altura general: " + (totalHeightSum / dataQuantity));
		System.out.println("Promedio de alturas por debajo de 1.6 mts.: " + (under1_6HeightSum / under1_6Quantity) + "\n");
	}
}
