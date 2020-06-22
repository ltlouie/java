package selection;


/* 
 * Leap year if it is divisible by 4 but not by 100, or if it is divisible by 400
 */
public class CheckLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = (int) (Math.random() * 1000);
		// int year = 2000, 2012 are leap year
		boolean isLeapYear = false;
		
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
		{
			isLeapYear = true;
		}
		
		if (isLeapYear)
		{
			System.out.println(year + " is a leap year");
		}
		else 
		{
			System.out.println(year + " is not a leap year");
		}
	}

}
