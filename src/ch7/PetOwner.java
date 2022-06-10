package ch7;

class PetOwner {
    public void start() {
        Vet vet = new Vet();
        Dog dog = new Dog();
        Hippo hippo = new Hippo();

        vet.giveShot(dog);
        vet.giveShot(hippo);
    }

    public static void main(String[] args) {
        PetOwner owner = new PetOwner();
        owner.start();
    }
}

