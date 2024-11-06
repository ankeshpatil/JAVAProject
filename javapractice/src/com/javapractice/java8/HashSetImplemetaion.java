package com.javapractice.java8;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetImplemetaion {
	public static void main(String[] args) {
//		int arr[] = { 4, 5, 2, 7, 2, 5, 1, 3, 7 };
//	// Retrive duplicate from this array using Hashset
//		HashSet<Integer> hs = new HashSet<Integer>();
//
//		for (int x : arr) {
//			if (hs.contains(x)) {
//				System.out.println("Duplicates : " + x);
//			} else {
//				hs.add(x);
//			}
//
//		}
//		System.out.println("Array " + Arrays.toString(arr));
//		System.out.println("HashSet " + hs.toString());
		
		//---------------------------------------------------------------------
		
//		String s="madam";
//		String rev="";
//		for(int i=s.length()-1;i>=0;i--) {
//			rev=rev+ s.charAt(i);
//		}
//		System.out.println(rev);
//		if(rev.equals(s)){
//			System.out.println("palindrome");
//			
//		}else {
//			System.out.println("not palindrome");
//		}
		//---------------------------------------------------------------------
		
//		int a[]= {5,8,4,1,3,2};
//		int temp;
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
//		System.out.print(Arrays.toString(a));
		
		//--------------------------------------------------------------------------
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a="+a+", b="+b);
		
	}
}
