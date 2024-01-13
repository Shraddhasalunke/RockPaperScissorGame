import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"Rock", "Paper", "Scissors"};

        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (true) {
            int computerChoice = random.nextInt(3); 

            System.out.println("Enter your choice (0 for Rock, 1 for Paper, 2 for Scissors, or -1 to quit):");
            int userChoice = scanner.nextInt();

            if (userChoice == -1) {
                System.out.println("Thanks for playing!");
                break;
            }

            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Invalid choice. Please enter 0, 1, or 2.");
                continue;
            }

      System.out.println("You chose: " + options[userChoice]);
            System.out.println("Computer chose: " + options[computerChoice]);

            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 0 && computerChoice == 2) ||
                       (userChoice == 1 && computerChoice == 0) ||
                       (userChoice == 2 && computerChoice == 1)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        scanner.close();
    }
}
