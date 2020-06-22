package selection;

public class ThreeDigitPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int num = 121;
		
		int num = (int) (Math.random() * 99999) % 1000; 
		
		int first_digit = num / 100;
		int last_digit = num % 10;
		
		System.out.println(first_digit);
		System.out.println(last_digit);
		
		if (first_digit == last_digit)
		{
			System.out.println(num + " is palindrome");
		}
		else 
		{
			System.out.println(num + " is not palindrome");
		}
	}

}
