package net.lvuur.projecteuler;

import java.math.BigInteger;

public class Problem0025 {
	/*
	 * Problem 25: 1000-digit Fibonacci number
	 */
	
	/*
	 * Note: I'm an asshole for using BigInteger. Very cheap.
	 */
	
	public static void main(String[] args) {
		BigInteger current = BigInteger.valueOf(1L);
		BigInteger last = BigInteger.valueOf(1L);
		int count = 2; //Starts add 2 because of the first 2 Fibonacci numbers
		
		while(current.toString().length() < 1000){
			BigInteger newN = last.add(current);
			last = current;
			current = newN;
			
			count++;
			System.out.println(current);
		}
		
		System.out.println(count); //4780
	}
}
