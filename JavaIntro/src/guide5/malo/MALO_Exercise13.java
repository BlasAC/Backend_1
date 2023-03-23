package guide5.malo;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>
	
	Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
*/
public class MALO_Exercise13 {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Esta versión fue hecha junto a compañeros de cursada. Por eso las diferencias de estilo.
		
		String[] equipo;
		int SIZE;
		
		System.out.print("Indique la cantidad de companieros presentes: ");
		SIZE = scan.nextInt();
		
		equipo = new String[SIZE];
	}
}
