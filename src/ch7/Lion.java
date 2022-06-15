package ch7;

public class Lion extends Animal {
    @Override
    public void eat() {
        super.eat();
        System.out.println("Crak-Crak");
    }

    @Override
    public void roam() {
        super.roam();
        System.out.println("Grrrr-Grrrr");
    }

    @Override
    public void stinks() {

    }
}
