package ch5;

import java.util.concurrent.ThreadLocalRandom;

public class SimpleStartupTest {
    public static void main(String[] args) {
        int origin = 0;
        int bound = 10;
        SimpleStartup simpleStartup = new SimpleStartup();//instantiate SimpleStartup object
        int random = ThreadLocalRandom.current().nextInt(origin, bound);
        int[] cellsLocation = {random, random + 1, random + 2};//make a random int array
//        for (int i : cellsLocation) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
        simpleStartup.setCellsLocation(cellsLocation);//invoke the setter method on startup

        String deliberatelyWrong = simpleStartup.checkForHits(cellsLocation.length * 22);//check for wrong guesses

        int guess = ThreadLocalRandom.current().nextInt(origin, bound);//make a fake user guess
        int wrong_guess = ThreadLocalRandom.current().nextInt(origin + 1, bound * 2);//make a fake user guess
//        System.out.println("Fake user guess equals: " + guess);
        String result = simpleStartup.checkForHits(guess);//pass the fake guess
        String miss_hit = simpleStartup.checkForHits(wrong_guess);//pass the fake guess
//        System.out.println("Result is: " + result);
        String testResult = "Test failed";//initialization
        if (result.equals("hit") | miss_hit.equals("miss") && deliberatelyWrong.equals("miss")) {//condition.
            // Same as &, but if the operand to the left of & is false, this operator returns false without checking the second operand.
            testResult = "Test passed";//change if success
        }
        System.out.println(testResult);//show
    }
}
