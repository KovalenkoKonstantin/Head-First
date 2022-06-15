package ch8;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        double tax = 0.13;
        while (true) {
            System.out.print("Заданная заработная плата: ");
            Scanner scanner = new Scanner(System.in);
            int initial = scanner.nextInt();
            if (initial == 0) break;
            double result = initial - initial * tax;
            System.out.println("Заработная плата после вычета налога: " + result);
        }
    }
}
