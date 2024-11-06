package com.javapractice.interviewProgram;

public class RemoveDuplicateChar {
	public static void main(String[] args) {
		String s= "aishwarya";
		boolean value=false;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					value=true;
					break;
				}
			}
			if(value==false){
				System.out.print(s.charAt(i));
			}else {
				value=false;
			}
		}
	}

}
