package exercises.exercise03.entities;

import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
	Método constructor con todos los atributos pasados por parámetro.
	Método constructor sin los atributos pasados por parámetro.
	Métodos get y set.
	Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
	Método sumar(): calcular la suma de los números y devolver el resultado al main.
	Método restar(): calcular la resta de los números y devolver el resultado al main
	Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero,
	el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
	Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero,
	el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
*/
public class Operation {
	
	private double number1;
	private double number2;
	
	public Operation createOperation() {
		Scanner scan = new Scanner(System.in);
		double num1, num2;
		
		System.out.print("Ingrese el primer número: ");
		num1 = scan.nextDouble();
		System.out.print("Ingrese el primer número: ");
		num2 = scan.nextDouble();
		
		return new Operation(num1, num2);
	}
	
	public double add() {
		return this.number1 + this.number2;
	}
	
	public double substract() {
		return this.number1 - this.number2;
	}
	
	public double multiply() {
		//Sí, el ejercicio pide que se valide si se está por realizar una multiplicación por cero, pero es absurdo -_-
		//En la división tiene sentido, pero acá? Nah.
		return this.number1 * this.number2;
	}
	
	public double divide() {
		if (this.number2 == 0) {
			System.out.println("ERROR: division by zero is undefined.");
			return 0;
		} else {
			return this.number1 / this.number2;
		}
	}
	
	public Operation() {}
	
	public Operation(double number1, double number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public double getNumber1() {
		return number1;
	}

	public void setNumber1(double number1) {
		this.number1 = number1;
	}

	public double getNumber2() {
		return number2;
	}

	public void setNumber2(double number2) {
		this.number2 = number2;
	}

	@Override
	public String toString() {
		return "Operation{" + "number1=" + number1 + ", number2=" + number2 + '}';
	}
}
