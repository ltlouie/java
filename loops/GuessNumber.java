package loops;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random_number = (int) (Math.random() * 100) + 1;
		System.out.println(random_number);
		boolean correct_answer = false; 
		int input_answer = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Guess a number between 1 to 100: ");
		while (!correct_answer)
		{
			input_answer = scanner.nextInt();
		
			if (input_answer == random_number)
			{
				System.out.println("You guess is correct: " + input_answer);
				correct_answer = true; 
			}
			else if (input_answer > random_number)
			{
				System.out.println("Your number " + input_answer + " is too high.  Please try again: ");
				correct_answer = false;
			}
			else
			{
				System.out.println("Your number " + input_answer + "  is too low.  Please try again: ");
				correct_answer = false; 
			}
			
		}
		
	}

}
