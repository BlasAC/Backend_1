package guide3.exercises;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario.
	Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
	Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
	y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
	Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
	Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
*/
public class Exercise07 {

	static Scanner scan = new Scanner(System.in);
	
	//Es una buena práctica evitar el uso de valores literales (números, cadenas de texto, etc.) en el código, algo que se conoce como "hardcodear".
	//Una alternativa (por el momento), es extraer esos elementos y reemplazarlos por CONSTANTES. Esto no solo facilita las modificaciones sino que brinda mayor claridad.
	static final String FDE = "&&&&&";
	static final String START = "X";
	static final String END = "O";
	static final int LENGTH = 5;
	
	public static void main(String[] args) {
		
		String message;
		int goodMessagesCounter = 0, totalMessagesCounter = 0;
		
		System.out.print("Primer mensaje: ");
		
		//En la condición del while se realiza la lectura desde consola, se asigna lo leído a message y se compara con FDE
		while (!(message = scan.next()).equals(FDE)) {
			
			if (message.length() <= LENGTH && message.startsWith(START) && message.endsWith(END)) {
				goodMessagesCounter++;
			}
			
			totalMessagesCounter++;
			
			System.out.print("Siguiente mensaje: ");
		}
		
		System.out.printf("\nDel total de %d mensajes recibidos, se contabilizaron:\n"
				+ "Mensajes validos:\t%d\n"
				+ "Mensajes invalidos:\t%d\n\n", totalMessagesCounter, goodMessagesCounter, totalMessagesCounter - goodMessagesCounter);
	}
}
