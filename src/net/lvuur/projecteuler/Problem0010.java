package net.lvuur.projecteuler;

import net.lvuur.util.PrimeUtil;

public class Problem0010 {
	/*
	 * Problem 10: Summation of primes
	 * 
	 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
	 * Find the sum of all the primes below two million.
	 */
	
	public static void main(String[] args) {
		int currentPrime = 2;
		long total = 0;
		
		while(currentPrime < 2000000){
			total += currentPrime;
			
			currentPrime = PrimeUtil.nextPrime(currentPrime);
		}
		
		System.out.println(total); //142913828922
	}
}
