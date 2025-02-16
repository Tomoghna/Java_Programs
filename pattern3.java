import java.util.Scanner;

public class pattern3
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows = scanner.nextInt();
		int n=rows;
		for(int i=1; i<=n; i++)
		{
			for(int j=n-i; j>0; j--)
				System.out.print(" ");
			for(int k=1; k<=(2*i-1); k++)
				System.out.print("*");
			System.out.println();
		}
		
		for(int i=n-1; i>=1; i--)
		{
			for(int j=n-i; j>0; j--)
				System.out.print(" ");
			for(int k=1; k<=(2*i-1); k++)
				System.out.print("*");
			System.out.println();
		}
		Scanner.close();
	}
}
