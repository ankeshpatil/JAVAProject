package com.javapractice.interviewProgram;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String s= "I like java program java like";
		boolean value=false;
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					value=true;
					break;
				}
			}
			if(value==false) {
				System.out.print(str[i]+" ");
			}else {
				value=false;
			}
		}
	}

}
