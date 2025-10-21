package com.string.demo;

public class RevereseString {

	public static void main(String[] args) {
String s="Ratnmala";
String rev="";

for(int i=s.length()-1;i>=0;i--) {
	rev=rev+s.charAt(i);
}
System.out.println("original string:"+s);
System.out.println("Reverse string:"+rev);
	}

}
