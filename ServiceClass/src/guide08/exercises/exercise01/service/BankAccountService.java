package guide08.exercises.exercise01.service;

import guide08.exercises.exercise01.entities.BankAccount;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
*/
public class BankAccountService {
	
	//a) Método para crear cuenta pidiéndole los datos al usuario.
	public BankAccount createAccount() {
		
		Scanner scan = new Scanner(System.in);
		
		int accNumber;
		long clientDni;
		double accBalance;
		
		System.out.print("Ingrese el número de cuenta: ");
		accNumber = scan.nextInt();
		System.out.print("Ingrese el DNI del cliente: ");
		clientDni = scan.nextLong();
		System.out.print("Ingrese el saldo de la cuenta: ");
		accBalance = scan.nextDouble();
		
		return new BankAccount(accNumber, clientDni, accBalance);
	}
	
	//b) Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
	public void deposit(BankAccount acc, double amount) {
		acc.setAccBalance(acc.getAccBalance() + amount);
	}
	
	//c) Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
	//retirar se retirará el máximo posible hasta dejar la cuenta en 0.
	public double withdraw(BankAccount acc, double amount) {
		
		double balance = acc.getAccBalance();
		
		if (amount <= balance) {
			acc.setAccBalance(balance - amount);
		} else {
			amount = balance;
			acc.setAccBalance(0);
		}
		
		return amount;
	}
	
	//d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
	public double withDraw(BankAccount acc, double amount) {
		
		double balance = acc.getAccBalance();
		
		if (amount >= balance * .2) {
			amount = balance * .2;
			acc.setAccBalance(balance * .8);
		} else {
			acc.setAccBalance(balance - amount);
		}
		
		return amount;
	}
	
	//e) Método consultarSaldo: permitirá consultar el saldo disponible en la	cuenta.
	public void showBalance(BankAccount acc) {
		System.out.printf("Balance de la cuenta %d: %.4f", acc.getAccNumber(), acc.getAccBalance());
	}
	
	//f) Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
	public void showAccountData(BankAccount acc) {
		System.out.printf("Datos de la cuenta %d:\n"
				+ "DNI del cliente: %d\n"
				+ "Saldo de la cuenta: %.4f\n\n",
				acc.getAccNumber(), acc.getClientDni(), acc.getAccBalance());
	}
}
