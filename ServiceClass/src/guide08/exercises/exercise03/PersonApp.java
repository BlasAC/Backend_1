package guide08.exercises.exercise03;

import guide08.exercises.exercise03.entities.Person;
import guide08.exercises.exercise03.service.PersonService;
import java.util.ArrayList;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’
	para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro atributo, puede hacerlo. Agregar constructores, getters y setters.
	
	En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
	
		a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
		b) Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos
		atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M u O. Si no es correcto se
		deberá mostrar un mensaje
		c) Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
		valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado
		un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
		de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
	
	A continuación, en la clase main hacer lo siguiente:
		
		● Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, deberá comprobar si la
		persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
		● Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), para después calcular un
		porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y también calcularemos
		un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.
*/
public class PersonApp {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Person> personList = new ArrayList<>();
		
		int limit;
		
		PersonService ps = new PersonService();
		
		System.out.print("Indique cuántas personas desea crear: ");
		limit = scan.nextInt();
		
		for (int i = 0; i < limit; i++) {
			personList.add(ps.createPerson());
		}
		
		for (Person person : personList) {
			ps.calculateBMI(person);
			ps.isAdult(person);
		}
		
		System.out.printf("Porcentaje de mayores de edad: %.2f\n"
				+ "Porcentaje de menores de edad: %.2f\n"
				+ "Porcentaje de personas por debajo de su peso ideal: %.2f\n"
				+ "Porcentaje de personas en su peso ideal: %.2f\n"
				+ "Porcentaje de personas por encima de su peso ideal: %.2f\n",
				ps.percentageOfAdults(), ps.percentageOfMinors(), ps.percentageOfPeopleUnderIdealWeight(), ps.percentageOfPeopleAtIdealWeight(), ps.percentageOfPeopleAboveIdealWeight());
	}
}
