package exercise04;

import exercise04.entities.Movie;
import exercise04.service.MovieService;
import java.util.ArrayList;

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
public class Exercise04 {

	private static final double MIN_DURATION = 1.5;
	
	public static void main(String[] args) {
		
		MovieService ms = new MovieService();
		ArrayList<Movie> movies = ms.loadMovies();
		
		ms.showMovies(movies);
		ms.showMovies(movies, MIN_DURATION);
		ms.sortByDurationDescending(movies);
		ms.showMovies(movies);
		ms.sortByDurationAscending(movies);
		ms.showMovies(movies);
		ms.sortByTitle(movies);
		ms.showMovies(movies);
		ms.sortByDirectorName(movies);
		ms.showMovies(movies);
	}
}
