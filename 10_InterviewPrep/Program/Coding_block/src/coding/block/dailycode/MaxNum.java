package coding.block.dailycode;

import java.util.Scanner;

public class MaxNum {

	public static void main(String[] args) {

		
		//Scanner sc=new Scanner()
		
		int a=10,b=20,c=30;
		
	int result=(a>b && a>c ?a:(b>a && b>c ? b:c));
	
	
	System.out.println(result);

//		if(a>b&&a>c) {
//			System.out.println("a is big");
//		}
//			
//		else if(b>a && b>c) {
//			System.out.println("b is big");
//
//		}
//		else {
//			System.out.println("c is big");
//
//		}
	}

}
