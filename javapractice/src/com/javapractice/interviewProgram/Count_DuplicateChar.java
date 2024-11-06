package com.javapractice.interviewProgram;

public class Count_DuplicateChar {
	public static void main(String[] args) {
		String s= "aishwaryapatil";
	
		char Str[]=s.toCharArray();
		for(int i=0;i<Str.length;i++) {
			int count=1;
			for(int j=i+1;j<Str.length;j++) {
				if(Str[i]==Str[j]) {
					count++;
					Str[j]=0;
				}
			}
			if(count>1 && Str[i]!=0) { 
				//count>1 used to get duplicate char only
				
				System.out.println(Str[i]+"== Count:"+count);
			}
		}
		
		
	}
	

}
