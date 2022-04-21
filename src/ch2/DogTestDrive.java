package ch2;

class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.size = 40;
        //dog.bark();
        dog.name = "Rufus";
        dog.breed = "A Golden Retriever";
        dog.times = 50;
        System.out.printf("I'm " + dog.name +
                "\n" + dog.breed +
                "\nI can bark this way: " + dog.bark() +
                "\nmy size is " + dog.size + " centimeters tall" +
                "\nand I can wag my tail " + dog.wagtail() + " times!!!");
    }
}
