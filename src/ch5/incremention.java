package ch5;

public class incremention {
    public static void main(String[] args) {
        int x = 0;
        int z = ++x;
        int i = 0;
        int y = i++;
        System.out.println(z);
        System.out.println(y);
        System.out.println(i);
        y = i;
        System.out.println(y);
    }
}
