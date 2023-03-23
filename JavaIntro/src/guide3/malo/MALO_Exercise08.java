package guide3.malo;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
*/
public class MALO_Exercise08 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		byte score;
		
		System.out.print("Ingrese la nota (0-10): ");
		
		while((score = scan.nextByte()) < 0 || score > 10) {
			System.out.print("La nota ingresada no es valida. Intente nuevamente: ");
		}
		
		System.out.println("Nota valida.");
	}
}
