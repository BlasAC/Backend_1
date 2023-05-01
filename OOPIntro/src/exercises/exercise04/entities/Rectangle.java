package exercises.exercise04.entities;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura.
	La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario.
	También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo.
	Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
	Se deberán además definir los métodos getters, setters y constructores correspondientes.
	Superficie = base * altura / Perímetro = (base + altura) * 2.
*/
public class Rectangle {
	
	private int
			base,
			height;
	
	public static Rectangle createRectangle() {
		Scanner scan = new Scanner(System.in);
		
		int base, height;
		
		System.out.println("Ingrese las medidas del rectángulo a crear");
		System.out.print("Base: ");
		base = scan.nextInt();
		System.out.print("Altura: ");
		height = scan.nextInt();
		
		return new Rectangle(base, height);
	}
	
	public void drawRectangle() {
		for (int i = 0; i < this.height; i++) {
			for (int j = 0; j < this.base; j++) {
				System.out.printf("%s", i == 0 || j == 0 || i == this.height - 1 || j == this.base - 1 ? " *" : "  ");
			}
			System.out.println("");
		}
	}
	
	public int calculateArea() {
		return base * height;
	}
	
	public int calculatePerimeter() {
		return (base + height) * 2;
	}
	
	public Rectangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle{" + "base=" + base + ", height=" + height + '}';
	}
}
