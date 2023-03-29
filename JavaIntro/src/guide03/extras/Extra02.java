package guide03.extras;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. A continuación, realizar las instrucciones necesarias para que:
	B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable.
	Utilizar sólo una variable auxiliar.
*/
public class Extra02 {
	
	public static void main(String[] args) {
		
		int A, B, C, D, aux;
		
		A = 2;
		B = 3;
		C = 5;
		D = 7;
		
		System.out.printf("A: %d\tB: %d\tC: %d\tD: %d\n", A, B, C, D);
		
		aux = B;
		B = C;
		C = A;
		A = D;
		D = aux;
		
		System.out.printf("A: %d\tB: %d\tC: %d\tD: %d\n", A, B, C, D);
	}
}
