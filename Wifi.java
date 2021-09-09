import java.util.Scanner;
public class Wifi {
	public static void main(String[] args)
	{
		Scanner Q1 = new Scanner(System.in);

		
			System.out.println("First method: Did you reboot your computer and try reconnecting to the internet?");
			System.out.println("Are you now able to connect to the internet?");
			System.out.println("Yes or No");
			String answer1 = Q1.nextLine();
				
			if (answer1.equals("Yes")) 
			{
				System.out.println("I'm glad it worked!");
				return;
			}
			
		
			System.out.println("Second method: Did you reboot your router and then try reconnecting to the internet?");
			System.out.println("Are you now able to connect to the internet?");
			System.out.println("Yes or No");
			String answer2 = Q1.nextLine();	
			
			if (answer2.equals("Yes"))
			{
				
				System.out.println("I'm glad it worked!");
				return;
			}
				

			
			System.out.println("Third method: Did you check to see if the internet cables are properly plugged in to your computer?");
			System.out.println("Are you now able to connect to the internet?");
			System.out.println("Yes or No");
			String answer3 = Q1.nextLine();
				
			if (answer3.equals("Yes"))
			{
				
				System.out.println("I'm glad it worked!");
				return;
			}
				

			
			System.out.println("Fourth method: Have you tried moving your computer closer to your router and seeing if it will connect to the internet?");
			System.out.println("Are you now able to connect to the internet?");
			System.out.println("Yes or No");
			String answer4 = Q1.nextLine();
				
			if (answer4.equals("Yes"))
			{
				System.out.println("I'm glad it worked!");
				return;
			}
				

			
			System.out.println("Fifth method: Have you tried contacting your internet service provider?");
			System.out.println("Make sure your ISP is hooked up to your router.");

			return;
			}
	
}
