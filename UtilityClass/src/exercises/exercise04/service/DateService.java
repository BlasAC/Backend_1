package exercises.exercise04.service;

import java.util.Calendar;
import static java.util.Calendar.YEAR;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Vamos a usar la clase Date que ya existe en Java.
	Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
*/
public class DateService {
	
	//a) Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
	//El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
	public static Calendar birthDate() {
		Scanner scan = new Scanner(System.in);
		int year, month, day;
		
		System.out.println("Ingrese su fecha de nacimiento, un elemento por vez.");
		System.out.print("Indique el día: ");
		day = scan.nextInt();
		System.out.print("Indique el mes: ");
		month = scan.nextInt();
		System.out.print("Indique el año: ");
		year = scan.nextInt();
		
		//Calendar es abstract, por lo que no puede instanciarse. En su lugar debemos pedirle una a getInstance().
		//En nuestro caso, lo que esto nos devuelve es un objeto GregorianCalendar.
		Calendar date = Calendar.getInstance();
		
		date.set(year, month - 1, day);
		
		return date;
	}
	
	//b) Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date.
	//Ejemplo: Date fechaActual = new Date(); El método debe retornar el objeto Date.
	public static Calendar currentDate() {
		return Calendar.getInstance();
	}
	
	//c) Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
	public static int yearDifference(Calendar currentDate, Calendar birthDate) {
		
		//En el ejercicio 5 hago una comparación que tiene en cuenta tanto el mes como el día.
		return currentDate.get(YEAR) - birthDate.get(YEAR);
	}
}
