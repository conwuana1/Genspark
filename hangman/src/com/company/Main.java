package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] randomWords = {"dubai", "seoul", "miami", "tokyo", "busan"};


//
        Scanner getInput = new Scanner(System.in);


//
//        int trialNum = 5;
//        int userAttempt = 0;

        List<String> wordsList = new ArrayList<>(Arrays.asList(randomWords));

        Random rand = new Random();

        String randWord = wordsList.get(rand.nextInt(wordsList.size()));
        System.out.println(randWord);

        List<Character> playerGuess = new ArrayList<>();

        for (int i = 0; i < randWord.length(); i ++) {
            if (playerGuess.contains(randWord.charAt(i))) {
                System.out.print(randWord.charAt(i));
            }
            else {
                System.out.print("-");
            }
        }
        System.out.println();

        int correctGuessCount = 0;
        int wrongCount = 0;

        while (true) {

            System.out.println("H A N G M A N");
            System.out.println("+---+");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("   ===");
            if (wrongCount >= 1) {
                System.out.println("O");
            }
            if (wrongCount >= 2) {
                System.out.println("|");
            }
            if (wrongCount >= 3) {
                System.out.println("|");
            }
            if (wrongCount >= 4) {
                System.out.print("/");
                if (wrongCount >= 5) {
                    System.out.println("\\ ");
                }
                else {
                    System.out.println("");
                }
            }

            System.out.println("Guess a letter.");
            String userInput = getInput.nextLine();

            playerGuess.add(userInput.charAt(0));
            randWord.contains(userInput);

            for (int i = 0; i < randWord.length(); i ++) {
                if (playerGuess.contains(randWord.charAt(i))) {
                    System.out.print(randWord.charAt(i));
                    correctGuessCount++;
                }
                if (wrongCount >= 6) {
                    System.out.println("YOU LOSE!");
                    break;
                }
                if (!playerGuess.contains(randWord.charAt(i))) {
                    wrongCount++;
                }
//                System.out.println("Please guess the word:");
//                if(getInput.nextLine().equals(randWord)) {
//                    System.out.println("Congrats! YOU WIN!");
//                    break;
//                }
                else {
                    System.out.print("-");
                }
            }

        }





//        for (int i = 0; i < trialNum; i++) {
//            String userChar = getInput.nextLine();
//
//            if (wordsList.contains(userChar)) {
//                System.out.println("Correct!");
//            } else {
//                System.out.println("Guess a letter.");
//            }
//        }
    }
}
