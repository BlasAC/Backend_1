package guide09.exercises.exercise05.entities;

import java.util.Date;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date),
	constructor vacío, constructor parametrizado, get y set.
*/
public class Person {

	String fullName;
	/*
		Date es una clase obsoleta.
		Aún es utilizable por cuestiones de retrocompatibilidad pero se aconseja usar Calendar o GregorianCalendar en su lugar.
		En el ejercicio 4 opté por utilizar una de las recomendadas: Calendar.
	*/
	Date birthDate;

	public Person() {
	}

	public Person(String fullName, Date birthDate) {
		this.fullName = fullName;
		this.birthDate = birthDate;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
