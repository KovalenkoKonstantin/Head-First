package ch4.good_dog;

class GoodDog {
    private int sizeInCm;

    public int getSizeInCm() {
        return sizeInCm;
    }

    public void setSizeInCm(int sizeInCm) {
        this.sizeInCm = sizeInCm;
    }

    void bark() {
        if (sizeInCm > 60) {
            System.out.println("Wooof! Wooof!");
        } else if (sizeInCm > 14) {
            System.out.println("Ruff!  Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}
