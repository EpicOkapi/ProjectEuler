package net.lvuur.projecteuler;

public class Problem7 {
	/*
	 * Problem 7: 1001st prime
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
	 * What is the 10 001st prime number?
	 */
	
	public static void main(String[] args) {
		int currentPrime = 0;
		
		for(int i = 0; i < 10002; i++){
			currentPrime = nextPrime(currentPrime);
		}
		
		System.out.println(currentPrime); //104743
	}

	static int nextPrime(int prime){
		prime++;
		
		while(!isPrime(prime)){
			prime++;
		}
		
		return prime;
	}
	
	static boolean isPrime(int n){
		for(int i = 0; i < n; i++){
			if(i == 0 || i == 1 || i == n){
				continue;
			}
			
			if(n % i == 0){
				return false;
			}
		}
		
		return true;
	}
}
