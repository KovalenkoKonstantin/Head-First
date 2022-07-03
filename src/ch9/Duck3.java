package ch9;

import ch7.Overload;

public class Duck3 extends Animal{
    int size;
    @Constructor
    public Duck3 () {
        super();
    }//good programming style
    @Constructor
    @Overload
    public Duck3 (int newSize){
        super();
        size = newSize;
        System.out.println("Making a Duck #3");
    }

    public static void main(String[] args) {
        Duck3 duck3 = new Duck3(20);
    }
}
