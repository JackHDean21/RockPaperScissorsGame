package RockPaperScissors;

import java.util.Objects;
import java.util.Scanner;

public class User {

    private String userName;

    public String userChoice;
    void setUserName() {
        System.out.println("Welcome to Rock, Paper, Scissors!\nWhat is your name?");
        Scanner readUserName = new Scanner(System.in);
        this.userName = readUserName.nextLine();
    }

    String getUserName() {
        return userName;
    }
    void wantToPlay() {
        System.out.printf("So... %s, Are you ready to play? (type yes or no)\n", getUserName());
        Scanner readDecision = new Scanner(System.in);
        String play = readDecision.nextLine();
        if (Objects.equals(play, "yes")) {
            setUserChoice();
        }else if (Objects.equals(play, "no")) {
            System.out.println("Alright then, Goodbye!");
            System.exit(0);
        }else {
            System.out.println("Please answer with either yes or no.");
            wantToPlay();

        }


    }
    void setUserChoice() {
        System.out.println("Rock, Paper or Scissors?");
        Scanner readUserChoice = new Scanner(System.in);
        this.userChoice = readUserChoice.nextLine().toLowerCase();
        System.out.println("You have chosen: " + userChoice);
    }

    String getUserChoice(){
        return userChoice;
    }


}
