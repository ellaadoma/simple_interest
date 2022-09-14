import java.util.Scanner;
public class simpleInterest
{
    static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		double principal;
		double rate;
		int time;
		
		System.out.println("Input the values for principal, rate, and time\n"
				+ "to calculate the simple interest.");
		System.out.print("principal = ");
		principal = scan.nextDouble();
		System.out.print("rate = ");
		rate = scan.nextDouble();
		System.out.print("time = ");
		time = scan.nextInt();
		
		double simpleInt = (principal * rate * time) / 100;
		double amount = principal * (1 + (rate/100)* time);
		System.out.println("Simple Interest = " + String.format("%,.2f",simpleInt));
		System.out.println("Amount = " + String.format("%,.2f", amount));

	}

}
