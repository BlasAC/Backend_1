package guide3.malo;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".
	El programa deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
	Nota: recordar el uso de la sentencia break.
*/
public class MALO_Exercise09 {
	
	static Scanner scan = new Scanner(System.in);
	
	static final byte LIMIT = 20;
	
	public static void main(String[] args) {
		
		float number, sum = 0;
		
		for (byte i = 0; i < LIMIT; i++) {
			
			System.out.print("Ingrese un numero: ");
			
			if ((number = scan.nextFloat()) == 0) {
				System.out.println("Se capturo el numero cero.");
				break;
			}
			
			if (number > 0) {
				sum += number;
			}
		}
		
		System.out.println("Suma de los numeros ingresados: " + sum);
	}
}
