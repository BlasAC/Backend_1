package guide07.extras.extra07.entities;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
	método "calcular_area" que calcule y devuelva el área del rectángulo.
	Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
	de 4 y 6 y imprime el área del rectángulo.
*/
public class Rectangle {
	
	private double	side_1,
					side_2;
	
	public double calculateArea() {
		return this.side_1 * this.side_2;
	}
	
	public Rectangle(double side_1, double side_2) {
		this.side_1 = side_1;
		this.side_2 = side_2;
	}

	public double getSide_1() {
		return side_1;
	}

	public void setSide_1(double side_1) {
		this.side_1 = side_1;
	}

	public double getSide_2() {
		return side_2;
	}

	public void setSide_2(double side_2) {
		this.side_2 = side_2;
	}
}
