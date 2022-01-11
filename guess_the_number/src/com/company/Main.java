package company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int minNum = 1;
        int maxNum = 20;

        int randomNum = (int)Math.floor(Math.random()*(maxNum-minNum+1)+minNum);


        Scanner getInput = new Scanner(System.in);
        System.out.println("Hello! What's your name?");

        String userInput = getInput.nextLine();
        try {
            System.out.println("Well, " + userInput + ", I am thinking of a number between 1 and 20.\n Take a guess.");
        } catch (Exception e) {
            System.out.println("Sorry, please print your name!");
        }


        Scanner getNumInput = new Scanner(System.in);


        int trialNum = 6;
        int userAttempt = 0;

        try {
            for (int i = 0; i < trialNum; i++) {
                int userNum = getNumInput.nextInt();
                userAttempt += 1;

                if (userNum == randomNum) {
                    System.out.println("Good job, " + userInput + "! You guessed my number in " + userAttempt + " tries! Would you like to play again? (y or n)");
                    break;
                }
                else if (userNum < randomNum) {
                    System.out.println("Your number is too low.");
                }
                else if (userNum > randomNum){
                    System.out.println("Your number is too high.");
                }
            }
        } catch (Exception e) {
            System.out.println("Sorry, please type a number!");
        }

    }
}
