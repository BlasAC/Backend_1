package extras.extra02.entities;

import java.util.Scanner;

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
public class Points {
	
	//De golpe, después de recomendar acertadamente que las clases sean sustantivos en singular,
	//piden declarar una clase en plural... .-.
	
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	public double calculateDistance() {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
	
	public static Points createPoint() {
		Scanner scan = new Scanner(System.in);
		
		int x1, x2, y1, y2;
		
		System.out.println("Ingrese las coordenadas del primer punto:");
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		System.out.println("Ingrese las coordenadas del segundo punto:");
		x2 = scan.nextInt();
		y2 = scan.nextInt();
		
		return new Points(x1, x2, y1, y2);
	}
	
	public Points(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	@Override
	public String toString() {
		return "Points{" + "x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + '}';
	}
}
