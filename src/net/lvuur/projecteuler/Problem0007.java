package net.lvuur.projecteuler;

import net.lvuur.util.PrimeUtil;

public class Problem0007 {
	/*
	 * Problem 7: 1001st prime
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
	 * What is the 10 001st prime number?
	 */
	
	public static void main(String[] args) {
		int currentPrime = 0;
		
		for(int i = 0; i < 10002; i++){
			currentPrime = PrimeUtil.nextPrime(currentPrime);
		}
		
		System.out.println(currentPrime); //104743
	}
}
