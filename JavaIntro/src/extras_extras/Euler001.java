package extras_extras;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
	Find the sum of all the multiples of 3 or 5 below 1000.
*/
public class Euler001 {
	
	static final int
			LIMIT = 1000,
			FACTOR_1 = 3,
			FACTOR_2 = 5;
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = FACTOR_1; i < LIMIT; i++) {
			sum += (i % FACTOR_1 == 0 || i % FACTOR_2 == 0) ? i : 0;
		}
		
		System.out.println(sum);
	}
}
