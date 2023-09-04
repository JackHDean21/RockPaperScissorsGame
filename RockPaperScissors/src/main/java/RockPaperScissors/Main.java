package RockPaperScissors;

import java.util.Scanner;  // Import the Scanner class
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Scanner userRematch = new Scanner(System.in);
        while (true) {
            User player1 = new User();
            player1.setUserName();
            player1.wantToPlay();
            String userChoice = player1.getUserChoice();

            Computer ai = new Computer();
            ai.setComputerChoice();
            String computerChoice = ai.getComputerChoice();

            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!\nLETS KEEP GOING!");
                player1.setUserChoice();
                ai.setComputerChoice();
            }
            if (userChoice.equals("rock") && (computerChoice.equals("scissors"))) {
                System.out.println("YOU WIN!!!");

            } else if (userChoice.equals("paper") && (computerChoice.equals("rock"))) {
                System.out.println("YOU WIN!!!");

            } else if (userChoice.equals("scissors") && (computerChoice.equals("paper"))) {
                System.out.println("YOU WIN!!!");
            } else {
                System.out.println("YOU LOSE!!!");
            }
            System.out.println("Would you like a rematch? (Answer yes or no)");
            String rematchDecision = userRematch.nextLine().toLowerCase();
            if (rematchDecision.equals("no")) {
                System.out.println("Goodbye!");
                System.exit(0);
            }else if (rematchDecision.equals("yes")) {
                System.out.println("Cool! Let's play again!");
                continue;
            }
            while (!rematchDecision.equals("yes") && !rematchDecision.equals("no")); {
                System.out.println("Please answer rather yes or no");
                rematchDecision = userRematch.nextLine().toLowerCase();
            }


        }
    }
}
