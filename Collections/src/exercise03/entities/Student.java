package exercise03.entities;

import java.util.ArrayList;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crear una clase llamada Alumno que mantenga información sobre las notas de distintos 
	alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer con sus 3 notas. 
	En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide 
	toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le 
	pregunta al usuario si quiere crear otro Alumno o no.
	Después de ese bucle tendremos el siguiente método en el servicio de Alumno: 
	Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota 
	final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro 
	del método se usará la lista notas para calcular el promedio final de alumno. Siendo este 
	promedio final, devuelto por el método y mostrado en el main.
*/
public class Student {

	private String name;
	private ArrayList<Integer> scores;

	public Student(String name, ArrayList<Integer> scores) {
		this.name = name;
		this.scores = scores;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Integer> getScores() {
		return scores;
	}

	public void setScores(ArrayList<Integer> scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Student{" + "name=" + name + ", scores=" + scores + '}';
	}
}
