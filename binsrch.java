import java.util.*;

public class binsrch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            if(arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("Here is the sorted array: ");
        for(int i=0; i<n; i++)
            System.out.print(arr + " ");
        System.out.println();

        System.out.println("Enter the element to search: ");
        int x = sc.nextInt();
        int low = 0;
        int high = n-1;
        while(low <= high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid] == x)
            {
                System.out.println("Element found at index: " + mid);
                sc.close();
                return;
            }
            else if(arr[mid] < x)
                low=mid+1;
            else
                high=mid-1;
        }
        System.out.println("Element not found!!");
        sc.close();
    }
}