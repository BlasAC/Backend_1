package guide07.exercises.exercise01;

import guide07.exercises.exercise01.entities.Book;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, y un constructor
	con todos los atributos pasados por parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los datos
	al usuario y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.
*/
public class BookApp {
	
	public static void main(String[] args) {
		
		Book book1 = Book.createBook();
		Book book2 = new Book();
		
		book1.showBookData();
		System.out.print(book1);
		book2.showBookData();
		System.out.print(book2);
	}
}
