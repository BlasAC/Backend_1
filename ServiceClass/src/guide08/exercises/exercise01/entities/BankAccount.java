package guide08.exercises.exercise01.entities;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos:
	numeroCuenta(entero), dniCliente(entero largo),	saldoActual.
	Agregar constructor vacío, con parámetros, getters y setters.
*/
public class BankAccount {
	
	private int accNumber;
	private long clientDni;
	private double accBalance;

	public BankAccount() {
	}

	public BankAccount(int accNumber, long clientDni, double accBalance) {
		this.accNumber = accNumber;
		this.clientDni = clientDni;
		this.accBalance = accBalance;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public long getClientDni() {
		return clientDni;
	}

	public void setClientDni(long clientDni) {
		this.clientDni = clientDni;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
}
