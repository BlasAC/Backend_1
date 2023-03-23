package guide3.exercises;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario hasta que la suma de los números
	introducidos supere el límite inicial.
*/
public class Exercise05 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int limit;
		
		System.out.print("Ingrese un límite entero positivo: ");
		limit = scan.nextInt();
		
		//En lugar de hacer una suma y compararla con el límite, se le puede restar a este último lo que ingrese el usuario y salir una vez que el resto sea menor que 0.
		while (limit >= 0) {
			System.out.print("Ingrese un número: ");
			limit -= scan.nextInt();
		}
		System.out.println("Límite superado.");
	}
}
