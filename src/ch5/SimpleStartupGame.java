package ch5;

import java.util.concurrent.ThreadLocalRandom;

public class SimpleStartupGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleStartup theStartup = new SimpleStartup();
        int randomNum = ThreadLocalRandom.current().nextInt(0, 10);

        System.out.println(randomNum);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theStartup.setCellsLocation(locations);
        boolean isAlive = true;

        while (isAlive) {
            int guess = helper.getUserInput("enter a number");

            if (guess < randomNum) System.out.println("Selected number is less than the beginning of the array");
            else if (guess >= randomNum + 3) System.out.println("Selected number is more than the end of the array");

            String result = theStartup.checkForHits(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            } // close if
        } // close while
    } // close main

}
