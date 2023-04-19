package guide09.extras.extra01.entities;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>
*/
public class SecretMonth {
	
	public static final String[] MONTHS = new String[] {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
	
	private final String secretMonth;

	public SecretMonth(String secretMonth) {
		this.secretMonth = secretMonth;
	}

	public String getSecretMonth() {
		return secretMonth;
	}
}
