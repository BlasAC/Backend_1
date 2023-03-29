package guide07.malo.entities;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Es tu turno, crea tu propio proyecto con la clase Persona.
*/
public class Person {
	
	/*
		Seguiremos trabajando sobre la clase Persona que creamos y ahora deberás sumarle 3 atributos que creas pertinentes.
	*/
	private int dni;
	private String forename;
	private String surname;
	
	public Person() {}
	
	public Person(int dni, String forname, String surname) {
		this.dni = dni;
		this.forename = forname;
		this.surname = surname;
	}

	/*
		Continuaremos con nuestra clase Persona y vamos a primero crear los getter y setter y después invocarlos desde
		el Main con alguno de los objetos que instanciaste.
	*/
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Person{" + "dni=" + dni + ", forename=" + forename + ", surname=" + surname + '}';
	}
}
