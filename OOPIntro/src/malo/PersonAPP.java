package malo;

import malo.entities.Person;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>
*/
public class PersonAPP {
	
	/*
		Volveremos a usar la clase Persona y vamos a crear objetos en tu Main utilizando los constructores.
	*/
	
	public static void main(String[] args) {
		
		Person firstPerson = new Person(11444777, "Blasito", "A. C.");
		Person secondPerson = new Person(22555888, "MaLeVo", "Aimar");
		
		System.out.println("Datos de los objetos instanciados:");
		System.out.printf("Nombre(s): %-15s\nApellido(s): %-15s\nDNI: %d\n\n", firstPerson.getForename(), firstPerson.getSurname(), firstPerson.getDni());
		System.out.println(secondPerson);
	}
}
