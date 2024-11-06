package com.javapractice.interviewProgram;

import java.util.Arrays;

public class ReturnFromOneMethodMaxMin_Array {
	public static void main(String[] args) {
		int a1[]= {2,9,0,6,1,8};
		int arrr[]=mixmin(a1);
		System.out.println(arrr[0]+","+arrr[1]);
	}

	public static int[] mixmin(int arr[]) {
		Arrays.sort(arr);
		int a[] = new int [2];
		a[0]=arr[0];
		a[1]=arr[arr.length-1];
		 return a;
		
	}
}
