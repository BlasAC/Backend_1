package guide7.extras.entities;

import java.util.Random;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números.
	El primer jugador elige un número y el segundo jugador intenta adivinarlo.
	El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento.
	El juego termina cuando el segundo jugador adivina el número o se queda sin intentos.
	Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
*/
public class Player {
	
	private static final int
			MIN = 0,
			MAX = 20;
	
	private int
			timesWon = 0,
			triesMade = 0,
			secretNumber;
	
	private boolean secretNumberHolder = false;

	public int getTriesMade() {
		return triesMade;
	}

	public void setTriesMade() {
		this.triesMade++;
	}

	public void generateSecretNumber() {
		
		System.out.printf("Número secreto entre %d y %d generado.\n", MIN, MAX);
		
		Random rand = new Random();
		this.secretNumber = rand.nextInt(MAX - MIN + 1) + MIN;
		this.secretNumberHolder = true;
	}
	
	public int guessNumber() {
		return (new Scanner(System.in)).nextInt();
	}

	public int getSecretNumber() {
		return secretNumber;
	}

	public void setSecretNumber(int secretNumber) {
		this.secretNumber = secretNumber;
	}

	public boolean isSecretNumberHolder() {
		return secretNumberHolder;
	}

	public void setSecretNumberHolder(boolean secretNumberHolder) {
		this.secretNumberHolder = secretNumberHolder;
	}
	
	public int getTimesWon() {
		return timesWon;
	}

	public void setTimesWon() {
		this.timesWon++;
	}
}
