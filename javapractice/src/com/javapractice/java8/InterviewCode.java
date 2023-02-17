package com.javapractice.java8;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewCode {

	public static void main(String[] args) {
		int limit = 1000;
		int rev = 1234;
		int arm = 9474;
		int palin = 2112;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=scanner.nextLine();
		
		//Counting the string characters
		
//		String string="Ankesh";
//	    long a=Arrays.asList(string.split("")).stream().collect(Collectors.counting());
//	    System.out.println("String charactor count "+a);
	    
	    // Unique character from string
		Set set=new HashSet();
	   // Arrays.asList(s.split("")).stream().distinct().forEach(System.out::print);
	   // aabnkghk
	    //Arrays.asList(s.split("")).stream().filter((e)->!set.add(e)).forEach(System.out::print);
//	  Arrays.asList(s.split("")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//	    .entrySet().filter(e->e.getValue()>1).map(Map.Entry::getKey).forEach(System.out::println);
	  
//	  List<Character> list1= new ArrayList<>();l
//	  char[] ch= s.toCharArray();
//	  
//	  for(Character x:ch)
//	  {
//		  list1.add(x);
//	  }
	  
//	  Map<Character, Long> m1=list1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//	  
//	  m1.forEach((k,v)->{if(v==1) {System.out.print(k+" ");};});
	    
//  System.out.println(countString(s));		
//		for (int i = 0; i <= limit; i++) {
//			prime(i);
//			
//		}
		//prime(7);

//		armstrong(arm);
//		palindrome(palin);
//		reverse(rev);
//		fibonacci(limit);
		
	}

	// Fibonacci series

	public static void fibonacci(int num) {
		int first = 0;
		int second = 1;
		System.out.print(first + " " + second);
		for (int i = 2; i < num; i++) {
			int temp = first;
			first = second;
			second = second + temp;
			System.out.print(" " + second);
		}
	}

	// prime function

	public static void prime(int num) {
		int count = 0;
		for (int j = 1; j <= num; j++) {
			if (num % j == 0) {
				count++;
			}

		}
		if (count == 2) {
			System.out.print("prime " + num);
		}
		else
			System.out.println("not prime");

	}

	// armstrong function

	public static void armstrong(int num) {
		int count = 0, rem = 0;
		int sum = 0;
		int temp = num, temp2 = num;

		while (temp != 0) {
			count++;
			temp = temp / 10;
		}

		while (num != 0) {
			rem = num % 10;
			sum = sum + (int) Math.pow(rem, count);
			num = num / 10;
		}

		if (sum == temp2) {
			System.out.println(temp2 + " is a Armstrong Number" + '\n');
		} else
			System.out.println(temp2 + " is Not a armstrong number" + '\n');

	}

	// Reverse Number Function

	public static void reverse(int num) {
		int reverse = 0;
		while (num != 0) {
			reverse = reverse * 10;
			reverse = reverse + num % 10;
			num = num / 10;        
		}
		System.out.println(reverse);

	}

	// palindromin number

	public static void palindrome(int num) {
		int temp = num;
		int reverse = 0;
		while (num != 0) {
			reverse = reverse * 10;
			reverse = reverse + num % 10;
			num = num / 10;
		}
		if (temp == reverse) {
			System.out.println(temp + " Is a palindorme");
		} else
			System.out.println(temp + " IS not a palindrome");

	}
	
	
		
		public static int power(int num,int pow) {
			int pw=1;
			for(int i=1;i<=pow;i++) {
				pw=pw*num;
			}
			return pw;
		}
		
		public static int countString(String input) {
			int count=0;
			for(int i=0;i<input.length();i++) {
				if(input.charAt(i)!=' ') {
					count++;
				}
			}
			
			return count;
		}


}