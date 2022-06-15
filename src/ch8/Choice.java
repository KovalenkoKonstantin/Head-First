package ch8;

public class Choice extends Canine implements Nose, Pet{
    @Override
    public void stinks() {

    }

    @Override
    public int iMethod() {
        return 0;
    }

    @Override
    public void beFriendly() {

    }

    @Override
    public void play() {
        Pet.super.play();
    }
}
