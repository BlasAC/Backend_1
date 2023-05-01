package exercise02;

import exercise02.entities.Dog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá 
	un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro 
	está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista 
	ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará 
	la lista ordenada.
*/
public class Exercise02 {

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
		
		System.out.print("Ingrese el nombre del perro que desee retirar: ");
		String name = scan.nextLine();
		
		Iterator<Dog> dogsIterator = dogsList.iterator();
		while (dogsIterator.hasNext()) {
			if (dogsIterator.next().getName().equalsIgnoreCase(name)) {
				dogsIterator.remove();
				break;
			}
		}
		
		dogsList.sort(Dog.compareNames);
		System.out.println();
		
		//Ok... Se está prendiendo esta wea...
		//En criollo, lo que hace esto es pasarle cada elemento al método println (referenciado por ::).
		dogsList.forEach(System.out::println); //Nota: el compilador hará su magia cuando pase por esta línea.
	}
}
