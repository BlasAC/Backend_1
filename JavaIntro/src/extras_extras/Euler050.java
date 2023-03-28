package extras_extras;

// The prime 41, can be written as the sum of six consecutive primes:
// 41 = 2 + 3 + 5 + 7 + 11 + 13
// This is the longest sum of consecutive primes that adds to a prime below one-hundred.
// The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms, and is equal to 953.
// Which prime, below one-million, can be written as the sum of the most consecutive primes?

import java.util.Vector;

public class Euler050 {
	
	static final int LIMIT = 1000000;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		int sum,
			cont,
			contMax = 0,
			sumMax = 0;
		Vector<Integer> primeNumbers = new Vector<Integer>();
		
		fillVector(primeNumbers);
		
		final int primeCount = primeNumbers.size();
		
		for (int i = 0; i < primeCount; i++) {
			sum = 0;
			cont = 0;
			for (int j = i; j < primeCount; j++) {
				sum += primeNumbers.get(j);
				cont++;
				if (isPrime(sum) & cont > contMax & sum > sumMax & sum <= LIMIT) {
					sumMax = sum;
					contMax = cont;
				}
				if (sum > LIMIT) {
					j = primeCount;
				}
			}
		}
		
		System.out.printf("\n\ncontMax: %d\tsumMax: %d", contMax, sumMax);

		long end = System.currentTimeMillis();
		System.out.printf("\n\nExecution time: %d ms.", end - start);
	}
	
	static void fillVector(Vector<Integer> a) {
		for (int i = 2; i < LIMIT; i++) {
			if (isPrime(i)) {
				a.add(i);
			}
		}
	}

	public static boolean isPrime(int n) {
		boolean isPrime = !(n < 2 | n % 2 == 0) | n == 2;
		//Es más rápido con boolean o con break?
		for (int i = 3; isPrime & i <= Math.sqrt(n); i += 2) {
			isPrime = !(n % i == 0);
		}
		return isPrime;
	}
}