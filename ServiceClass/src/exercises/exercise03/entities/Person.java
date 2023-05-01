package exercises.exercise03.entities;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’
	para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro atributo, puede hacerlo. Agregar constructores, getters y setters.
*/
public class Person {
	
	public static final int LEGAL_AGE = 18;
	
	private String forename;
	private String surname;
	private String genre;
	
	private int dni;
	private int age;
	
	private double weight;
	private double height;

	public Person() {
	}

	public Person(String forename, String surname, String genre, int dni, int age, double weight, double height) {
		this.forename = forename;
		this.surname = surname;
		this.genre = genre;
		this.dni = dni;
		this.age = age;
		this.weight = weight;
		this.height = height;
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

	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person{" + "forename=" + forename + ", surname=" + surname + ", genre=" + genre + ", dni=" + dni + ", age=" + age + ", weight=" + weight + ", height=" + height + '}';
	}
}
