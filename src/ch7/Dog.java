package ch7;

public class Dog extends Animal {
    @Override
    public void eat() {
        super.eat();
        System.out.println("chawk-chawk");
    }

    @Override
    public void roam() {
        super.roam();
        System.out.println("wof-wof");
    }
}
