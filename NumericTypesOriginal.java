/**
   This program demonstrates how numeric types and operators behave in Java
   Do Task #1 before adding Task#2 where indicated.
*/
import java.util.Scanner;
public class NumericTypesOriginal {
	public static void main (String[] args) {
		//TASK #2 Create a Scanner object here 
		Scanner user_input = new Scanner(System.in);
		//identifier declarations
		final int NUMBER = 2; // number of scores
		//double score1 = 100; // first test score
		//double score2 = 95; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average = 0; // arithmetic average
		String output; // line of output to print out
		//Task #2 declare a variable to hold the user’s temperature
		double score1;
		//Task #2 prompt user to input score1
		System.out.println("Please enter your first score.");
		score1 = user_input.nextInt();
		//Task #2 read score1 
		double score2;
		//Task #2 prompt user to input score2
		System.out.println("Please enter your second score.");
		score2 = user_input.nextInt();
		
		//Task #2 read score2 
		// Find an arithmetic average
	    average = (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = (5.0/9.0) * (BOILING_IN_F - 32);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		//Task #2 prompt user to input another temperature
		int tempF;
		System.out.println("Please enter a temperature in Fahrenheit");
		//Task #2 read the user’s temperature in Fahrenheit
		tempF = user_input.nextInt();
		//Task #2 convert the user’s temperature to Celsius
		fToC = (5.0/9.0) * (tempF - 32);
		//Task #2 print the user’s temperature in Celsius
		output = tempF + " in Fahrenheit is " + fToC + " in Celcius.";
		System.out.println(output);
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}
