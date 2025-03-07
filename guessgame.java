import java.util.Random;
import java.util.Scanner;

public class guessgame
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;
        int numberOfTries = 0;
        int guess;
        boolean win = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it.");

        while(!win)
        {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            numberOfTries++;

            if(guess < 1 || guess > 100)
                System.out.println("Please Enter a valid number between 1 and 100. Try to guess it!");
            else if(guess < numberToGuess)
                System.out.println("Your guess is too low. try again.");
            else if(guess > numberToGuess)
                System.out.println("Your guess is too high. Try again.");
            else
            {
                win = true;
                System.out.println("Congratutlations! You have guessed the number in " + numberOfTries + " tries.");
            }
        }
        sc.close();
    }
}
