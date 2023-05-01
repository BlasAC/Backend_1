package extras.extra01;

import extras.extra01.entities.SecretMonth;
import extras.extra01.service.SecretMonthService;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses del año, en minúsculas. A
	continuación, declara una variable mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
	programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
	adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
	Adivine el mes secreto.
	Introduzca el nombre del mes en minúsculas:	febrero
	No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
	¡Ha acertado!
*/
public class SecretMonthApp {

	public static void main(String[] args) {
		
		SecretMonth sm = SecretMonthService.createSecretMonth();
		SecretMonthService.guessSecretMonth(sm);
	}
}
