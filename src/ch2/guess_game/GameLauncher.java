package ch2.guess_game;

public class GameLauncher {
    public static void main(String[] args) {
        GuessGame guessGame = new GuessGame();//allocate memory space on the heap
        guessGame.startGame();
    }
}
