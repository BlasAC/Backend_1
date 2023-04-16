package guide09.extras.extra02.service;

import guide09.extras.extra02.entities.Hangman;
import guide09.extras.extra02.entities.HangmanStages;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Definir los siguientes métodos en AhorcadoService:
	● Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, pone la longitud de la
	palabra, como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice
	del vector. Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
	● Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
	● Método buscar(letra): este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no.
	También informará si la letra estaba o no.
	● Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas y cuántas le
	faltan. Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra
	que no esté, se le restará uno a sus oportunidades.
	● Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
	● Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando el usuario
	descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.
*/
public class HangmanService {

	public static Hangman createHangmanGame() {
		Scanner scan = new Scanner(System.in);
		
		String word;
		char[] letters;
		
		System.out.print("Ingrese la palabra secreta: ");
		word = scan.next(); /*Buffer cleaning*/ scan.nextLine();
		letters = new char[word.length()];
		for (int i = 0; i < letters.length; i++) {
			letters[i] = word.charAt(i);
		}
		
		return new Hangman(letters);
	}
	
	public static int length(Hangman h) {
		return h.getSecretWord().length;
	}
	
	public static boolean searchLetter(Hangman h, char c) {
		return (new String(h.getSecretWord()).indexOf(c)) != -1;
	}
	
	public static int timesFound(Hangman h, char c) {
		int timesFound = 0;
		if (searchLetter(h, c)) {
			System.out.printf("La letra \'%c\' fue encontrada %d veces.\n", c, timesFound = new String(h.getSecretWord()).replaceAll("(?i)[^" + c + "]", "").length());
		}
		return timesFound;
	}
	
	public static void showHangmanStage(Hangman h) {
		System.out.println(HangmanStages.HANGMAN_STAGES[h.getCurrentTries()]);
	}
	
	public static void showLettersFound(Hangman h) {
		for (int i = 0; i < h.getLettersFound().length; i++) {
			System.out.printf("[%c] ", h.getLettersFound()[i]);
		}
		System.out.println();
	}
	
	public static void replaceLetters(Hangman h, char c) {
		int replacedLetters = 0;
		for (int i = 0; i < h.getSecretWord().length; i++) {
			if (h.getSecretWord()[i] == c && h.getLettersFound()[i] == '_') {
				h.getLettersFound()[i] = c;
				replacedLetters++;
			}
		}
		h.setLettersFoundCounter(h.getLettersFoundCounter() + replacedLetters);
	}
	
	public static void play() {
		Scanner scan = new Scanner(System.in);
		Hangman h = createHangmanGame();
		
		char letter;
		
		showHangmanStage(h);
		showLettersFound(h);
		
		while (h.getCurrentTries() < h.getMaxTries() && h.getLettersFoundCounter() < h.getSecretWord().length) {
			System.out.print("Ingrese una letra: ");
			letter = scan.nextLine().charAt(0);
			if (timesFound(h, letter) > 0) {
				replaceLetters(h, letter);
			} else {
				h.setCurrentTries(h.getCurrentTries() + 1);
			}
			showHangmanStage(h);
			showLettersFound(h);
		}
		
		if (h.getCurrentTries() == h.getMaxTries()) {
			System.out.println("Busted!");
		} else {
			System.out.println("Victory!");
		}
	}
}
