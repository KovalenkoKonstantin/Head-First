package ch2.guess_game;

import java.util.concurrent.ThreadLocalRandom;

public class GuessGame {
    Player p1 = new Player();
    ;//GuessGame has three instance variables for the three Player objects
    Player p2 = new Player();
    ;//creates three Players objects
    Player p3 = new Player();
    ;//and assign them to three Player instance variables

    public void startGame() {

        int guessp1 = 0;//creates three variables to hold the guesses
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;//evaluation of answer for each player
        boolean p2isRight = false;//declare and instantiate
        boolean p3isRight = false;

        //int targetNumber = (int) (Math.random() * 10);//outdated
        int targetNumber = ThreadLocalRandom.current().nextInt(0, 9);//better
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {//infinite loop till break
            System.out.println("Number to guess is " + targetNumber);

            guessp1 = p1.guess();//calls each player's guess method from Player Class
            guessp2 = p2.guess();//returns an int value number
            guessp3 = p3.guess();

            System.out.println("Player one guessed " + guessp1);
            System.out.println("Player two guessed " + guessp2);
            System.out.println("Player three guessed " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) { //|| is a type of Logical Operator and is read as “OR OR” or “Logical OR“.

                System.out.println("We have a winner!");

                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);

                System.out.println("Game is over.");
                break; // game over, so break out of the while loop
                //reach only in case if operator if() takes true
            } else {
                // we must keep going because nobody got it right!
                System.out.println("Players will have to try again.");
            } // end if/else
        } // end while loop
    } // end of the startGame method
} // end class
