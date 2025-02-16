import java.util.*;

public class swap
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Before swapping: A = " + a + ", B = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: A = " + a + ", B = " + b);
        sc.close();

    }
}
