package com.java.array;

import java.util.Arrays;
import java.util.Scanner;

public class TakingInput {

public static void main(String[] args) {

    Scanner s=new Scanner(System.in);

    System.out.println("enter number of elements");

    int n=s.nextInt();

    int arr[]=new int[n];

    System.out.println("enter elements");

    for(int i=0;i<n;i++){//for reading array
        arr[i]=s.nextInt();

    }

    for(int i: arr){ //for printing array

        System.out.println(i);

    }

    Arrays.sort(arr);
    
    System.out.println(" after sorting ");
    
    for(int i: arr){ //for printing array

        System.out.println(i);

    }
    
    System.out.println("buy :"+ arr[0]);
    
    System.out.println("Sell :"+ arr[n-1]);

}
}
