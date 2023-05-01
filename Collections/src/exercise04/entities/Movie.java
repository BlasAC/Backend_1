package exercise04.entities;

import java.util.Comparator;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
	Para esto, tendremos una clase Pelicula con el título, director y duración de la película (en horas).
	Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo que se pide a continuación:
	En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario todos sus datos y guardándolos en el objeto Pelicula.
	Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Pelicula o no.
	Después de ese bucle realizaremos las siguientes acciones: 
	• Mostrar en pantalla todas las películas.
	• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
	• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en 
	pantalla.
	• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en 
	pantalla.
	• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
	• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
*/
public class Movie {

	private String title;
	private String directorName;
	private double duration;

	public Movie(String title, String directorName, double duration) {
		this.title = title;
		this.directorName = directorName;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Movie{" + "title=" + title + ", directorName=" + directorName + ", duration=" + duration + '}';
	}
	
	public static Comparator<Movie> sortByDurationAscending = (Movie m1, Movie m2) -> ((Double) m1.getDuration()).compareTo(m2.getDuration());
	
	public static Comparator<Movie> sortByDurationDescending = (Movie m1, Movie m2) -> ((Double) m2.getDuration()).compareTo(m1.getDuration());
	
	public static Comparator<Movie> sortByTitle = (Movie m1, Movie m2) -> (m1.getTitle().compareTo(m2.getTitle()));
	
	public static Comparator<Movie> sortByDirectorName = (Movie m1, Movie m2) -> (m1.getDirectorName().compareTo(m2.getDirectorName()));
}
