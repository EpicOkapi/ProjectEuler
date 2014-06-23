package net.lvuur.projecteuler;

import java.util.ArrayList;

import net.lvuur.util.PrimeUtil;

public class Problem3 {
	/*
	 * Problem 3: Largest prime factor
	 * 
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 * What is the largest prime factor of the number 600851475143 ?
	 */
	
	public static void main(String[] args) {
		long n = 600851475143L;
		long currentN = n;
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		while(currentN != 1){
			int currentPrime = 2;
			
			while(currentN % currentPrime != 0){
				currentPrime = PrimeUtil.nextPrime(currentPrime);
			}
			
			currentN = currentN / currentPrime;
			primes.add(currentPrime);
		}
		
		System.out.println(primes.get(primes.size() - 1)); //6857
	}
}
