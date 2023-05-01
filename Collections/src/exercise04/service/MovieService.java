package exercise04.service;

import exercise04.entities.Movie;
import java.util.ArrayList;
import java.util.Scanner;

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
public class MovieService {

	public ArrayList<Movie> loadMovies() {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Movie> movies = new ArrayList<>();
		
		String title;
		String directorName;
		String option = "s";
		double duration;
		
		while (option.equalsIgnoreCase("s")) {
			System.out.print("\nTítulo: ");
			title = scan.nextLine();
			System.out.print("Director: ");
			directorName = scan.nextLine();
			System.out.print("Duración (en horas): ");
			duration = scan.nextDouble(); scan.nextLine();
			
			movies.add(new Movie(title, directorName, duration));
			
			System.out.print("Desea cargar otra película? (S/N): ");
			option = scan.nextLine();
		}
		
		return movies;
	}
	
	public void showMovies(ArrayList<Movie> movies) {
		System.out.println("Mostrando todas las películas");
		movies.forEach((movie) -> System.out.printf("Título: %s\nDirector: %s\nDuración: %.2f\n\n", movie.getTitle(), movie.getDirectorName(), movie.getDuration()));
	}
	
	public void showMovies(ArrayList<Movie> movies, double minDuration) {
		//Esto se puede hacer con el viejo y confiable bucle, pero ya que estamos jugando con Collections podemos aprovechar sus métodos.
		System.out.printf("Mostrando películas cuya duración es mayor a %.2f\n", minDuration);
		movies.stream()
				.filter(movie -> movie.getDuration() > minDuration)
				.forEach(movie -> System.out.printf("Título: %s\nDirector: %s\nDuración: %.2f\n\n", movie.getTitle(), movie.getDirectorName(), movie.getDuration()));
	}
	
	public void sortByDurationAscending(ArrayList<Movie> movies) {
		System.out.println("Ordenando por duración, de menor a mayor");
		movies.sort(Movie.sortByDurationAscending);
	}
	
	public void sortByDurationDescending(ArrayList<Movie> movies) {
		System.out.println("Ordenando por duración, de mayor a menor");
		movies.sort(Movie.sortByDurationDescending);
	}
	
	public void sortByTitle(ArrayList<Movie> movies) {
		System.out.println("Ordenando por título");
		movies.sort(Movie.sortByTitle);
	}
	
	public void sortByDirectorName(ArrayList<Movie> movies) {
		System.out.println("Ordenando por Director");
		movies.sort(Movie.sortByDirectorName);
	}
}
