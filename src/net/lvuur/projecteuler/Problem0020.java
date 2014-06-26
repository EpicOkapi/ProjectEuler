package net.lvuur.projecteuler;

import java.math.BigInteger;

public class Problem0020 {
	/*
	 * Problem 20: Factorial digit sum
	 */
	
	public static void main(String[] args) {
		int n = 100;
		BigInteger total = BigInteger.valueOf(n);
		
		for(int i = (n - 1); i > 0; i--){
			total = total.multiply(BigInteger.valueOf(i));
		}
		
		String totalStr = String.valueOf(total);
		int totalSum = 0;
		
		for(char c : totalStr.toCharArray()){
			int i = Character.getNumericValue(c);
			totalSum += i;
		}
		
		System.out.println(totalSum); //648
	}
}
