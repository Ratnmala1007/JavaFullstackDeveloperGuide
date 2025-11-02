package com.recursion.demo;

public class FactorialNum {

	    static int factorial(int n) {
	        if (n == 0 && n == 1)   // Base condition
	            return 1;
	        else
	            return n * factorial(n - 1);  // Recursive call
	    }

	    public static void main(String[] args) {
	        System.out.println("Factorial of 3 is: " + factorial(0));
	    }
	}

	


