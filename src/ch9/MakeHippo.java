package ch9;

public class MakeHippo {
    public static void main(String[] args) {
        Hippo2 hippo2 = new Hippo2("Fufy");
        System.out.println(hippo2.getName());//call inherited getName()
    }
}
