package guide08.extras.extra01.service;

import guide08.extras.extra01.entities.Roots;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
		a) Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
		b) Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o
		igual que 0.
		c) Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual
		que 0.
		d) Método obtenerRaices(): llama a tieneRaices() y si devolvió true, imprime las 2 posibles soluciones.
		e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
		f) Método calcular(): este método llamará a tieneRaices() y a tieneRaiz(), y mostrará por pantalla las posibles soluciones que tiene nuestra
		ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se
		mostrará un mensaje.
	Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b.
*/
public class RootsService {
	
	public Roots createEquation() {
		
		Scanner scan = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Indique los coeficientes de la ecuación de la forma ax^2 + bx + c = 0");
		System.out.print("a: ");
		a = scan.nextDouble();
		System.out.print("b: ");
		b = scan.nextDouble();
		System.out.print("c: ");
		c = scan.nextDouble();
		
		return new Roots(a, b, c);
	}
	
	/**
	 * This method calculates the discriminant of a quadratic equation ax^2 + bx + c = 0 using the following formula: (b^2) - 4ac
	 * @param f the Roots object that contains the coefficients of the equation.
	 * @return returns the value of the discriminant.
	 */
	private double getDiscriminant(Roots f) {
		return Math.pow(f.getB(), 2) - 4 * f.getA() * f.getC();
	}
	
	/**
	 * This methods evaluates the discriminant of a quadratic equation and determines whether or not it has two roots.
	 * @param discriminant the discriminant of the equation.
	 * @return true if the equation has two roots, or false otherwise.
	 */
	private boolean hasTwoRoots(double discriminant) {
		return discriminant > 0;
	}
	
	private boolean hasOneRoot(double discriminant) {
		return discriminant == 0;
	}
	
	private void calculateRoots(Roots f, double discriminant) {
		System.out.printf("Raiz 1: %.2f\n"
						+ "Raiz 2: %.2f\n", (-(f.getB()) - Math.sqrt(discriminant)) / (2 * f.getA()), (-(f.getB()) + Math.sqrt(discriminant)) / (2 * f.getA()));
	}
	
	private void calculateRoot(Roots f) {
		System.out.printf("Raices: %.2f\n", (-(f.getB()) / (2 * f.getA())));
	}
	
	public void solveEquation(Roots f) {
		
		double discriminant = getDiscriminant(f);
		
		if (hasOneRoot(discriminant)) {
			calculateRoot(f);
		} else if (hasTwoRoots(discriminant)) {
			calculateRoots(f, discriminant);
		} else {
			System.out.println("La ecuación no tiene soluciones reales.");
		}
	}
}
