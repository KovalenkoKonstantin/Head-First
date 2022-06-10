package ch7;

import java.util.ArrayList;

public class MonsterTestDrive {
    public static void main(String[] args) {
//        Monster[] monsters = new Monster[3];
//        monsters[0] = new Vampire();
//        monsters[1] = new Dragon();
//        monsters[2] = new Monster();
        ArrayList<Monster> monsters = new ArrayList<>();
        monsters.add(new Vampire());
        monsters.add(new Dragon());
        monsters.add(new Monster());

        for (int i = 0; i < monsters.size(); i++) {
            //monsters[i].frighten(i);
            monsters.get(i).frighten(i);
        }
    }

    static class Monster {
        boolean frighten(int d) {
            System.out.println("arrrgh");
            return true;
        }
    }

    static class Dragon extends Monster {
        @Override
        boolean frighten(int degree) {
            System.out.println("breathe fire");
            return true;
        }
    }

    static class Vampire extends Monster {
        @Override
        boolean frighten(int x) {
            System.out.println("a bite?");
            return false;
        }
    }
}

//boolean frighten(int x) {
//  System.out.println("arrrgh");
//  return true;
//}
//int frighten(int f) {
//  System.out.println("a bite?");
//  return 1;
//}
//
//boolean frighten(int x) {
//  System.out.println("arrrgh");
//  return false;
//}
//boolean scare(int x) {
//  System.out.println("a bite?");
//  return true;
//}
//
//boolean frighten(int z) {
//  System.out.println("arrrgh");
//  return true;
//}
//boolean frighten(byte b) {
//  System.out.println("a bite?");
//  return true;
//}
