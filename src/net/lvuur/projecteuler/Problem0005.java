package net.lvuur.projecteuler;

public class Problem0005 {
	/*
	 * Problem 5: Smallest multiple
	 * 
	 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
	 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	 */
	
	public static void main(String[] args) {
		int n = 1;
		
		while(!isDivisibleTo(n, 20)){
			n++;
		}
		
		System.out.println(n); //232792560
	}
	
	static boolean isDivisibleTo(int n, int to){
		for(int i = 1; i < to + 1; i++){
			if(n % i != 0){
				return false;
			}
		}
		
		return true;
	}
}
