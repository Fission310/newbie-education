import java.util.Scanner;

public class GuessTheNumber{
    public static void main(String[] args){
        // Scanner object (user input)
        Scanner scanner = new Scanner(System.in);

        // generates a random number from 0 to range inclusive
        int range = 100;
        int randomNumber = (int) (Math.random() * (range + 1));

        // game interface
        System.out.println("  Welcome to my guess the number game!");
        System.out.println("------------------------------------------");
        System.out.print("Please enter a number between 0-" + range + ": ");

        // number user guessed
        int userNumber = scanner.nextInt();

        // write your code below this comment
    }
}