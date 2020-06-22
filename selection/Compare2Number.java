package selection;

import java.util.Scanner;

public class Compare2Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Give me first number: ");
		num1 = scanner.nextInt();
		
		System.out.println("Give me 2nd number: ");
		num2 = scanner.nextInt();
		
		if (num2 > num1)
		{
			System.out.println(num2 + " is greater than " + num1);
		}
		else if ( num1 > num2)
		{
			System.out.println(num1 + " is greater than " + num2);
		}
		else
		{
			System.out.println(num1 + " is the same as " + num2);
		}
		
		
        
	}

}
