package ch8;

import ch7.Dog;

class BadDog {
    public void go() {
        ch7.Dog aDog = new Dog();
        // doesn't compile
//    Dog sameDog = getObject(aDog);
    }

    public Object getObject(Object o) {
        return o;
    }
}