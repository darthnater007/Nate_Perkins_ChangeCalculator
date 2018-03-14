import java.util.Scanner;

public class ChangeCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Change Calculator App");
		
		Scanner sc = new Scanner(System.in);
		String choice = "Y";
		
		while (choice.equalsIgnoreCase("Y")) 
		{
			 System.out.print("\nEnter a valid cents amount (1-99):  ");
			 int cents = sc.nextInt();
			 
			 int Q = cents / 25;
			 cents -= Q * 25;
			 System.out.println("Quarters: " + Q);
			 
			 int D = cents / 10;
			 cents -= D * 10;
			 System.out.println("Dimes: " + D);
			 
			 int N = cents / 5;
			 cents -= N * 5;
			 System.out.println("Nickels: " + N);
			 
			 System.out.println("Pennies: " + cents);
			 
			 while (!choice.equalsIgnoreCase("n"))
			 {
				 System.out.print("\nDo another? y/n: ");
				 choice= sc.next();
				 if(choice.equalsIgnoreCase("y"))
				 {
					 break;
				 }
			 }
		}
		
		sc.close();
		System.out.println("\n\n\nLater, Duder.  Take it easy.");
	}

}
