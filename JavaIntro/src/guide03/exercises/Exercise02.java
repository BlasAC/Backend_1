package guide03.exercises;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
	Nota: investigar la función equals() en Java.
*/
public class Exercise02 {
	
	static Scanner scan = new Scanner(System.in);
	
	//final: indica que se está declarando e inicializando una CONSTANTE (por convención se suelen escribir en mayúsculas). Su contenido no puede ser modificado.
	static final String PASSWORD = "eureka";
	
	public static void main(String[] args) {
		
		System.out.print("Ingrese una palabra o frase: ");
		
		//En este caso no se guarda lo leído por el Scanner sino que se utiliza el retorno inmediatamente para compararlo con PASSWORD.
		if (scan.nextLine().equals(PASSWORD)) {
			System.out.println("CORRECTO.");
		} else {
			System.out.println("INCORRECTO.");
		}
	}
}
