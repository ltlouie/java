package mystring;

/* 
(Student major and status) Write a program that prompts the user to enter two characters and displays the major and status represented in the characters. The first character indicates the major and the second is number character 1, 2, 3, 4, which indicates whether a student is a freshman, sophomore, junior, or senior. Suppose the following chracters are used to denote the majors:
M: Mathematics
C: Computer Science
I: Information Technology

M1 becomes Mathematics Freshman
C3 becomes Computer Science Junior
T3 becomes invalid input
*/
public class StudentMajorStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "C5";
		
		char c = input.charAt(0);
		String output = null;
		
		switch (c) {
		 case 'M' : 
			 output = "Mathematics ";
			 break;
		 case 'C' : 
			 output = "Computer Science ";
			 break;
		 case 'I' : 
			 output = "Information Technology ";
			 break;
		 default:
			 output = null;
			 break;
		}
		
		c = input.charAt(1);

		 switch (c) {
			case '1' :
				output += "Freshman";
				break;
			case '2' :
				output += "Sophmore";
				break;
			case '3' : 					
				output += "Junior";
				break;
			case '4' : 
				output += "Senior";
				break;
			default: 
				output = null;  
				break;
			}
		
		if (output == null)
		{
			System.out.println("Invalid input");
		}
		else
		{
			System.out.println(output);
		}	
	}

}
