package com.javapractice.interviewProgram;

public class Anagram {
public static void main(String[] args) {
	String s= "actg";
	String s1= "catg";
	boolean value=false;
	if(s.length()!=(s1.length())) {
		System.out.println("Not anagram");
	}else {

		for(int i=0;i<s.length();i++) {
			String ch = Character.toString(s.charAt(i)) ;
			if(s1.contains(ch)) {
				value=true;	
			}else {
				value=false;
				System.out.println("Not anagram");
				break;
			}
		}
		if(value==true) {
			System.out.println("anagram");
		}
				
	}
	
}
}
