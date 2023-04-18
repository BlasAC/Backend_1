package guide09.exercises.exercise05.service;

import guide09.exercises.exercise05.entities.Person;
import java.util.Date;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
*/
public class PersonService {

	//a) Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
	public static Person createPerson() {
		Scanner scan = new Scanner(System.in);
		
		String fullName;
		int day, month, year;
		
		System.out.print("Indique el nombre completo de la persona: ");
		fullName = scan.nextLine();
		
		System.out.println("Ingrese la fecha de nacimiento.");
		System.out.print("Día: ");
		day = scan.nextInt();
		System.out.print("Mes: ");
		month = scan.nextInt();
		System.out.print("Año: ");
		year = scan.nextInt();
		
		/*
			year - 1900 es requisito porque así está implementada la clase
			month - 1 es más de lo mismo: los mese van de 0 a 11
		*/
		return new Person(fullName, new Date(year - 1900, month - 1, day));
	}
	
	//b) Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
	public static int calculateAge(Person p) {
		
		//Esto crea un objeto Date con los valores de "ahora".
		Date now = new Date();
		
		//Calculamos cuál sería la edad si la persona ya cumplió los años
		int age = now.getYear() - p.getBirthDate().getYear();
		
		//Si el mes actual es menor que el de nacimiento, o si es el mismo pero lo que es menor es el día, se resta 1 a la edad (aún no cumplió años).
		if (Integer.compare(now.getMonth(), p.getBirthDate().getMonth()) < 0 || (Integer.compare(now.getMonth(), p.getBirthDate().getMonth()) == 0 && Integer.compare(now.getDate(), p.getBirthDate().getDate()) < 0)) {
			age--;
		}
		return age;
	}
	
	//c) Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
	public static boolean isOlderThan(Person p, int age) {
		//Solo uso este tipo de comparación para darle uso a la clase Integer...
		return Integer.compare(calculateAge(p), age) < 0;
	}
	
	//d) Método mostrarPersona que muestra la información de la persona deseada.
	public static void showPersonInfo(Person p) {
		System.out.printf("Nombre: %s\nFecha de nacimiento: %d/%d/%d\n", p.getFullName(), p.getBirthDate().getDate(), p.getBirthDate().getMonth() + 1, p.getBirthDate().getYear());
	}
}
