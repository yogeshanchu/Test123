package com.java.array;

import java.util.Arrays;
import java.util.Scanner;


public class TestScanner {
	

    public static int [] readNumsFromCommandLine() {
    	
    	System.out.println("enter number of elements");
        
    	Scanner s = new Scanner(System.in);

        int count = s.nextInt();
        s.nextLine(); // throw away the newline.
        
        System.out.println("enter elements");

        int [] numbers = new int[count];
        Scanner numScanner = new Scanner(s.nextLine());
        for (int i = 0; i < count; i++) {
            if (numScanner.hasNextInt()) {
                numbers[i] = numScanner.nextInt();
            } else {
                System.out.println("You didn't provide enough numbers");
                break;
            }
        }

        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = readNumsFromCommandLine();
              
        Arrays.sort(numbers);
         
        System.out.println("buy :"+ numbers[0]);
        
        System.out.println("Sell :"+ numbers[numbers.length-1]);
        
        
    }
}