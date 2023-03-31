package guide07.extras.extras03;

import guide07.extras.extras03.entities.Game;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números.
	El primer jugador elige un número y el segundo jugador intenta adivinarlo.
	El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento.
	El juego termina cuando el segundo jugador adivina el número o se queda sin intentos.
	Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
*/
public class GameApp {
	
	public static void main(String[] args) {
		
		Game game = new Game();
		
		game.playGame();
		System.out.printf("Juego finalizado!\n"
				+ "Se jugaron %d rondas, de las que\n"
				+ "El jugador 1 ganó %d rondas, con %d intentos.\n"
				+ "El jugador 2 ganó %d rondas, con %d intentos.\n\n", game.getRoundsPlayed(), game.getPlayer1().getTimesWon(), game.getPlayer1().getTriesMade(), game.getPlayer2().getTimesWon(), game.getPlayer2().getTriesMade());
	}
}
