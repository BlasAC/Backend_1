package guide09.extras.extra02.entities;

import java.util.Arrays;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, un vector con la palabra a buscar, la
	cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario.
*/
public class Hangman {
	
	private final char[] secretWord;
	private final char[] lettersFound;
	private final int maxTries;
	private int lettersFoundCounter;
	private int currentTries;

	public Hangman(char[] secretWord) {
		this.secretWord = secretWord;
		this.lettersFound = new char[secretWord.length];
		Arrays.fill(lettersFound, '_');
		this.maxTries = HangmanStages.HANGMAN_STAGES.length - 1;
		this.lettersFoundCounter = 0;
		this.currentTries = 0;
	}

	public char[] getSecretWord() {
		return secretWord;
	}

	public char[] getLettersFound() {
		return lettersFound;
	}

	public int getMaxTries() {
		return maxTries;
	}

	public int getLettersFoundCounter() {
		return lettersFoundCounter;
	}

	public void setLettersFoundCounter(int lettersFoundCounter) {
		this.lettersFoundCounter = lettersFoundCounter;
	}

	public int getCurrentTries() {
		return currentTries;
	}

	public void setCurrentTries(int currentTries) {
		this.currentTries = currentTries;
	}
}
