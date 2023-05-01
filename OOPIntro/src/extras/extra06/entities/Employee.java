package extras.extra06.entities;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
	"salario". Luego, crea un método "calcular_aumento" que calcule el
	aumento salarial de un empleado en función de su edad y salario actual.
	El aumento salarial debe ser del 10% si el empleado tiene más de 30
	años o del 5% si tiene menos de 30 años.
*/
public class Employee {
	
	private static final byte AGE_THRESHOLD = 30;
	
	private String name;
	private byte age;
	private double baseSalary;
	private double percentageIncrease;
	
	public double calculateSalary() {
		return this.baseSalary * this.getPercentageIncrease();
	}
	
	public Employee(String name, byte age, double salary) {
		this.name = name;
		this.age = age;
		this.baseSalary = salary;
		this.percentageIncrease = this.age > AGE_THRESHOLD ? 1.1 : 1.05;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public double getPercentageIncrease() {
		return percentageIncrease;
	}

	public void setPercentageIncrease(double percentageIngrease) {
		this.percentageIncrease = percentageIngrease;
	}
}
