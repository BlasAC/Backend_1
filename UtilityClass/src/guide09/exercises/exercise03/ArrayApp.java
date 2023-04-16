package guide09.exercises.exercise03;

import guide09.exercises.exercise03.service.ArrayService;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. Crear la clase ArregloService, en el
	paquete servicio, con los siguientes métodos:
	1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
	2) Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
	3) Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
	4) Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
	En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
*/
public class ArrayApp {
	
	public static void main(String[] args) {
		
		double[] arrayA = new double[50];
		double[] arrayB = new double[20];
		
		ArrayService.initializeA(arrayA);
		ArrayService.showArray(arrayA);
		ArrayService.sortArray(arrayA);
		ArrayService.initializeB(arrayA, arrayB);
		ArrayService.showArray(arrayA);
		ArrayService.showArray(arrayB);
	}
}
