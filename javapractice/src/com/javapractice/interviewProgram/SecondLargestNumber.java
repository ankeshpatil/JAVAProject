package com.javapractice.interviewProgram;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int arr[]= {1,9,8,4,5};
		int n=5;
		int num= second(arr,n);
		System.out.println(num);

	}
	
	public static int second(int arr[], int n) {
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;	
				}
			}
		}
		return arr[n-2];
	}

}