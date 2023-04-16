package guide09.exercises.exercise01.service;

import guide09.exercises.exercise01.entities.MyString;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
*/
public class MyStringService {
	
	/*
		Esto es una expresión regular o regex, que proviene de su denominación en inglés "REGular EXpression". Muy útil para buscar datos en textos.
		(?i) = se setea el indicador "No distinguir entre mayúsculas y minúsculas" (case insensitive).
		[^aeiou...] = el ^ indica "todo lo que NO esté en la lista".
		[^aeiou...] = "aeiou..." es la lista de caracteres.
	*/
	private static final String REGEX = "(?i)[^aeiouáéíóú]";
	
	Scanner scan = new Scanner(System.in);
	
	public MyString createMyString() {
		System.out.print("Ingrese una frase: ");
		return new MyString(scan.nextLine());
	}
	
	//a) Método mostrarVocales(), cambiado a contarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
	public void countVowels(MyString ms) {
		System.out.printf("La frase \"%s\" contiene %d vocales.\n", ms.getString(), ms.getString().replaceAll(MyStringService.REGEX, "").length());
	}
	
	//b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
	public void reverseString(MyString ms) {
		
		//Esta sería una forma simple, sin recurrir a métodos raros, de mostrar la frase en orden inverso.
//		System.out.print("Frase invertida: <");
//		for (int i = ms.getLength(); i > 0; i--) {
//			System.out.print(ms.getString().substring(i - 1, i));
//		}
//		System.out.println(">");
		
		//Alternativa usando el método reverse() de StringBuilder.
		System.out.println(new StringBuilder(ms.getString()).reverse().toString());
	}
	
	//c) Método vecesRepetido(Cadena cadena), que solicitará un carácter al usuario y contabilizará cuántas veces se repite el carácter en la
	//frase, por ejemplo: Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
	public void timesFound(MyString ms) {
		String character;
		System.out.print("Indique el caracter a buscar: ");
		character = scan.nextLine().substring(0, 1);
		
		//Mismo método que el utilizado para contar las vocales, pero la regex se arma con el caracter ingresado.
		System.out.printf("El caracter %s aparece %d veces en la frase %s\n", character, ms.getString().replaceAll("(?i)[^" + character + "]", "").length(), ms.getString());
	}
	
	//e) Método compararLongitud(Cadena cadena), que deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
	public void lengthCompare(MyString ms) {
		int phraseLength;
		System.out.print("Ingrese una frase: ");
		phraseLength = scan.nextLine().length();
		
		if (phraseLength > ms.getLength()) {
			System.out.println("La frase ingresada es más larga que la almacenada en el objeto.");
		} else if (phraseLength == ms.getLength()) {
			System.out.println("La frase ingresada y la almacenada en el objeto tienen la misma longitud.");
		} else {
			System.out.println("La frase ingresada es más corta que la almacenada en el objeto.");
		}
	}
	
	//f) Método unirFrases(Cadena cadena), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario
	//y mostrar la frase resultante.
	public void concatenateStrings(MyString ms) {
		System.out.print("Ingrese una frase: ");
		System.out.println("Frases concatenadas: " + ms.getString().concat(scan.nextLine()));
	}
	
	//g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter
	//seleccionado por el usuario y mostrar la frase resultante.
	public void replaceA(MyString ms) {
		System.out.print("Indique el caracter que reemplazará a la A: ");
		System.out.println(ms.getString().replaceAll("(?i)[a]", scan.nextLine().substring(0, 1)));
	}
	
	//h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
	public boolean containsLetter(MyString ms) {
		System.out.print("Indique la letra a buscar: ");
		return ms.getString().contains(scan.nextLine().substring(0, 1));
	}
}
