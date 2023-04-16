package guide09.exercises.exercise02.entities;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los cuales se realizarán diferentes operaciones
	matemáticas. La clase debe tener un constructor vacío, getters y setters. En el constructor vacío se usará el Math.random para generar los dos números.
*/
public class NumberPair {

	private double number1;
	private double number2;
	
	public NumberPair() {
		this.number1 = Math.random() * 10;
		this.number2 = Math.random() * 10;
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
		return "NumberPair{" + "number1 = " + number1 + ", number2 = " + number2 + '}';
	}
}
