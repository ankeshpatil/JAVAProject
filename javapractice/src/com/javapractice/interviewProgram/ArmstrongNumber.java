package com.javapractice.interviewProgram;

public class ArmstrongNumber {
	public static void main(String[] args) {
		 int n=153;
		 int temp=n;
		 int rem, sum=0;
		 while(n>0) {
			 rem=n%10;
			 n=n/10;
			 sum=sum+rem*rem*rem; 
		 }
	
	if(temp==sum) {
		System.out.println("Armstrong");
	}else {
		System.out.println("Not Armstrong");
	}
	}

}
