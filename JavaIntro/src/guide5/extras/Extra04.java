package guide5.extras;


import java.util.Random;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos
	para luego obtener una cantidad de aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas,
	2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
	Primer trabajo práctico evaluativo 10%
	Segundo trabajo práctico evaluativo 15%
	Primer Integrador 25%
	Segundo integrador 50%
	Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
	Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados,
	teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
*/
public class Extra04 {
	
	private static final Random rand = new Random();
	
	private static final int	RANDOM_MIN = 0,
								RANDOM_MAX = 10,
								STUDENT_COUNT = 10,
								SCORE_COUNT = 4;
	
	public static void main(String[] args) {
		
		
		
		int[][] studentScores = new int[STUDENT_COUNT][SCORE_COUNT];
		int[] studentFinalScores = new int[STUDENT_COUNT];
		int approvedStudents;
		
		loadScores(studentScores);
		calculateFinalScore(studentScores, studentFinalScores);
		
		System.out.printf("\nDe los %d alumnos, %d aprobaron y %d desaprobaron.\n\n", studentFinalScores.length, approvedStudents = countApprovedStudents(studentFinalScores), studentFinalScores.length - approvedStudents);
	}
	
	private static void loadScores(int[][] studentScores) {
		System.out.println("Ingrese las notas de cada alumno.");
		for (int i = 0; i < studentScores.length - 1; i++) {
			for (int j = 0; j < studentScores[i].length; j++) {
				System.out.printf("Alumno Nro. %d - Nota #%d: %d\n", i + 1, j + 1, studentScores[i][j] = rand.nextInt(RANDOM_MAX - RANDOM_MIN + 1) + RANDOM_MIN);
			}
		}
	}

	private static void calculateFinalScore(int[][] studentScores, int[] studentFinalScores) {
		for (int i = 0; i < studentScores.length; i++) {
			//Estos porcentajes literales deberían ser extraídos y reemplazados por sus respectivas CONSTANTES.
			studentFinalScores[i] = (int) (studentScores[i][0] * .1 + studentScores[i][1] * .15 + studentScores[i][2] * .25 + studentScores[i][3] * .5);
		}
	}

	private static int countApprovedStudents(int[] studentFinalScores) {
		int approvedStudents = 0;
		
		for (int i = 0; i < studentFinalScores.length; i++) {
			if (studentFinalScores[i] >= 7) {
				approvedStudents++;
			}
		}
		
		return approvedStudents;
	}
}
