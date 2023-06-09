package extras.extra01.service;

import extras.extra01.entities.SecretMonth;
import java.util.Random;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses del año, en minúsculas. A
	continuación, declara una variable mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
	programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
	adivinar el mes secreto.
*/
public class SecretMonthService {
	
	public static SecretMonth createSecretMonth() {
		Random rand = new Random();
		return new SecretMonth(SecretMonth.MONTHS[rand.nextInt(SecretMonth.MONTHS.length)]);
	}
	
	public static void guessSecretMonth(SecretMonth sm) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Adivina el mes secreto: ");
		while (!scan.nextLine().equalsIgnoreCase(sm.getSecretMonth())) {
			System.out.print("Incorrecto! Intenta nuevamente: ");
		}
		System.out.println("Adivinaste! El mes secreto era " + sm.getSecretMonth().toUpperCase() + "!");
	}
}
