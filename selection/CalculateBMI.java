package selection;

import java.util.Scanner;
/* BMI calculation:
 * 	(weight KG) / (height in meter)^2
 *  1 pound = 0.45359237 kg
 *  1 inch = 0.0254 meter
 */
public class CalculateBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double weight_to_pound_convertion = 0.45359237; 
		final double inch_to_meter = 0.0254; 
		
		System.out.println("Enter your weight in pounds: ");
		
		Scanner scanner = new Scanner(System.in);
		double kg = scanner.nextDouble() * weight_to_pound_convertion;
		
		System.out.println("Enter your height in inches: ");
		double meter = scanner.nextDouble() * inch_to_meter;
		
		double BMI = kg / Math.pow(meter, 2);
		
		System.out.println("BMI is " + BMI);
		
		if (BMI < 18.5)
		{ 
			System.out.println("Underweight");
		}
		else if (BMI < 25)
		{
			System.out.println("Normal");
		}
		else if (BMI < 30)
		{
			System.out.println("Overweight");
		}
		else if (BMI >=30)
		{
			System.out.println("Obess");
		}
		
	}

}
