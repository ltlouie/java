package selection;

import java.util.Random;

public class RandonNumberIsEven4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Math.random () return between 0 to 1
		int num;
		//num = (int) (Math.random() * 1000);
		num = ((int) (Math.random() * 1000)) % 11; // return 0 to 10
		
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
