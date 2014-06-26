package net.lvuur.projecteuler;

public class Problem0014 {
	/*
	 * Problem 14: Highly divisible triangular number
	 * The following iterative sequence is defined for the set of positive integers:
	 * 		n → n/2 (n is even)
	 * 		n → 3n + 1 (n is odd)
	 * Using the rule above and starting with 13, we generate the following sequence:
	 * 		13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
	 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
	 * Which starting number, under one million, produces the longest chain?
	 * NOTE: Once the chain starts the terms are allowed to go above one million.
	 */
	
	public static void main(String[] args) {
		int highestCount = 0;
		int highestN = 0;
		
		for(int i = 1; i < 1000001; i++){
			int count = chainCount(i);
			
			if(count > highestCount){
				highestCount = count;
				highestN = i;
			}
		}
		
		System.out.println(highestN); //837799
	}
	
	static int chainCount(long n){
		int count = 0;
		
		while(n > 1){
			if(n % 2 == 0){
				n = n / 2;
			} else {
				n = (n * 3) + 1;
			}
			
			count++;
		}
		
		return count + 1;
	}

}
