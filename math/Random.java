package math;

/* 
 * random number return 1 to 100
 */
public class Random {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++)
		{
			System.out.println((int) (Math.random() * 100) + 1);
		}
	}

}
