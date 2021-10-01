import java.util.Scanner;
public class RandomNumberGuesser {
		public static void main(String[] args) {
			int randNum = 0;
			int nextGuess = 0;
			int lowGuess = 0;
			int highGuess = 100;
			int guessNum = 0;
			String repeat = "n";
			Scanner input = new Scanner(System.in);
			RNG rngObj = new RNG();
			do {
			System.out.println("Please enter your first guess between 0 and 100: ");
			int x = rngObj.rand();
			rngObj.resetCount();
			
			while(nextGuess != x) {
					
					nextGuess = input.nextInt();
					
					boolean y = rngObj.inputValidation(nextGuess, lowGuess, highGuess);
					int z = rngObj.getCount();
				if (y == false) {
					continue;

				}
				if (nextGuess > x) {
					highGuess = nextGuess;
					System.out.println("Number of guesses is " + z );
					System.out.println("Your guess is too high");
					System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
				}
				else if (nextGuess < x) {
					lowGuess = nextGuess;
					System.out.println("Number of guesses is " + z );
					System.out.println("Your guess is too low");
					System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
				}
				else {
					System.out.println("Number of guesses is " + z );
					System.out.println("Congratulations, you guessed correctly");
					}
			}
			System.out.println("Do you want to try again? (y or n)");
			lowGuess = 0;
			highGuess = 100;
			repeat = input.next();
			
		
		} while(repeat.equals("y"));
			System.out.println("Thank you for playing...");
			input.close();
				
		}
}

