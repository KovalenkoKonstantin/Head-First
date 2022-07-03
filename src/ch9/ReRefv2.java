package ch9;

public class ReRefv2 {
    Duck d = new Duck();

    public void go() {
        d = null;
    }
}
