package ch4.good_dog;

class GoodDogTestDrive {

    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSizeInCm(70);

        GoodDog two = new GoodDog();
        two.setSizeInCm(8);

        System.out.println("Dog one size is: " + one.getSizeInCm());
        System.out.println("Dog two size is: " + two.getSizeInCm());

        one.bark();
        two.bark();
    }
}
