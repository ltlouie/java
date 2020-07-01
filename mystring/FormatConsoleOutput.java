package mystring;

public class FormatConsoleOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount = 12618.98;
		double interestRate = 0.0013;
		double interest = amount * interestRate; 
		System.out.println("Interest is $" + interest);
		
		
		// because of currency, we should display only the 2 digit after decimal
		System.out.println("Interest is $" + (int)(interest * 100) / 100.0);
		
		// use formatter
		// 4 is the field width
		// 2 is the precision
		// f is the format specifier
		System.out.printf("Interest is $%4.2f", interest);
	
	}

}
