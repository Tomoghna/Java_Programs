import java.util.*;

class practice
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.print("What is your name: ");
		String s = sc.nextLine();
		System.out.println("Your number is: " + n);
		System.out.println("Your name is: " + s);

		sc.close();
		
	}
}
