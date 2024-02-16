import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        int userGuess = 0;
        boolean done = false;
        String trash = "";

        do {

            System.out.print("Guess the number between 1 and 10: ");
            if (in.hasNextInt()) {
                userGuess = in.nextInt();
                done = true;

            }
            else {
                trash = in.nextLine();
                System.out.println("Enter a valid input not: " + trash);
            }

            if (userGuess < 1 || userGuess > 10) {
                System.out.println("Please enter a number between 1 and 10.");
            }
        } while (!done);

        System.out.println("The random number is: " + randomNumber);

        if (userGuess < randomNumber) {
            System.out.println("Too low!");
        } else if (userGuess > randomNumber) {
            System.out.println("Too high!");
        } else {
            System.out.println("Congratulations! You guessed it right!");
        }



    }
}
