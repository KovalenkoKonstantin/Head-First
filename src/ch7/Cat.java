package ch7;

public class Cat extends Animal {
    @Override
    public void eat() {
        super.eat();
        System.out.println("mliam-mliam");
    }

    @Override
    public void roam() {
        super.roam();
        System.out.println("miau");
    }

    @Override
    public void stinks() {

    }
}
