package extras_extra.extra01.service;

import extras_extra.extra01.entities.Time;
import java.util.Scanner;
/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	En la clase TimeService implementar el método imprimirHoraCompleta().
	Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario.
*/
public class TimeService {
	
	Scanner scan = new Scanner(System.in);
	
	public Time crearTiempo() {
		int hours, minutes, seconds;
		boolean valid = false;
		
		do {
			System.out.print("Horas: ");
			hours = scan.nextInt();
			System.out.print("Minutos: ");
			minutes = scan.nextInt();
			System.out.print("Segundos: ");
			seconds = scan.nextInt();
			
			if (seconds >= 60) {
				minutes += seconds / 60;
				seconds = seconds % 60;
			}
			if (minutes >= 60) {
				hours += minutes / 60;
				minutes = minutes % 60;
			}
			if (hours >= 0 && hours < 24) {
				valid = true;
			} else {
				System.out.println("Hora fuera de rango.");
			}
		} while (!valid);
		
		return new Time(hours, minutes, seconds);
	}
	
	public void imprimirHoraCompleta(Time tiempo) {
		if (tiempo == null) {
			System.out.println("Primero debería invocar a crearTiempo()");
		} else {
			System.out.println("Hora: " + tiempo.toString());
		}
	}
}
