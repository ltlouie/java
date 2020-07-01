package selection;
/* 
 * Zeller's congruence:
 * 	h = ( q + (26(m+1) / 10) + k + k/4 + j/4 + 5J) % 7;   
 *  h is day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, 6: Friday)
 *  q is the day of the month
 *  m is the month (3: March, 4: April, ..., 12: December) January and February as months 13, and 14 of previous year
 *  j is century (ie., year / 100)
 *  k is year of the century (year % 100)
 */
public class DayOfTheWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if 2025 is year, 1 is month, and dayof the month is 25, then day of week is Sunday
		// if 2012 is year, 5 is month, and dayof the month is 12, then day of week is Saturday
		int year = 2020;
		int m = 6;  //m is month 
		int q = 20; //q is day of the month
	
		if (m == 1)
		{
			m = 13;
			--year; 
		}
		else if (m == 2)
		{
			m = 24;
			--year;
		}
		
		int k = year % 100;   // k is year of the century
		int j = year / 100;   // j is century
		
		
		int dayofweek = ( q + (26 * (m + 1) / 10) + k + k/4 + j/4 + 5 * j) % 7; 
		
		//System.out.println(dayofweek);
		
		System.out.print("Year " + year + " " + " month " + m + " day of the month " + q + " is ");
		switch (dayofweek) {
			case 0: 
				System.out.println("Saturday");
				break;
			case 1: 
				System.out.println("Sunday");
				break;
			case 2: 
				System.out.println("Monday");
				break;
			case 3: 
				System.out.println("Tuesday");
				break;
			case 4: 
				System.out.println("Wedneday");
				break;
			case 5: 
				System.out.println("Thursday");
				break;
			case 6: 
				System.out.println("Friday");
				break;
			default:
				System.out.println("Problem.....");
				break;
				
		}
		
	}

}
