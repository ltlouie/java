package mystring;

import java.util.Scanner;

public class GuessBirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String set1 = 
    	 " 1 3 5 7 \n" + 
         " 9 11 13 15 \n" + 
    	 " 17 19 21 23 \n" + 
         " 25 27 29 31";     		
       
       String set2 = 
    	 " 2 3 6 7 \n" + 
         " 10 11 14 15 \n" + 
    	 " 18 19 22 23 \n" + 
         " 26 27 30 31";     
       
       String set3 = 
    	 " 4 5 6 7 \n" + 
         " 12 13 14 15 \n" + 
    	 " 20 21 22 23 \n" + 
         " 28 29 20 31";     		
       
       String set4 = 
    	 " 8 9 10 11 \n" + 
         " 12 13 14 15 \n" + 
    	 " 24 19 22 23 \n" + 
         " 26 27 30 31";     
       
       String set5 = 
    	 " 16 17 18 19 \n" + 
         " 20 21 22 23 \n" + 
    	 " 24 25 26 27 \n" + 
         " 28 29 30 31";   
       
       int day = 0; 
       
       Scanner input = new Scanner(System.in);
       
       System.out.println("Is your birthday in set 1?");
       System.out.println("Enter 0 for NO and 1 for YES");
       System.out.println(set1);
       int answer = input.nextInt();
       
       if (answer == 1)
       {
    	   day += 1;
       }
       
       System.out.println("Is your birthday in set 2?");
       System.out.println("Enter 0 for NO and 1 for YES");
       System.out.println(set2);
       answer = input.nextInt();
       
       if (answer == 1)
       {
    	   day += 2;
       }
       
       System.out.println("Is your birthday in set 3?");
       System.out.println("Enter 0 for NO and 1 for YES");
       System.out.println(set3);
       answer = input.nextInt();
       
       if (answer == 1)
       {
    	   day += 4;
       }
       
       System.out.println("Is your birthday in set 4?");
       System.out.println("Enter 0 for NO and 1 for YES");
       System.out.println(set4);
       answer = input.nextInt();
       
       if (answer == 1)
       {
    	   day += 8;
       }
       
       System.out.println("Is your birthday in set 5?");
       System.out.println("Enter 0 for NO and 1 for YES");
       System.out.println(set5);
       answer = input.nextInt();
       
       if (answer == 1)
       {
    	   day += 16;
       }
       
       
       System.out.println("Your birtdday is "+ day + "!");
	}

}