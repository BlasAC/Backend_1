package guide5.exercises;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector.
	El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
public class Exercise02 {
	
	//Esta versión fue hecha junto a compañeros de cursada. Por eso las diferencias de estilo.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numABuscar, vector[];
		
		System.out.println("Por favor ingrese N para el vector.");
		vector = new int[input.nextInt()];
		
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * 10);
		}
		
		System.out.println("Por favor ingrese un número de '0' a '20'.");
		numABuscar = input.nextInt();
		
		for (int i = 0; i < vector.length; i++) {
			if (numABuscar == vector[i]) {
				System.out.println("El indice es: " + i + " para el número: " + vector[i]);
			}
		}
	}
}
