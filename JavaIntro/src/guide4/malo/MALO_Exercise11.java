package guide4.malo;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>
	
	Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, y luego codifique la palabra o frase ingresada	de la
	siguiente manera: cada vocal se reemplaza por el carácter	que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.

	a e i o u
	@ # $ % *

	Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. Utilice la estructura “según” para la transformación. 
	Por ejemplo, si el usuario ingresa:	Ayer, lunes, salimos a las once y 10.
	La salida del programa debería ser:	@y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
*/
public class MALO_Exercise11 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String sentence;
		
		System.out.print("Ingrese una frase: ");
		sentence = scan.nextLine();
		
		System.out.printf("\nFrase original:   %s", sentence);
		System.out.printf("\nFrase codificada: %s\n\n", encodeString(sentence.toLowerCase()));
	}

	public static String encodeString(String string) {
		
		for (int i = 0; i < string.length(); i++) {
			
			switch (string.substring(i, i + 1)) { //Solo porque lo pide el ejercicio :/
				case "a":
					string = string.replaceFirst("a", "@");
					break;
				case "e":
					string = string.replaceFirst("e", "#");
					break;
				case "i":
					string = string.replaceFirst("i", "\\$");
					break;
				case "o":
					string = string.replaceFirst("o", "%");
					break;
				case "u":
					string = string.replaceFirst("u", "*");
					break;
			}
		}
		return string;
	}
}
