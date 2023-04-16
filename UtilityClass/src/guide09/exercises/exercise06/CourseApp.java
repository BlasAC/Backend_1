package guide09.exercises.exercise06;

import guide09.exercises.exercise06.entities.Course;
import guide09.exercises.exercise06.service.CourseService;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa para organizar la información de cada curso.
	Para ello, crearemos una clase entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,
	turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
	nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
	a) Un constructor por defecto.
	b) Un constructor con todos los atributos como parámetro.
	c) Métodos getters y setters de cada atributo.
	
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
public class CourseApp {

	public static void main(String[] args) {
		
		CourseService cs = new CourseService();
		Course course = cs.createCourse();
		System.out.print("Ganancias por semana: " + cs.calculateWeeklyRevenue(course) + "\n\n");
	}
}
