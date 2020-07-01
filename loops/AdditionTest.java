package loops;

import java.util.Scanner;
public class AdditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = ((int) (Math.random() * 10)) + 1;
		int num2 = ((int) (Math.random() * 10)) + 1;
		int correct_sum = num1 + num2;
		int input_sum = 0; 
		boolean correct_answer = false;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is " + num1 + " + " + num2 + "?");
		
	    while (!correct_answer)
	    {
	    	input_sum = scanner.nextInt();
	    
	    	if (input_sum != correct_sum)
	    	{
	    		correct_answer = false;
	    	}
	    	else
	    	{ 
	    		correct_answer = true;
	    	}
	    	
    		System.out.println("Wrong answer. Try again.  " + "What is " + num1 + " + " + num2 + "?");
	    }
		
		System.out.println("You got it!!!");
	}

}
