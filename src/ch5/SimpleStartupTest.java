package ch5;

import java.util.concurrent.ThreadLocalRandom;

public class SimpleStartupTest {
    public static void main(String[] args) {
        SimpleStartup simpleStartup = new SimpleStartup();//instantiate SimpleStartup object

        int[] cellsLocation = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};//make an int array
        simpleStartup.setCellsLocation(cellsLocation);//invoke the setter method on startup

        String deliberatelyWrong = simpleStartup.checkForHits(cellsLocation.length * 22);//check for wrong guesses
        int guess = ThreadLocalRandom.current().nextInt(0, cellsLocation.length);//make a fake user guess
        String result = simpleStartup.checkForHits(guess);//pass the fake guess
        String testResult = "Test failed";//initialization
        if (result.equals("hit")) {//condition
            testResult = "Test passed";//change if success
        }
        //System.out.println("Conditional random equals:" + guess);
        System.out.println(testResult);//show
    }
}
