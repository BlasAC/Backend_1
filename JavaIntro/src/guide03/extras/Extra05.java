package guide03.extras;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Una obra social tiene tres clases de socios:
	Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
	Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
	Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
	Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento
	(previo al descuento) y determine el importe en efectivo a pagar por dicho socio.
*/
public class Extra05 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		char affiliateType;
		double treatmentBaseCost;
		
		System.out.print("Indique que tipo de socio es (A, B o C): ");
		affiliateType = scan.next().toUpperCase().charAt(0);
		
		System.out.print("Indique el costo base del tratamiento: ");
		treatmentBaseCost = scan.nextDouble();
		
		//Incluso en bloques pequeños y con pocas sentencias se pierde mucha claridad si se amontona todo.
		switch (affiliateType) {
			case 'A': System.out.printf("\nCosto final para socios tipo %c: %.2f\n\n", affiliateType, treatmentBaseCost * .5); break;
			case 'B': System.out.printf("\nCosto final para socios tipo %c: %.2f\n\n", affiliateType, treatmentBaseCost * .65); break;
			case 'C': System.out.printf("\nCosto final para socios tipo %c: %.2f\n\n", affiliateType, treatmentBaseCost); break;
			default: System.out.print("\nEl tipo ingresado es incorrecto.\n\n");
		}
	}
}
