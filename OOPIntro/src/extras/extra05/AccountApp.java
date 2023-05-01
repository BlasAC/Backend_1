package extras.extra05;

import extras.extra05.entities.Account;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>
*/
public class AccountApp {
	
	public static void main(String[] args) {
		
		Account acc1 = Account.createAccount();
		System.out.printf("Dinero retirado: %.4f\n", acc1.withdrawMoney().doubleValue());
		System.out.printf("Saldo restante: %.4f", acc1.getAccountBalance().doubleValue());
	}
}
