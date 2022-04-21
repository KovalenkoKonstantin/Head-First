package ch2.guess_game;

import java.util.concurrent.ThreadLocalRandom;

public class Player {
    public int number;
    public int guess() {
        //Random randomGenerator = new Random();//outdated
        number = ThreadLocalRandom.current().nextInt(0,9);
        return  number;
    }
}
