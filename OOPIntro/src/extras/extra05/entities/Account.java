package extras.extra05.entities;

import java.math.BigDecimal;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
	Luego, crea un método "retirar_dinero" que permita retirar una cantidad
	de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
	negativo después de realizar una transacción de retiro.
*/
public class Account {
	
	private BigDecimal accountBalance;
	private String accountOwner;
	
	public BigDecimal withdrawMoney() {
		Scanner scan = new Scanner(System.in);
		
		BigDecimal withdraw;
		
		System.out.print("Indique el monto a retirar: ");
		withdraw = new BigDecimal(scan.nextLine());
		
		if (this.accountBalance.compareTo(withdraw) >= 0) {
			this.accountBalance = this.accountBalance.subtract(withdraw);
		} else {
			withdraw = this.accountBalance;
			this.accountBalance = new BigDecimal(0);
		}
		
		return withdraw;
	}
	
	public static Account createAccount() {
		
		Scanner scan = new Scanner(System.in);
		
		BigDecimal balance;
		String owner;
		
		System.out.println("Ingrese los datos de la cuenta:");
		System.out.print("Titular: ");
		owner = scan.nextLine();
		System.out.print("Saldo: ");
		balance = new BigDecimal(scan.nextLine());
		
		return new Account(balance, owner);
	}
	
	private Account(BigDecimal accountBalance, String accountOwner) {
		this.accountBalance = accountBalance;
		this.accountOwner = accountOwner;
		System.out.println("Cuenta creada.");
	}

	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}
}
