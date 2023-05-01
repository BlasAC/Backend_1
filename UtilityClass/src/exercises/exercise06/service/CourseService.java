package exercises.exercise06.service;

import exercises.exercise06.entities.Course;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Luego, en la clase CursoServicio, se implementarán los siguientes métodos:
	
	a) Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. Nosotros nos encargaremos de
	almacenar esta información en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el nombre de cada
	alumno.
	b) Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos
	atributos para llenar el objeto Curso. En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
	c) Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. Para ello, se deben
	multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite
	el encuentro.
*/
public class CourseService {

	public String[] loadStudents(String[] names) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < names.length; i++) {
			System.out.printf("Nombre #%d: ", i + 1);
			names[i] = scan.nextLine();
		}
		
		return names;
	}
	
	public Course createCourse() {
		Scanner scan = new Scanner(System.in);
		
		int numberOfStudents;
		String courseName;
		double hoursPerDay;
		int daysPerWeek;
		char shift;
		double pricePerHour;
		String[] alumns;
		
		System.out.print("Indique la cantidad de alumnos: ");
		numberOfStudents = scan.nextInt(); scan.nextLine();
		System.out.print("Indique el nombre del curso: ");
		courseName = scan.nextLine();
		System.out.print("Indique la cantidad de horas por día: ");
		hoursPerDay = scan.nextDouble();
		System.out.print("Indique la cantidad de días por semana: ");
		daysPerWeek = scan.nextInt(); scan.nextLine();
		System.out.print("Indique el turno (m/t): ");
		shift = scan.nextLine().charAt(0);
		System.out.print("Indique el precio por hora: ");
		pricePerHour = scan.nextDouble();
		
		alumns = loadStudents(new String[numberOfStudents]);
		
		return new Course(courseName, hoursPerDay, daysPerWeek, shift, pricePerHour, alumns);
	}
	
	public double calculateWeeklyRevenue(Course course) {
		return course.getPricePerHour() * course.getHoursPerDay() * course.getDaysPerWeek() * course.getAlumns().length;
	}
}
