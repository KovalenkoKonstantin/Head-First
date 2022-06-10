package ch7;

public class Hippo extends Animal {
    @Override
    public void eat() {
        super.eat();
        System.out.println("fluup-fluup");
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("rororo");
    }

    @Override
    public void roam() {
        super.roam();
        System.out.println("Fffrow-Fffrow");
    }
}
