import java.util.Scanner;
import java.util.Random;

public class NumberGame 
    {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("=== Welcome to the Number Guessing Game! ===");
        System.out.println("I am thinking of a number between 1 and 100. Let's see if you can guess it!");

        int totalRounds = 5;
        int roundcount = 0;
        int score = 0;
        boolean wantsToPlay = true;

        while (roundcount < totalRounds) 
        {
            roundcount++;
            int myNumber = rand.nextInt(100) + 1;
            int attemptsLeft = 5;
            boolean won = false;

            System.out.println("\n--- Round " + roundcount + " ---");
            System.out.println("You have " + attemptsLeft + " attempts. Start guessing!");

            while (attemptsLeft > 0) 
            {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attemptsLeft--;

                if (userGuess == myNumber) 
                {
                    System.out.println("Wow! Correct answer. You guessed it!");
                    won = true;
                    score += (attemptsLeft + 1);
                    break;
                } 
                else if (userGuess > myNumber) 
                {
                    System.out.println("Too high! Try a smaller number. (Chances left: " + attemptsLeft + ")");
                } 
                else 
                {
                    System.out.println("Too low! Try a bigger number. (Chances left: " + attemptsLeft + ")");
                }
            }

            if (!won) 
            {
                System.out.println("\nAh,you missed it! All attempts are used up. The correct number was: " + myNumber);
            }

            System.out.print("\nDo you want to play another round of our game? (yes/no): ");
            String choice = sc.next();
            
            if (!choice.equalsIgnoreCase("yes")) 
            {
               wantsToPlay = false;
            }
        }

        System.out.println("\n=== Game Over! You lost it! Better luck next time ===");
        System.out.println("Total Rounds Played: " + totalRounds);
        System.out.println("Your Total Score: " + score);
        System.out.println("Thanks for playing our game!Have a nice day:");
        
        sc.close();
    }
}