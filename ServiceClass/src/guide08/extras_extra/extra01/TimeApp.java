package guide08.extras_extra.extra01;

import guide08.extras_extra.extra01.entities.Time;
import guide08.extras_extra.extra01.service.TimeService;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Te	animas a simular el paso del tiempo en consola??????
*/
public class TimeApp {
	
	public static void main(String[] args) {
		
		TimeService ts = new TimeService();
		
		Time t1 = ts.crearTiempo();
		ts.imprimirHoraCompleta(t1);
		
		while (true) {
			//El uso del bloque try-catch es para calmar al IDE respecto al uso de un Thread.sleep() en un bucle.
			try {
				Thread.sleep(1000l);
			} catch (InterruptedException ex) {
				System.out.println(ex);
			}
			System.out.printf("%02d:%02d:%02d\n", t1.getHours(), t1.getMinutes(), t1.getSeconds());
			t1.setSeconds(t1.getSeconds() + 1);
		}
	}
}
