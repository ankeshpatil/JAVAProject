package com.javapractice.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class JavaEight {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(6);
		list.add(5);
		list.add(8);
		list.add(2);
		list.add(4);

		// there are 4 functional interface given in java 8

		// Predicate: test() :take argument return boolean result
		// Function: apply() :take argument return any type result
		// Consumer: accept() :takes argument but doesn't return anything
		// Supplier: get() :takes nothing but return some functionality

		// Implementation of test() method of predicate Functional Interface
		Predicate<Integer> p = e -> e % 2 == 0;
		for (int i : list) {
			if (p.test(i))
				System.out.println(i);
		}
		System.out.println("---------------------------------------------------------------------");

		// Implementation of apply() method of function Functional Interface
		Function<Integer, String> f = e -> e+"";
		for (int i : list) {
			System.out.println(f.apply(i));
		}
		System.out.println("---------------------------------------------------------------------");

		// Implementation of accept() method of Consumer Functional Interface
		Consumer<Integer> c = e -> System.out.println(e + 1);
		for (int i : list) {
			c.accept(i);
		}
		System.out.println("---------------------------------------------------------------------");

		// Implementation of get() method of Supplier Functional Interface
		Supplier<Integer> s = () -> 10-7;
		System.out.println(s.get());

		System.out.println("---------------------------------------------------------------------");

		List l = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		l.forEach(e -> System.out.println("elements are : " + e));

		System.out.println("---------------------------------------------------------------------");

		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("---------------------------------------------------------------------");

		list.stream().sorted().forEach(System.out::println);
		System.out.println("---------------------------------------------------------------------");

		int a[] = { 4, 6, 7, 3, 1 };
		
		Arrays.stream(a).sorted().forEach(System.out::println);
		System.out.println("---------------------------------------------------------------------");

		String changeString = "Hi Ankesh, How are you, all well";
		String[] z = changeString.replaceAll(",", "").split(" ");
//		StringJoiner sj = new StringJoiner("");
//		for (String s4 : z) {
//			sj.add(s4);
//		}
//		System.out.println(sj);
      
		Arrays.asList(z).stream().forEach(System.out::print);
		Arrays.stream(z).forEach(System.out::print);
	}

}
