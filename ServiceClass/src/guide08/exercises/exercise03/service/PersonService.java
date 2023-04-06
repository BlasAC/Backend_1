package guide08.exercises.exercise03.service;

import guide08.exercises.exercise03.entities.Person;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
*/
public class PersonService {
	
	private static Map<Integer, Boolean> adultList = new HashMap<>();
	private static Map<Integer, Integer> bmiList = new HashMap<>();
	
	//a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
	public boolean isAdult(Person person) {
		
		PersonService.adultList.put(person.getDni(), person.getAge() >= Person.LEGAL_AGE);
		
		return PersonService.adultList.get(person.getDni());
	}
	
	//b) Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos
	//atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
	//deberá mostrar un mensaje
	public Person createPerson() {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		boolean valid;
		
		String forename, surname, genre;
		int dni, age;
		double weight, height;
		
		System.out.print("Nombre: ");
		forename = scan.nextLine();
		
		System.out.print("Apellido: ");
		surname = scan.nextLine();
		
		System.out.print("Sexo (H, M u O): ");
		do {
			genre = scan.next();
			
			if (valid = !genre.matches("H|M|O")) {
				System.out.print("El sexo elegido no es válido. Intente nuevamente:");
			}
		} while (valid);
		
//		System.out.printf("DNI: %d\n", dni = rand.nextInt(40000000) + 10000000);
//		System.out.printf("Edad: %d\n", age = rand.nextInt(100) + 1);
//		System.out.printf("Peso: %.2f\n", weight = rand.nextDouble() * 200);
//		System.out.printf("Altura: %.2f\n", height = rand.nextDouble() * 2 + .3);
		
		System.out.print("DNI: ");
		dni = scan.nextInt();
		System.out.print("Edad: ");
		age = scan.nextInt();
		System.out.print("Peso: ");
		weight = scan.nextDouble();
		System.out.print("Altura: ");
		height = scan.nextDouble();
		
		return new Person(forename, surname, genre, dni, age, weight, height);
	}
	
	//c) Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
	//valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado
	//un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
	//de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
	public int calculateBMI(Person person) {
		
		double idealWeight = person.getWeight() / Math.pow(person.getHeight(), 2);
		int index;
		
		if (idealWeight < 20) {
			index = -1;
		} else if (idealWeight >= 20 && idealWeight <= 25) {
			index = 0;
		} else {
			index = 1;
		}
		System.out.println(person.getDni());
		PersonService.bmiList.putIfAbsent(person.getDni(), index);
		
		return index;
	}
	
	/**
	* This method calculates the percentage of people who are over {@value Person#LEGAL_AGE} years old in a given group.
	* @return the percentage (0 to 1).
	*/
	public double percentageOfAdults() {
		
		int adultCounter = 0;
		
		for (Map.Entry<Integer, Boolean> pair : PersonService.adultList.entrySet()) {
			if (pair.getValue()) {
				adultCounter++;
			}
		}
		
		return adultCounter / PersonService.adultList.size();
	}
	
	/**
	* This method calculates the percentage of people who are under {@value Person#LEGAL_AGE} years old in a given group.
	* @return the percentage (0 to 1).
	*/
	public double percentageOfMinors() {
		
		int minorCounter = 0;
		
		//Este código hace exactamente lo mismo que el bucle de percentageOfAdults().
		//Es una versión "funcional" sugerida por el IDE que no sabría explicar, más allá de que son expresiones lambda, en este preciso momento.
		//Me queda pendiente el analizar lo que está ocurriendo.
		minorCounter = PersonService.adultList.entrySet().stream().filter((pair) -> (!pair.getValue())).map((_item) -> 1).reduce(minorCounter, Integer::sum);
		
		return minorCounter / PersonService.adultList.size();
	}
	
	/**
	 * This method calculates the percentage of people who have a body mass index of -1.
	 * @return the percentage (0 to 1).
	 */
	public double percentageOfPeopleUnderIdealWeight() {
		
		int underIdealWeight = 0;
		
		for (Map.Entry<Integer, Integer> pair : PersonService.bmiList.entrySet()) {
			if (pair.getValue() == -1) {
				underIdealWeight++;
			}
		}
		
		return underIdealWeight / PersonService.bmiList.size();
	}
	
	/**
	 * This method calculates the percentage of people who have a body mass index of 0.
	 * @return the percentage (0 to 1).
	 */
	public double percentageOfPeopleAtIdealWeight() {
		
		int atIdealWeight = 0;
		
		for (Map.Entry<Integer, Integer> pair : PersonService.bmiList.entrySet()) {
			if (pair.getValue() == 0) {
				atIdealWeight++;
			}
		}
		
		return atIdealWeight / PersonService.bmiList.size();
	}
	
	/**
	 * This method calculates the percentage of people who have a body mass index of 1.
	 * @return the percentage (0 to 1).
	 */
	public double percentageOfPeopleAboveIdealWeight() {
		
		int aboveIdealWeight = 0;
		
		for (Map.Entry<Integer, Integer> pair : PersonService.bmiList.entrySet()) {
			if (pair.getValue() == 1) {
				aboveIdealWeight++;
			}
		}
		
		return aboveIdealWeight / PersonService.bmiList.size();
	}
}
