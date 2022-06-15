package ch8;

public interface Pet {
    public abstract void beFriendly();

    default void play() { //interfaces can have implementation code
        System.out.println("Play stuff");
    }

    static void cuteEyes() { //interfaces can have implementation code
        System.out.println("Blink with interface eyes");
    }
}