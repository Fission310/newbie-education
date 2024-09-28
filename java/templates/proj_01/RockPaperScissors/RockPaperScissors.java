import java.util.Scanner;

public class RockPaperScissors{
    public static void main(String[] args){
        // Scanner object (user input)
        Scanner scanner = new Scanner(System.in);

        // generates a random number from 0 to 2 inclusive
        // it is up to you to decide which number maps to which move
        int randomNumber = (int) (Math.random() * 3);

        // game interface
        System.out.println("  Welcome to my rock-paper-scissors simulation!");
        System.out.println("-------------------------------------------------");
        System.out.print("Please enter a move (Rock/Paper/Scissors): ");

        // player move
        String playerMove = scanner.next();

        // write your code below this comment
    }
}