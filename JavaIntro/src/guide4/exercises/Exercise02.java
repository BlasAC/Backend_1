package guide4.exercises;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por
	teclado e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle al
	usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
public class Exercise02 {

	static Scanner scan = new Scanner(System.in);
	
	static final int AGE_THRESHOLD = 18;

	public static void main(String[] args) {
		
		do {
			assessAge();
			System.out.println("Desea ingresar mas datos? (\"No\" para salir)");
		} while (!scan.next().equalsIgnoreCase("no"));
	}

	public static void assessAge() {
		String name;
		
		System.out.println("Ingrese los datos de la persona");
		System.out.println("Nombre");
		name = scan.next();

		System.out.println("Edad");

		if (scan.nextInt() >= AGE_THRESHOLD) {
			System.out.println(name + " es MAYOR de edad.");
		} else {
			System.out.println(name + " es MENOR de edad.");
		}
	}
}
