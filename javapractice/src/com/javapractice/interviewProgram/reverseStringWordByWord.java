package com.javapractice.interviewProgram;

public class reverseStringWordByWord {
public static void main(String[] args) {
	
	String s= "Java Concept Of The Day";
	 
	String str[]=s.split(" ");
	String rev="";
	for(int i=str.length-1;i>=0;i--) {
		rev=rev+str[i];
	}
	System.out.print(rev+" ");
}
}
