package com.javapractice.interviewProgram;

public class primeNumber {
	public static void main(String[] args) {
		int n=2;
		boolean value=false;
		 for(int i=2;i<n;i++) {
			 if(n%i==0) {
				 System.out.println("not prime");
				 value=true;
				 break;
			 }
				
		 }if(value==false) {
			 System.out.println("Its Prime ");
		 }
	}

}
