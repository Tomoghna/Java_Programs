import java.util.Scanner;

public class pattern7
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows = scanner.nextInt();
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
				System.out.print(" ");
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}

		for(int i=rows; i>=1; i--)
		{
			for(int j=1; j<=2*(rows-i); j++)
				System.out.print(" ");
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
		scanner.close();
	}
}
