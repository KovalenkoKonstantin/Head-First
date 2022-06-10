package ch7;

import java.util.ArrayList;

public class AnimalUseStuff {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Wolf());
        animals.add(new Hippo());
        animals.add(new Lion());

        for (Animal animal : animals) {
            animal.eat();
            animal.roam();
        }

    }
}
