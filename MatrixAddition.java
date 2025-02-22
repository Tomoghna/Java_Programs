import java.util.Scanner;

public class MatrixAddition
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int mat1[][] = new int[rows][cols];
        int mat2[][] = new int[rows][cols];

        System.out.println("Enter the elements of the first Matrix: ");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.print("Element [" + i + "][" + j + "]: ");
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second Matrix: ");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.print("Element [" + i + "][" + j + "]: ");
                mat2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Displaying the two matrices:");
        System.out.println("Matrix 1:");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
                System.out.print(mat1[i][j] + " ");
            System.out.println();
        }
        System.out.println("Matrix 2:");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
                System.out.print(mat2[i][j] + " ");
            System.out.println();
        }

        System.out.println("Sum of the two matrices: ");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
                System.out.print(mat1[i][j] + mat2[i][j] + " ");
            System.out.println();
        }

        sc.close();

    }
}