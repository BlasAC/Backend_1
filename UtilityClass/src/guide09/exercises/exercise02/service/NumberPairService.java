package guide09.exercises.exercise02.service;

import guide09.exercises.exercise02.entities.NumberPair;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
*/
public class NumberPairService {

	//a) Método mostrarValores que muestra cuáles son los dos números guardados.
	public static void showValues(NumberPair np) {
		System.out.println(np);
	}
	
	//b) Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
	public static double returnLarger(NumberPair np) {
		
		double n1 = np.getNumber1();
		double n2 = np.getNumber2();
		
		if (n1 > n2) {
			return n1;
		} else {
			return n2;
		}
	}
	
	public static double returnSmaller(NumberPair np) {
		
		double n1 = np.getNumber1();
		double n2 = np.getNumber2();
		
		//Un método aritmético que evita realizar comparaciones.
		//No sé si es más rápido o mejor, simplemente lo dejo como un dato de color.
		return (n1 + n2 - Math.abs(n1 - n2)) / 2;
	}
	
	//c) Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
	public static void calculatePower(NumberPair np) {
		System.out.printf("%d^%d = %d\n", Math.round(returnLarger(np)), Math.round(returnSmaller(np)), (int) Math.pow(Math.round(returnLarger(np)), Math.round(returnSmaller(np))));
	}
	
	//d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
	public static void calculateRoot(NumberPair np) {
		System.out.printf("Sqrt(%.2f) = %.2f\n", Math.abs(returnSmaller(np)), Math.sqrt(Math.abs(returnSmaller(np))));
	}
}
