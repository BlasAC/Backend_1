package extras.extra07;

/*
	Este es un ejemplo de que pueden existir más de una clase con el mismo nombre,
	siempre y cuando estén en distintos paquetes. Java las diferenciará por la ruta.

	En este caso, hay otra clase Rectangle en guide07.exercises.exercise04.entities.
*/
import extras.extra07.entities.Rectangle;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
	método "calcular_area" que calcule y devuelva el área del rectángulo.
	Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
	de 4 y 6 y imprime el área del rectángulo.
*/
public class RectangleApp {
	
	public static void main(String[] args) {
		
		Rectangle rectangle1 = new Rectangle(4, 6);
		System.out.println("Área del rectángulo: " + rectangle1.calculateArea());
	}
}
