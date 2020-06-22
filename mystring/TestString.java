package mystring;

import java.util.Scanner;

public class TestString {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		/* 
		 Scanner scanner = new Scanner(System.in);
		 
		
		System.out.println("Please give me a string: ");
		String input_string = scanner.nextLine();  */
		
		String input_string = "Hello";
		String name = " Lawrence";
		
		System.out.println("Your input string is " + input_string);
		
		System.out.println("First character of your input string is: " + input_string.charAt(0));
		
		// check if the string are the same while ignoring the case
		System.out.println("compare string Hello to hello" + input_string.compareToIgnoreCase("hello"));
		System.out.println("contact string with Hello and Lawrene is " + input_string.concat(name));
		System.out.println("contains string Hello with He -->" + input_string.contains("He"));
		System.out.println("endstring with Hello with lo -->" + input_string.endsWith("o"));
		System.out.println("substring (1,3) with Hello is  -->" + input_string.substring(1, 3));
		System.out.println("index of Hello of l is --> " + input_string.indexOf('l')); 
		System.out.println("lastindex of Hello of l is --> " + input_string.lastIndexOf('l'));
		
		
	}

}
