package exercises.exercise03.service;

import java.util.Arrays;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
*/
public class ArrayService {
	
	//1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
	public static void initializeA(double[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random() * 10;
		}
	}
	
	//2) Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
	public static void showArray(double[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	//3) Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
	public static void sortArray(double[] array) {
		double aux;
		int last = array.length - 1;
		
		//Arrays.sort() ordena los elementos de menor a mayor
		Arrays.sort(array);
		/*
			Como la consigna pide que se ordene de mayor a menor debemos invertir el orden de los elementos del array.
			Para ello realizo un intercambio, partiendo de los extremos y recorriendo hacia el centro.
			Pos 0 <-> 49
			Pos 1 <-> 48
			Pos 2 <-> 47...
			Como se están intercambiando y acomodando 2 elementos por vez, solo es necesario recorrer hasta la mitad del array.
		*/
		for (int i = 0; i < array.length / 2; i++) {
			aux = array[i];
			array[i] = array[last - i];
			array[last - i] = aux;
		}
	}
	
	//4) Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
	public static void initializeB(double[] arrayA, double[] arrayB) {
		/*
			arraycopy() permite copiar elementos de un array a otro. Los parámetros son System.arraycopy(array_1, origen_1, array_2, origen_2, cantidad):
			array_1 : de qué array se copiarán los elementos
			origen_1: desde qué posición de arrayA iniciar a copiar
			array_2 : en qué array se pegarán los elementos
			origen_2: desde qué posición de arrayB iniciar a pegar
			cantidad: cantidad de elementos a copiar
		*/
		System.arraycopy(arrayA, 0, arrayB, 0, arrayB.length / 2);
		Arrays.fill(arrayB, arrayB.length / 2, arrayB.length, .5);
	}
}
