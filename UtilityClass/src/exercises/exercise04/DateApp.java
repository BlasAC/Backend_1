package exercises.exercise04;

import exercises.exercise04.service.DateService;
import java.util.Calendar;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
	a) Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
	El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =	new Date(anio, mes, dia);
	b) Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date.
	Ejemplo: Date fechaActual = new Date(); El método debe retornar el objeto Date.
	c) Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
	Si necesiten acá tienen más información en clase Date: Documentacion Oracle
*/
public class DateApp {

	public static void main(String[] args) {
		//En el ejercicio 5 utilizo la clase Date. En este caso opté por investigar la clase Calendar.
		Calendar bd1 = DateService.birthDate();
		Calendar cd = DateService.currentDate();
		System.out.println(bd1.getClass());
		System.out.println(bd1.getTime());
		System.out.println("Este año el usuario tendrá: " + DateService.yearDifference(cd, bd1) + " años.");
	}
}
