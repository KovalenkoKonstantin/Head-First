package ch5;

import java.util.concurrent.ThreadLocalRandom;

public class SimpleStartupTest {
    public static void main(String[] args) {
        SimpleStartup simpleStartup = new SimpleStartup();//instantiate SimpleStartup object

        int[] cellsLocation = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};//make an int array
        simpleStartup.setCellsLocation(cellsLocation);//invoke the setter method on startup

        String deliberatelyWrong = simpleStartup.checkForHits(cellsLocation.length * 22);//check for wrong guesses

        int guess = ThreadLocalRandom.current().nextInt(cellsLocation[0], cellsLocation.length);//make a fake user guess
        //System.out.println("Conditional random equals:" + guess);
        String result = simpleStartup.checkForHits(guess);//pass the fake guess
        String testResult = "Test failed";//initialization
        if (result.equals("hit") && deliberatelyWrong.equals("miss")) {//condition.
            // Same as &, but if the operand to the left of & is false, this operator returns false without checking the second operand.
            testResult = "Test passed";//change if success
        }
        System.out.println(testResult);//show
    }
}
