package com.javapractice.interviewProgram;

public class Count_Vowels_Consonent {
	public static void main(String[] args) {
		String s= "i love my country";
		int vowels=0; 
		int consonent=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				vowels++;
			}else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				consonent++;
			}
		}
		System.out.println("vowels=="+vowels);
		System.out.println("consonent=="+consonent);
		
	}

}
