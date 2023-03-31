package guide07.extras.extras03.entities;

//import java.util.Random;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números.
	El primer jugador elige un número y el segundo jugador intenta adivinarlo.
	El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento.
	El juego termina cuando el segundo jugador adivina el número o se queda sin intentos.
	Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
*/
public class Game {
	
	private static final int TRIES = 5;
	
	private int	roundsPlayed = 0;
	
	private Player
			player1,
			player2;
	
	public void iniciar_juego() {
		System.out.println("Creando jugadores...");
		this.player1 = new Player();
		this.player2 = new Player();
	}
	
	public void playGame() {
		System.out.println("Iniciando juego...");
		Scanner scan = new Scanner(System.in);
		
		byte option;
		
		do {
			playRound();
			switchRol();
			System.out.print("Desea jugar otra ronda? (1: Seguir - 0: Salir): ");
			option = scan.nextByte();
		} while (option == 1);
	}
	
	public void playRound() {
		System.out.println("Iniciando ronda...");
		
		Player secretHolder, numberGuessr;
		boolean succeed = false;
		int numberGuessed;
		
		this.roundsPlayed++;
		
		if (this.player1.isSecretNumberHolder()) {
			secretHolder = this.player1;
			numberGuessr = this.player2;
		} else {
			secretHolder = this.player2;
			numberGuessr = this.player1;
		}
		
		secretHolder.generateSecretNumber();
		
		System.out.print("Adivine el número secreto: ");
		for	(int i = 0; !succeed && i < TRIES; i++) {
			
			System.out.printf("Intento #%d: ", i);
			
			if ((numberGuessed = numberGuessr.guessNumber()) == secretHolder.getSecretNumber()) {
				succeed = true;
				System.out.println("Acertado!");
				numberGuessr.setTimesWon();
			} else if (!succeed && numberGuessed > secretHolder.getSecretNumber()) {
				System.out.println("El número secreto es menor!");
			} else if (!succeed) {
				System.out.println("El número secreto es mayor!");
			}
			numberGuessr.setTriesMade();
		}
		
		if (!succeed) {
			secretHolder.setTimesWon();
		}
	}
	
	public void switchRol() {
		System.out.println("Intercambiando roles...");
		if (this.player1.isSecretNumberHolder()) {
			this.player1.setSecretNumberHolder(false);
			this.player2.setSecretNumberHolder(true);
		} else {
			this.player1.setSecretNumberHolder(true);
			this.player2.setSecretNumberHolder(false);
		}
	}
	
	public Game() {
		this.iniciar_juego();
	}

	public Player getPlayer1() {
		return player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public int getRoundsPlayed() {
		return roundsPlayed;
	}
}
