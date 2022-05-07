import java.util.Scanner;



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
