package net.lvuur.projecteuler;

public class Problem6 {
	/*
	 * Problem 6: Sum square difference
	 * 
	 * The sum of the squares of the first ten natural numbers is,
	 * 		12 + 22 + ... + 102 = 385
	 * The square of the sum of the first ten natural numbers is,
	 * 		(1 + 2 + ... + 10)2 = 552 = 3025
	 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
	 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
	 */
	
	public static void main(String[] args) {
		//Calculate the sum of the squares
		int sumSquares = 0;
		
		for(int i = 1; i < 101; i++){
			sumSquares += (i * i);
		}
		
		//Calculate the square of the sum
		int squaresSum = 0;
		int squaresTotal = 0;
		
		for(int i = 1; i < 101; i++){
			squaresTotal += i;
		}
		
		squaresSum = squaresTotal * squaresTotal;
		
		//Calculate the difference
		int difference = squaresSum - sumSquares;
		
		System.out.println(difference); //25164150
	}
}
