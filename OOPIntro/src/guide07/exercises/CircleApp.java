package guide07.exercises;

import guide07.exercises.entities.Circle;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
	Método constructor que inicialice el radio pasado como parámetro.
	Métodos get y set para el atributo radio de la clase Circunferencia.
	Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
	Método area(): para calcular el área de la circunferencia (Area=π*radio^2).
	Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
*/
public class CircleApp {
	
	public static void main(String[] args) {
		
		Circle circle = Circle.createCircle();
		
		System.out.println("Area: " + circle.calculateArea());
		System.out.println("Perímetro: " + circle.calculatePerimeter() + "\n");
	}
}
