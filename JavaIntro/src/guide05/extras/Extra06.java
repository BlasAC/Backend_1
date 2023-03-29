package guide05.extras;

import java.util.Random;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando,
	construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal
	en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
	rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
	Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().
*/
public class Extra06 {
	
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	
	//Otra forma posible de declarar y/o inicializar variables/constantes
	static final int
			RANDOM_MIN = 65,
			RANDOM_MAX = 90,
			ARRAY_SIZE = 20,
			WORD_COUNT = 5,
			MIN_WORD_LENGTH = 3,
			MAX_WORD_LENGTH = 5;
	
	public static void main(String[] args) {
		
		char[][] wordSearch = new char[ARRAY_SIZE][ARRAY_SIZE];
		
		for (int i = 0; i < WORD_COUNT; i++) {
			insertWord(wordSearch, getNextWord());
		}
		
		fillArray(wordSearch);
		showArray(wordSearch);
	}
	
	static String getNextWord() {
		
		String nextWord;
		
		do {
			System.out.printf("Ingrese una palabra de entre %d y %d caracteres: ", MIN_WORD_LENGTH, MAX_WORD_LENGTH);
			nextWord = scan.nextLine();
		} while (nextWord.length() < MIN_WORD_LENGTH | nextWord.length() > MAX_WORD_LENGTH);
		
		return nextWord;
	}
	
	static void insertWord(char[][] wordSearch, String nextWord) {
		
		int row, column;
		boolean spaceFound;
		
		do {
			
			do {
				row = rand.nextInt(wordSearch.length);
				column = rand.nextInt(wordSearch[row].length);
			} while (column + nextWord.length() - 1 >= wordSearch[row].length);
			
			spaceFound = wordSearch[row][column] == 0;
			
			for (int i = 1; i < nextWord.length() && spaceFound; i++) {
				spaceFound = wordSearch[row][column + i] == 0;
			}
		} while (!spaceFound);
		
		for (int i = 0; i < nextWord.length(); i++) {
			wordSearch[row][column + i] = nextWord.toUpperCase().charAt(i);
		}
	}

	static void fillArray(char[][] wordSearch) {
		for (int i = 0; i < wordSearch.length; i++) {
			for (int j = 0; j < wordSearch[i].length; j++) {
				if (wordSearch[i][j] == 0) {
					wordSearch[i][j] = (char) (rand.nextInt(RANDOM_MAX - RANDOM_MIN + 1) + RANDOM_MIN);
				}
			}
		}
	}

	static void showArray(char[][] wordSearch) {
		System.out.println("");
		for (char[] characters : wordSearch) {
			for (char character : characters) {
				System.out.printf(" %s ", character);
			}
			System.out.println("");
		}
	}
}
