package guide3.malo;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos que se trata del tipo de motor de una bomba para mover fluidos).
	Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
	o	Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
	o	Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
	o	Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
	o	Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
	o	Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”
*/
public class MALO_Exercise07 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		byte tipoMotor;
		
		System.out.print("Ingrese el tipo de motor (1-4): ");
		
		switch (tipoMotor = scan.nextByte()) {
			case 1: System.out.println("Es un motor de bomba de agua."); break;
			case 2: System.out.println("Es un motor de bomba de gasolina."); break;
			case 3: System.out.println("Es un motor de bomba de hormigón."); break;
			case 4: System.out.println("Es un motor de bomba de pasta alimenticia."); break;
			default: System.out.println(tipoMotor + " no es un tipo válido de motor."); break;
		}
	}
}
