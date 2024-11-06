package com.javapractice.interviewProgram;

public class ReverseChar_StringConstant {
	public static void main(String[] args) {
		String s= "Java language";
		String str[]=s.split(" ");
		for(String s1:str) {
			String rev="";
			for(int i=0;i<s1.length();i++) {
				rev=s1.charAt(i)+rev;
			}
			System.out.print(rev+" ");
		}
	}
	
	

}
