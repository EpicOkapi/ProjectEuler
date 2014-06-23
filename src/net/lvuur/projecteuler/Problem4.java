package net.lvuur.projecteuler;

import java.util.Arrays;

public class Problem4 {
	/*
	 * Problem 4: Largest palindrome product
	 * 
	 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
	 * Find the largest palindrome made from the product of two 3-digit numbers.
	 */
	
	public static void main(String[] args) {
		int highest = 0;
		
		for(int i = 1; i < 1000; i++){
			for(int j = 1; j < 1000; j++){
				int n = i * j;
				
				if(isPalindrome(n)){
					if(n > highest){
						highest = n;
					}
				}
			}
		}
		
		System.out.println(highest); //906609
	}
	
	static boolean isPalindrome(int n){
		String stringN = String.valueOf(n);
		char[] chars = stringN.toCharArray();
		char[] switchedChars = new char[chars.length];
		
		for(int i = 0; i < chars.length; i++){
			switchedChars[i] = chars[chars.length - 1 - i];
		}
		
		if(Arrays.equals(chars, switchedChars)){
			return true;
		}
		
		return false;
	}
}
