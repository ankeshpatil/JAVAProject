package com.javapractice.interviewProgram;

public class FactorialNumber {
	public static void main(String[] args) {
//		int a[]= {1,2,3,4,5,6,7,8,9};
//		alternateNum(a);
		//5*4*3*2*1=120
		
		int num=5;
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		
		
	}
	
//	public static void alternateNum(int arr[]) {
//		for(int i=0;i<arr.length;i++) {
//			if(i%2==0) {
//				System.out.println(arr[i]);
//			}
//		}
//		
//	}

}
