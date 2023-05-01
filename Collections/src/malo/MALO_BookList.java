package malo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	¡Es tu turno! Crea una lista de Libros y muestra el título de cada uno con un bucle.
*/
public class MALO_BookList {

	public static void main(String[] args) {
		
		ArrayList<Book> books = new ArrayList<>();
		Book book = new Book("La Divina Comedia");
		books.add(book);
		books.add(new Book("Lord of the rings"));
		books.add(new Book("El Principito"));
		
		for (Book b : books) {
			System.out.println(b);
		}
		
		HashSet<Dog> dogs = new HashSet<>();
		Dog dog = new Dog(5);
		dogs.add(dog);
		dogs.add(new Dog(2));
		dogs.add(new Dog(3));
		
		ArrayList<Dog> dogsList = new ArrayList(dogs);
		dogsList.sort(Dog.compareAge);
		
		for (Dog d : dogsList) {
			System.out.println(d);
		}
		
		HashMap<Integer, Student> students = new HashMap<>();
		Student student = new Student(22222222, "Blas", "MaLeVo");
		students.put(student.getDni(), student);
		students.put(44444444, new Student(44444444, "Otro", "Nombre"));
		students.put(11111111, new Student(11111111, "Another", "One"));
		students.put(33333333, new Student(33333333, "Ultimo", "Estudiante"));
		ArrayList<Student> studentsList = new ArrayList(students.values());
		studentsList.sort(Student.compareDni);
		
		for (Student s : studentsList) {
			System.out.println(s);
		}
	}
}

class Book {
	
	private String title;

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book{title=" + title + '}';
	}
}

class Dog {
	
	private int age;

	public Dog(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog{" + "age=" + age + '}';
	}
	
//	public static Comparator<Dog> compareAge = (Dog d1, Dog d2) -> ((Integer) d1.getAge()).compareTo(d2.getAge()); //Lambda expression
	
	public static Comparator<Dog> compareAge = new Comparator<Dog>() {
		@Override
		public int compare(Dog d1, Dog d2) {
			return ((Integer) d1.getAge()).compareTo(d2.getAge());
		}
	};
}

class Student {
	
	private int dni;
	private String forename;
	private String alias;

	public Student(int dni, String forename, String alias) {
		this.dni = dni;
		this.forename = forename;
		this.alias = alias;
	}
	
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	@Override
	public String toString() {
		return "Student{dni=" + dni + ", forename=" + forename + ", alias=" + alias + '}';
	}
	
	public static Comparator<Student> compareDni = (Student s1, Student s2) -> ((Integer) s1.getDni()).compareTo(s2.getDni());
}