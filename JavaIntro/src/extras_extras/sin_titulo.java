package extras_extras;

//Crear una matriz de 5×7, donde 5 representan la semana de un mes y 7 los días de la semana
//La estructura registrara la temperatura diaria de una cabina de pago, estos oscilan entre los 10 y 38 grados.
//deberá llenar la matriz de forma aleatoria para el mes de mayo donde el primer dia inicia en lunes y el
//ultimo (31) se ubica en el miercoles.
//Se nos pide hacer lo siguiente:
//? Obtener la temperatura mas alta y baja de la semana y que dia se produjo (lunes,martes, etc etc).
//? Promedio temperatura de la semana.
//? Temperatura mas alta del mes y su dia.

public class sin_titulo {
	
//	Algoritmo sin_titulo
	public static void main(String[] args) {
	
//		Definir semanas, dias, cantDias Como Entero
		int semanas, dias, cantDias;

//		Definir listaTemperaturas Como Real
		double listaTemperaturas[][];

//		semanas = 5
		semanas = 5;
//		dias = 7
		dias = 7;
//		cantDias = 31
		cantDias = 31;

//		Dimension listaTemperaturas[semanas, dias]
		listaTemperaturas = new double[semanas][dias];

//		Escribir "Obtaining data from API..."
		System.out.println("Obtaining data from API...");
//		llenarArray(listaTemperaturas, semanas, dias, cantDias)
		llenarArray(listaTemperaturas, semanas, dias, cantDias);
//		mostrarArray(listaTemperaturas, semanas, dias, cantDias)
		mostrarArray(listaTemperaturas, semanas, dias, cantDias);
//		calcularMinMax(listaTemperaturas, semanas, dias, cantDias)
		calcularMinMax(listaTemperaturas, semanas, dias, cantDias);
		
//	FinAlgoritmo
	}
	
//	SubProceso calcularMinMax(array, f, c, cantDias)
	public static void calcularMinMax(double array[][], int f, int c, int cantDias) {
//		Definir i, j, contDiasMes, contDiasSemana, min_i, min_j, max_i, max_j, maxAbs_i, maxAbs_j Como Entero
		int i, j, contDiasMes, contDiasSemana, min_i, min_j, max_i, max_j, maxAbs_i, maxAbs_j;
		
//		Definir sumaTemperaturas Como Real
		double sumaTemperaturas;

//		contDiasMes = 1
		contDiasMes = 1;
//		maxAbs_i = 0
		maxAbs_i = 0;
//		maxAbs_j = 0
		maxAbs_j = 0;
		
//		Para i = 0 Hasta f - 1
		for (i = 0; i <= f - 1; i++) {
		
//			min_i = i
			min_i = i;
//			min_j = 0
			min_j = 0;
//			max_i = i
			max_i = i;
//			max_j = 0
			max_j = 0;
//			contDiasSemana = 0
			contDiasSemana = 0;
//			sumaTemperaturas = 0
			sumaTemperaturas = 0;

//			Para j = 0 Hasta c - 1
			for (j = 0; j <= c - 1; j++) {
//				contDiasMes = contDiasMes + 1
				contDiasMes = contDiasMes + 1;
//				contDiasSemana = contDiasSemana + 1
				contDiasSemana = contDiasSemana + 1;
//				sumaTemperaturas = sumaTemperaturas + array[i, j]
				sumaTemperaturas = sumaTemperaturas + array[i][j];

//				Si array[i, j] < array[min_i, min_j]
				if (array[i][j] < array[min_i][min_j]) {
//					min_i = i
					min_i = i;
//					min_j = j
					min_j = j;
//				SiNo
				} else {
//					Si array[i, j] > array[max_i, max_j]
					if (array[i][j] > array[max_i][max_j]) {
//						max_i = i
						max_i = i;
//						max_j = j
						max_j = j;
//					FinSi
					}
//				FinSi
				}

//				Si contDiasMes > cantDias
				if (contDiasMes > cantDias) {
//					i = f
					i = f;
//					j = c
					j = c;
//				FinSi
				}
//			FinPara
			}
//
//			Escribir "Max (", diaSemana(max_j), "): ", array[max_i, max_j], "     Min (", diaSemana(min_j), "): ", array[min_i, min_j]
			System.out.printf("Max (%s): %.2f\tMin (%s): %.2f\n", diaSemana(max_j), array[max_i][max_j], diaSemana(min_j), array[min_i][min_j]);
//			Escribir "Promedio: ", sumaTemperaturas / contDiasSemana
			System.out.printf("Promedio: %.2f\n", (sumaTemperaturas / contDiasSemana));
//			Escribir ""
			System.out.println("");

//			Si array[max_i, max_j] > array[maxAbs_i, maxAbs_j]
			if (array[max_i][max_j] > array[maxAbs_i][maxAbs_j]) {
//				maxAbs_i = max_i
				maxAbs_i = max_i;
//				maxAbs_j = max_j
				maxAbs_j = max_j;
//			FinSi
			}
//
//		FinPara
		}
		
//		Escribir "La temperatura mas alta del mes fue ", array[maxAbs_i, maxAbs_j], ", y se dio el dia ", diaSemana(maxAbs_j)
		System.out.printf("La temperatura mas alta del mes fue %.2f, y se dio el dia %s", array[maxAbs_i][maxAbs_j], diaSemana(maxAbs_j));
			
//	FinSubProceso
	}
	
//	Funcion return = diaSemana(indice)
	public static String diaSemana(int indice) {
//		Definir return Como Caracter

//		Segun indice
		switch (indice) {
//			0: return = "Lunes"
			case 0: return "Lunes";
//			1: return = "Martes"
			case 1: return "Martes";
//			2: return = "Miercoles"
			case 2: return "Miercoles";
//			3: return = "Jueves"
			case 3: return "Jueves";
//			4: return = "Viernes"
			case 4: return "Viernes";
//			5: return = "Sabado"
			case 5: return "Sabado";
//			6: return = "Domingo"
			case 6: return "Domingo";
//		FinSegun
		}
		return null;
//	FinFuncion
	}
	
//	SubProceso mostrarArray(array, f, c, cantDias)
	public static void mostrarArray(double[][] array, int f, int c, int cantDias) {
//		Definir i, j, cont Como Entero
		int i, j, cont;
		
//		cont = 1
		cont = 1;
		
//		Para i = 0 Hasta f - 1
		for (i = 0; i <= f - 1; i++) {
//			Para j = 0 Hasta c - 1
			for (j = 0; j <= c - 1; j++) {
//				Escribir Sin Saltar " [", array[i, j], "] "
				System.out.printf(" [%02.2f] ", array[i][j]);
//				cont = cont + 1
				cont = cont + 1;
//				Si cont > cantDias
				if (cont > cantDias) {
//					i = f
					i = f;
//					j = c
					j = c;
//				FinSi
				}
//			FinPara
			}
//			Escribir ""
			System.out.println("");
//		FinPara
		}
//	FinSubProceso
	}
	
//	SubProceso llenarArray(array, f, c, cantDias)
	public static void llenarArray(double[][] array, int f, int c, int cantDias) {
//		Definir i, j, cont Como Entero
		int i, j, cont;
		
//		cont = 1
		cont = 1;
		
//		Para i = 0 Hasta f - 1
		for (i = 0; i <= f - 1; i++) {
//			Para j = 0 Hasta c - 1
			for (j = 0; j <= c - 1; j++) {
//				array[i, j] = Aleatorio(10, 38)
				array[i][j] = Math.random() * 31 + 7;
//				cont = cont + 1
				cont = cont + 1;
//				Si cont > cantDias
				if (cont > cantDias) {
//					i = f
					i = f;
//					j = c
					j = c;
//				FinSi
				}
//			FinPara
			}
//		FinPara
		}
//	FinSubProceso
	}
}