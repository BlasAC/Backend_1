package extras_extras;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	The prime factors of 13195 are 5, 7, 13 and 29.

	What is the largest prime factor of the number 600851475143?
*/
public class Euler003 {
	
	private static final long NUMBER = 600851475143l;
	
	public static void main(String[] args) {
		
		final long START = System.nanoTime();
		long largestPrime = 0;
		
		for (long i = 2; i < Math.sqrt(NUMBER); i++) {
			if (isPrime(i) && NUMBER % i == 0 && i > largestPrime) {
				largestPrime = i;
			}
		}
		final long END = System.nanoTime();
		
		System.out.println(largestPrime);
		System.out.println(END - START);
	}
	
	public static boolean isPrime(long n) {
		boolean isPrime = !(n < 2 | n % 2 == 0) | n == 2;
		//Es más rápido con boolean o con break?
		for (long i = 3; isPrime & i <= Math.sqrt(n); i += 2) {
			isPrime = !(n % i == 0);
		}
		return isPrime;
	}
	
//	Much faster implementation than mine. It doesn't test if a number is prime, it simply generates it with primeSeed + 1 and primeSeed - 1
//	Does it work in every case? No clue. But it rocks! \m/
//	public static void main(String[] args) {
//		
//		final long START = System.nanoTime();
//		
//		long largestFactor = 0;
//		long number = NUMBER;
//		
//		if (number % 2 == 0) {
//			largestFactor = 2;
//			
//			while (number % 2 == 0) {
//				number /= 2;
//			}
//		}
//		
//		if (number % 3 == 0) {
//			largestFactor = 3;
//			
//			while (number % 3 == 0) {
//				number /= 3;
//			}
//		}
//		
//		long primeSeed = 6;
//		while (primeSeed - 1 <= number) {
//			if (number % (primeSeed - 1) == 0) {
//				largestFactor = primeSeed - 1;
//				while (number % largestFactor == 0) {
//					number /= largestFactor;
//				}
//			}
//			if (number % (primeSeed + 1) == 0) {
//				largestFactor = primeSeed + 1;
//				while (number % largestFactor == 0) {
//					number /= largestFactor;
//				}
//			}
//			primeSeed += 6;
//		}
//		final long END = System.nanoTime();
//		
//		System.out.println(largestFactor);
//		System.out.println(END - START);	
//	}
}