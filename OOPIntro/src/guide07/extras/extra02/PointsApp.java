package guide07.extras.extra02;

import guide07.extras.extra02.entities.Points;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>
	
	Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
	sus atributos serán x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto
	puntos usando un método crearPuntos() que le pide al usuario los dos números y los
	ingresa en los atributos del objeto. Después, a través de otro método calcular y
	devolver la distancia que existe entre los dos puntos que existen en la clase Puntos.
	Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:
	http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
*/
public class PointsApp {
	
	public static void main(String[] args) {
		
		Points points = Points.createPoint();
		
		System.out.printf("La distancia entre A (%d; %d) y B (%d, %d) es: %.4f\n\n", points.getX1(), points.getY1(), points.getX2(), points.getY2(), points.calculateDistance());
	}
}
