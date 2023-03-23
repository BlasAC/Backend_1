package guide3.extras;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno y termine en el número de la línea.
	Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
	1
	12
	123
*/
public class Extra13 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int height;
		
		System.out.print("Indique la cantidad de líneas de la pirámide: ");
		height = scan.nextInt();
		
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j % 10);
			}
			System.out.println();
		}
	}
}
