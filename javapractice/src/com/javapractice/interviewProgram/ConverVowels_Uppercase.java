package com.javapractice.interviewProgram;

public class ConverVowels_Uppercase {
	public static void main(String[] args) {
		String s= "aishwarya patil";
		/* ----------	Using replace all			  

		String s1= s.replaceAll("a", "A").replaceAll("e", "E").replaceAll("i", "I").replaceAll("o", "O")
		.replaceAll("u", "U");
		
		System.out.println(s1);
*/		
		
		// using toUpperCase 
		
		char[] ch =s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
				char c=Character.toUpperCase(ch[i]);
				ch[i]=c;
				
			}
			
		}
		System.out.print(ch);
		
		
		
	}

}
