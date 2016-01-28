package com.java.array;

import java.util.ArrayList;
import java.util.Collections;

public class TestArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Testing Array's");
		
		ArrayList<Integer> stocks = new ArrayList<Integer>();
		stocks.add(-12345);
		stocks.add(3456);
		stocks.add(5678);
		
		Collections.sort(stocks);
		
		 System.out.println("After Sorting:");
		   for(Integer counter: stocks){
				System.out.println(counter);
			}
	}

}
