package extras.extra06;

import extras.extra06.entities.Employee;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
	"salario". Luego, crea un método "calcular_aumento" que calcule el
	aumento salarial de un empleado en función de su edad y salario actual.
	El aumento salarial debe ser del 10% si el empleado tiene más de 30
	años o del 5% si tiene menos de 30 años.
*/
public class EmployeeApp {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("MaLeVo", (byte) 18, 1000);
		Employee employee2 = new Employee("Blas", (byte) 36, 1000);
		System.out.println(employee1.calculateSalary());
		System.out.println(employee2.calculateSalary());
	}
}
