package guide09.exercises.exercise05;

import guide09.exercises.exercise05.entities.Person;
import guide09.exercises.exercise05.service.PersonService;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date),
	constructor vacío, constructor parametrizado, get y set.
	Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
	a) Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
	b) Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
	c) Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
	d) Método mostrarPersona que muestra la información de la persona deseada.
*/
public class PersonApp {

	public static void main(String[] args) {
		Person p = PersonService.createPerson();
		
		System.out.printf("%s tiene %d años.\n", p.getFullName(), PersonService.calculateAge(p));
		System.out.println("Es menor de 18: " + PersonService.isOlderThan(p, 18));
		PersonService.showPersonInfo(p);
	}
}
