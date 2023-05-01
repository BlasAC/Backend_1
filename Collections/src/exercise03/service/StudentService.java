package exercise03.service;

import exercise03.entities.Student;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crear una clase llamada Alumno que mantenga información sobre las notas de distintos 
	alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer 
	con sus 3 notas. 
	En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide 
	toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le 
	pregunta al usuario si quiere crear otro Alumno o no.
	Después de ese bucle tendremos el siguiente método en el servicio de Alumno: 
	Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota 
	final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro 
	del método se usará la lista notas para calcular el promedio final de alumno. Siendo este 
	promedio final, devuelto por el método y mostrado en el main.
*/
public class StudentService {

	private static final int NUMBER_OF_SCORES = 3;
	
	public static ArrayList<Student> loadStudents() {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		ArrayList<Student> students = new ArrayList<>();
		String name;
		String option = "s";
		ArrayList<Integer> scores;
		
		while (option.equalsIgnoreCase("s")) {
			System.out.print("\nNombre del alumno: ");
			name = scan.nextLine();
			
			scores = new ArrayList<>();
			
			for (int i = 0; i < NUMBER_OF_SCORES; i++) {
				System.out.printf("Nota %d: ", i + 1);
				scores.add(rand.nextInt(11));
				System.out.println(scores.get(i));
			}
			
			students.add(new Student(name, scores));
			
			System.out.print("Desea agregar otro estudiante? (S/N): ");
			option = scan.nextLine();
		}
		
		System.out.println();
		
		return students;
	}
	
	public static double finalScore(ArrayList<Student> students, String name) {
		double average = 0;
		
		for (Student student : students) {
			if (student.getName().equalsIgnoreCase(name)) {
				for (Integer score : student.getScores()) {
					average += score;
				}
				average /= student.getScores().size();
				break;
			}
		}
		
		return average;
	}
}
