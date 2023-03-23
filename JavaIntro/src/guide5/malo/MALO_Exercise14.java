package guide5.malo;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>
	
	Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo.
*/
public class MALO_Exercise14 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Esta versión fue hecha junto a compañeros de cursada. Por eso las diferencias de estilo.
		
		String[] equipo;
		int SIZE;
		
		System.out.print("Indique la cantidad de companieros presentes: ");
		SIZE = scan.nextInt();
		
		equipo = new String[SIZE];
		
		for (int i = 0; i < equipo.length; i++) {
			equipo[i] = scan.nextLine();
		}
	}
}
