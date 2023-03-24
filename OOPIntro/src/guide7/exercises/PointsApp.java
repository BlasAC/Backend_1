package guide7.exercises;

import guide7.exercises.entities.Points;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>
*/
public class PointsApp {
	
	public static void main(String[] args) {
		
		Points points = Points.createPoint();
		
		System.out.printf("La distancia entre A (%d; %d) y B (%d, %d) es: %.4f\n\n", points.getX1(), points.getY1(), points.getX2(), points.getY2(), points.calculateDistance());
	}
}
