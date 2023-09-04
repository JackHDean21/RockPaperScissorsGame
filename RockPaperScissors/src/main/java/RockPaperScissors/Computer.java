package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Computer extends User{
    public String computerChoice;
    void setComputerChoice() {
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        this.computerChoice = choices[random.nextInt(choices.length)];
        System.out.printf("The computer has chosen: %s\n", computerChoice);
    }

    String getComputerChoice() {
        return computerChoice;
    }

}


