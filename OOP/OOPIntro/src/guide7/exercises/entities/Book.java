package guide7.exercises.entities;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, y un constructor
	con todos los atributos pasados por parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los datos
	al usuario y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.
*/
public class Book {
	
	private int isbn;
	private String title;
	private String author;
	private int pageCount;
	
	public static Book createBook() {
		Scanner scan = new Scanner(System.in);
		
		int isbn, pageCount;
		String title, author;
		
		System.out.println("Ingrese los datos del libro");
		System.out.print("ISBN: ");
		isbn = Integer.parseInt(scan.nextLine());
		System.out.print("Título: ");
		title = scan.nextLine();
		System.out.print("Autor: ");
		author = scan.nextLine();
		System.out.print("Cantidad de páginas: ");
		pageCount = Integer.parseInt(scan.nextLine());
		
		return new Book(isbn, title, author, pageCount);
	}
	
	public void showBookData() {
		System.out.printf("\nISBN: %d\n"
				+ "Title: %-15s\n"
				+ "Autor: %-15s\n"
				+ "Páginas: %d\n", this.getIsbn(), this.getTitle(), this.getAuthor(), this.getPageCount());
	}
	
	public Book() {}

	public Book(int isbn, String title, String author, int pageCount) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
}
