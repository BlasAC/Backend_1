package exercises.exercise01.entities;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (MyString) y su longitud. Agregar
	constructor vacío y con atributo frase solamente. Agregar getters y setters. El constructor con frase como atributo debe setear la longitud
	de la frase de manera automática.
*/
public class MyString {
	
	private String string;
	private int length;
	
	//Constructors
	public MyString() {}

	public MyString(String string) {
		this.string = string;
		this.length = string.length();
	}
	
	//Getters and setters
	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	//toString
	@Override
	public String toString() {
		return "MyString{" + "string=" + string + ", length=" + length + '}';
	}
}
