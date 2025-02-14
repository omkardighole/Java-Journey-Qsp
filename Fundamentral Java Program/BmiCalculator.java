import java.util.Scanner;
public class BmiCalculator{
	public static void main(String [] args){
		Scanner sc = new Scanner( System.in);
		System.out.print("Enter weight in pounds :");
		
		double pound = sc.nextDouble();
		double kg = pound *0.45459237;
		
		System.out.print("Enter height in inches :");
		double heightInches = sc.nextDouble();
		
		double heightMeters = ((heightInches * 2.5)/100);
		double heightSquared =  heightMeters * heightMeters;
		
		double bmi = kg/heightSquared;
		
		System.out.println(" The BMI is " +bmi);
	}
}
		
	/*body mass index (BMI) is a measure of health 
	on weight it can be calculated by taking your weight
	in kg and dividing by the square of  your height in meters  
	. write a  program that prompts the user to enter a weight in 
	pounds and height in inches and displays the BMI */	
