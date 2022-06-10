package ch7;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Привет Катя!");
        System.out.println("Я загадал число от 1 до 20\nУгадай его:");
        int number = ThreadLocalRandom.current().nextInt(1, 20);
        //System.out.println(number);
        int attempt = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int guess = scanner.nextInt();
            if (guess > number) System.out.println("Загаданное число меньше");
            if (guess < number) System.out.println("Загаданное число больше");
            if (guess == number) {
                System.out.println("Ура ты угадала!\nбыло загадано число " + number + "\nтебе понадобилось " + (attempt + 1) + " попыток");
                break;
            }
            if (attempt == 4) {
                System.out.println("К сожалению ты израсходовала все попытки и не угадала загаданное число - " + number + " ты проиграла");
                break;
            }
            attempt++;
        }
    }
}