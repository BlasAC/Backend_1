package exercise01;

import exercise01.entities.Dog;
import java.util.ArrayList;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
	después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.
*/
public class Exercise01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Dog> dogsList = new ArrayList();
		
		String option = "s";
		
		while (option.equalsIgnoreCase("s")) {
			System.out.print("Nombre del perro: ");
			dogsList.add(new Dog(scan.nextLine()));
			System.out.print("Desea realizar otro ingreso? (S/N)");
			option = scan.nextLine();
		}
		
		System.out.println();
		for (Dog dog : dogsList) {
			System.out.println(dog);
		}
	}
}
