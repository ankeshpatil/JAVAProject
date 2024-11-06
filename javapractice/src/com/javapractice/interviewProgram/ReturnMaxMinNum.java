package com.javapractice.interviewProgram;

import java.util.Arrays;

public class ReturnMaxMinNum {
	public static void main(String[] args) {
		int a[]= {5,8,4,1,3,2};
		
		//ascending order 
		
//		int temp=0;
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]>a[j]) {
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//			
//		}
//		System.out.println(Arrays.toString(a));
		
		//============================================
		//max number
		
		/*
		 int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];	
			}
		}
		System.out.println(max);
		
		*/
		
		
		
		//============================================================================
		//min number
		
		int min=a[a.length-1];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];	
			}
		}
		System.out.println(min);
		
		
		
	}

}
