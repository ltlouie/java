package selection;

import java.util.Scanner;

public class CheckIfEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Give me a number to check if it is even: ");
		int num = scanner.nextInt();
		
		if (num % 2 == 0) 
		{
			System.out.println(num + " is even number");
		}
		else
		{
			System.out.println(num + " is not even number");
		}
		
	}

}
