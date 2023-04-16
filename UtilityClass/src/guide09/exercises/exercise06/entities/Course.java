package guide09.exercises.exercise06.entities;

import java.util.Arrays;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa para organizar la información de cada curso.
	Para ello, crearemos una clase entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,
	turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
	nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
	a) Un constructor por defecto.
	b) Un constructor con todos los atributos como parámetro.
	c) Métodos getters y setters de cada atributo.
*/
public class Course {
	
	private String courseName;
	private double hoursPerDay;
	private int daysPerWeek;
	private char shift;
	private double pricePerHour;
	private String[] alumns;

	//Constructors
	public Course() {
	}

	public Course(String courseName, double hoursPerDay, int daysPerWeek, char shift, double pricePerHour, String[] alumns) {
		this.courseName = courseName;
		this.hoursPerDay = hoursPerDay;
		this.daysPerWeek = daysPerWeek;
		this.shift = shift;
		this.pricePerHour = pricePerHour;
		this.alumns = alumns;
	}

	//Getters and setters
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getHoursPerDay() {
		return hoursPerDay;
	}

	public void setHoursPerDay(double hoursPerDay) {
		this.hoursPerDay = hoursPerDay;
	}

	public int getDaysPerWeek() {
		return daysPerWeek;
	}

	public void setDaysPerWeek(int daysPerWeek) {
		this.daysPerWeek = daysPerWeek;
	}

	public char getShift() {
		return shift;
	}

	public void setShift(char shift) {
		this.shift = shift;
	}

	public double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public String[] getAlumns() {
		return alumns;
	}

	public void setAlumns(String[] alumns) {
		this.alumns = alumns;
	}

	//toString
	@Override
	public String toString() {
		return "Course{" + "courseName=" + courseName + ", hoursPerDay=" + hoursPerDay + ", daysPerWeek=" + daysPerWeek + ", shift=" + shift + ", pricePerHour=" + pricePerHour + ", alumns=" + Arrays.toString(alumns) + '}';
	}
}
