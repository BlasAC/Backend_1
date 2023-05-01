package exercises.exercise02.entities;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
	Método constructor que inicialice el radio pasado como parámetro.
	Métodos get y set para el atributo radio de la clase Circunferencia.
	Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
	Método area(): para calcular el área de la circunferencia (Area=π*radio^2).
	Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
*/
public class Circle {
	
	private double radius;
	
	public static Circle createCircle() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Indique el radio de la circunferencia: ");
		
		return new Circle(scan.nextDouble());
	}
	
	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double calculatePerimeter() {
		return Math.PI * 2 * radius;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle{" + "radius=" + radius + '}';
	}
}
