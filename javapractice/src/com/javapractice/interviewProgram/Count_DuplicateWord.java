package com.javapractice.interviewProgram;

public class Count_DuplicateWord {
	public static void main(String[] args) {
		String s= "rain water blue blue rain water";
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++) {
			int count=1;
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					count++;
					str[j]="0";
				}
			}
			if(count>1 && str[i]!="0") {
				System.out.println(str[i]+",count="+count);
			}
		}
	}

}
