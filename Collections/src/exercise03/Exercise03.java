package exercise03;

import exercise03.entities.Student;
import exercise03.service.StudentService;
import java.util.ArrayList;
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
public class Exercise03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Student> students = StudentService.loadStudents();
		
		String name;
		boolean found = false;
		
		System.out.print("Indique el nombre del alumno del que desea calcular la nota final: ");
		name = scan.nextLine();
		
		for (Student student : students) {
			if (student.getName().equalsIgnoreCase(name)) {
				System.out.printf("Nota final del alumno: %.2f\n\n", StudentService.finalScore(students, "Blas"));
				found = true;
			}
		}
		
		if (!found) {
			System.out.println("No existe un alumno con ese nombre en la lista.\n");
		}
	}
}
