package guide03.exercises;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
	* * * *
	*     *
	*     *
	* * * *
*/
public class Exercise08 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Ingrese el tamanio del cuadrado: ");
		
		//Los bucles for son mucho más flexibles que su contrapartida de PSeInt
		//En este ejemplo se realiza la asignación a size, de lo leído por el Scanner, en la sentencia de inicialización.
		for (int i = 0, size = scan.nextInt(); i < size; i++) {
			for (int j = 0; j < size; j++) {
				
				//Operador ternario <?>
				//<condicion> ? <retornoPorVerdadero> : <retornoPorFalso>;
				System.out.printf("%s", (i == 0 | j == 0 | i == (size - 1) | j == size - 1) ? " * " : "   ");
			}
			System.out.print("\n");
		}
		
		//Esto es un buen ejemplo de lo que NO DEBE HACERSE cuando se trabaja en equipo.
//		for (int i = 0, j = 0, size = scan.nextInt(); i < size; System.out.printf("%s", (i == 0 | j == 0 | i == (size - 1) | j == size - 1) ? j == size - 1 ? " * \n" : " * " : "   "), i += j == size - 1 ? 1 : 0, j = j == size - 1 ? 0 : ++j);
	}
}
