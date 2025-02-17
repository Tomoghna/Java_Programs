import java.util.*;

public class primeno
{
	public static void main(String[] args)
	{
		int flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check: ");
		int n = sc.nextInt();
		for(int i=1; i<=n/2; i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
			else
				flag = 0;
		}
		if(flag==1)
			System.out.println(n+" is a prime number.");
		else
			System.out.println(n+" is not a prime number.");
		sc.close();
	}
}
