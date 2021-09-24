import java.util.Scanner;
public class MovieDriver {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
// Create movie object
String repeat;
do {
Movie movObj = new Movie();
System.out.println("Please enter the title of a movie: ");
String title1 = input.nextLine();
movObj.setTitle(title1);
System.out.println("Please enter the movie's rating: ");
String rating1 = input.nextLine();
movObj.setRating(rating1);
System.out.println("Please enter the number of tickets the movie sold: ");
int numTicketSold = input.nextInt();
movObj.setSoldTickets(numTicketSold);
String movieName = movObj.toString();
System.out.println(movieName);
System.out.println("Do you want to repeat the questions? (y or n)");
repeat = input.next();
input.nextLine();
} while (repeat.equals("y"));
System.out.println("Goodbye");
input.close();
}
}