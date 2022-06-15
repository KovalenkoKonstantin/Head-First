package ch8;

public class MakeCanine {
    public void go() {
        Canine c;
        c = new Dog();
        //c = new Canine();//compiler will not allow
        c.roam();
    }
}
