package net.lvuur.util;

public class PrimeUtil {

	public static int nextPrime(int prime){
		prime++;
		
		while(!isPrime(prime)){
			prime++;
		}
		
		return prime;
	}
	
	public static boolean isPrime(int n){
		if(n == 2) return true;
		if(n % 2 == 0) return false;
		
		for(int i = 3; i*i <= n; i += 2){
			if(n % i == 0){
				return false;
			}
		}
		
		return true;
	}
}
