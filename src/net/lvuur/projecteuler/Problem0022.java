package net.lvuur.projecteuler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem0022 {
	/*
	 * Problem 22: Names scores
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("res/names.txt"));
		String line = null;
		List<String> names = new ArrayList<String>();
		
		while((line = reader.readLine()) != null){
			for(String str : line.split(",")){
				names.add(str.replaceAll("\"", ""));
			}
		}
		
		reader.close();
		
		Collections.sort(names);
		
		int total = 0;
		
		for(int i = 0; i < names.size(); i++){
			int nameTotal = 0;
			
			for(char c : names.get(i).toCharArray()){
				int val = Character.getNumericValue(c) - 9;
				
				nameTotal += val;
			}
			
			nameTotal *= (i + 1);
			total += nameTotal;
		}
		
		System.out.println(total); //871198282
	}
}
