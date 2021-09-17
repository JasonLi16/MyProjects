import java.util.Scanner;
public class SphereVolume 
{ 
public static void main(String[] args) {
 
// add your declaration and code here 
	System.out.println("The purpose of this program is to calculate the result of a mathematical formula.");
	Scanner user_input = new Scanner(System.in);
	double diam;
	System.out.println("Enter the diameter of a sphere: ");
	diam = user_input.nextDouble();
	double radius = 0.5 * diam;
	double volume;
	volume = (4.0/3) * Math.PI * Math.pow(radius,3);
	System.out.println(volume);
	

	} 





} 
