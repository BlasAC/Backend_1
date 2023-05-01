package exercises.exercise02;

import exercises.exercise02.entities.NumberPair;
import exercises.exercise02.service.NumberPairService;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los cuales se realizarán diferentes operaciones
	matemáticas. La clase debe tener un constructor vacío, getters y setters. En el constructor vacío se usará el Math.random para generar los dos números.
	Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
	a) Método mostrarValores que muestra cuáles son los dos números guardados.
	b) Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
	c) Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
	d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/
public class NumberPairApp {
	
	public static void main(String[] args) {
		
		NumberPair np = new NumberPair();
		
		NumberPairService.showValues(np);
		System.out.println("El mayor de los números es: " + NumberPairService.returnLarger(np));
		System.out.println("El menor de los números es: " + NumberPairService.returnSmaller(np));
		NumberPairService.calculatePower(np);
		NumberPairService.calculateRoot(np);
	}
}
