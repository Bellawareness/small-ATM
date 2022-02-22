import java.util.Scanner;

// Create an application that acts as an ATM machine. The initial balance should start at 0. 

// Ask the user for a deposit/withdrawl and use this to affect the actual balance. Reflect the change in balance using a print out statement.
// This transaction process should loop till the user types done instead of a number.

class Main {

static double balance= 0.0 ;
	
  public static void Intro () {
	
System.out.println("Your balance is: " + balance  );

System.out.println("Please input your deposit/withdrawl amount (negative values count as  withdrawl:");

 System.out.println("Please type done when transaction is complete or you want to exit");
	}

public static void main(String[] args) {
 Intro ();
while (true) {
  Scanner scanner = new Scanner(System.in);
	double b = scanner.nextDouble();
	String s = scanner.nextLine();

	if (b >=0 ) {
		 b = b + balance;
System.out.println("Your balance is: " +  b);
System.out.println("Please input your deposit/withdrawl amount (negative values count as " +" withdrawl:");
	 balance = balance +b;
	}
	  else if (b <= -1){
      System.out.println("Your account can't have negative values");
	  System.out.println("Your balance is: " + balance);}
		
	if (s.equals("done")) {
		   break;	}

		   }
	}

	
	}
