package exercises.exercise01;

import exercises.exercise01.entities.BankAccount;
import exercises.exercise01.service.BankAccountService;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
	saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
	
	Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
		
		a) Método para crear cuenta pidiéndole los datos al usuario.
		b) Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
		c) Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
		retirar se retirará el máximo posible hasta dejar la cuenta en 0.
		d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
		e) Método consultarSaldo: permitirá consultar el saldo disponible en la	cuenta.
		f) Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
*/
public class BankAccountApp {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		BankAccountService bank = new BankAccountService();
		
		BankAccount acc1 = bank.createAccount();
		
		bank.showAccountData(acc1);
	}
}
