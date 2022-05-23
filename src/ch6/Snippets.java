package ch6;

import java.util.ArrayList;

public class Snippets {
    void arrayList() {
        ArrayList<Egg> myList = new ArrayList<>();

        Egg egg1 = new Egg();
        myList.add(egg1);//Appends the specified element to the end of this list.

        Egg egg2 = new Egg();
        myList.add(egg2);

        int theSize = myList.size();//Returns the number of elements in this list.

        boolean isIn = myList.contains(egg1);//Returns true if this list contains the specified element.
        // More formally, returns true if and only if this list contains at least one element e such that Objects.equals(o, e).

        int idx = myList.indexOf(egg2);//Returns the index of the first occurrence of the specified element in this list,
        // or -1 if this list does not contain the element.
        // More formally, returns the lowest index i such that Objects.equals(o, get(i)), or -1 if there is no such index.

        boolean empty = myList.isEmpty();//Returns true if this list contains no elements.

        myList.remove(egg1);//Removes the first occurrence of the specified element from this list, if it is present.
        // If the list does not contain the element, it is unchanged.
        // More formally, removes the element with the lowest index i such that Objects.equals(o, get(i))
        // (if such an element exists).
        // Returns true if this list contained the specified element
        // (or equivalently, if this list changed as a result of the call).
    }

    void andExample(int price, String camera) {
        if (price >= 300 && price < 400) {
            camera = "X";
        }
    }

    void orExample(String brand) {
        if (brand.equals("A") || brand.equals("B")) {
            // do stuff for only brand A or brand B
        }
    }

    void longBoolean(String zoomType, int zoomDegree) {
        if ((zoomType.equals("optical") &&
                (zoomDegree >= 3 && zoomDegree <= 8)) ||
                (zoomType.equals("digital") &&
                        (zoomDegree >= 5 && zoomDegree <= 12))) {
            // do appropriate zoom stuff
        }
    }

    void notEqualInt(int model) {
        if (model != 2000) {
            //  do non-model 2000 stuff
        }
    }

    void notEqualString(String brand) {
        if (!brand.equals("X")) {
            // do non-brand X stuff
        }
    }

    void shortCircuit(SomeType refVar) {
        if (refVar != null &&
                refVar.isValidType()) {
            // do ‘got a valid type’ stuff
        }
    }

    void arrayListComparedToArray(String[] myList) {
        String b = new String("Frog");

        boolean isIn = false;
        for (String item : myList) {
            if (b.equals(item)) {
                isIn = true;
                break;
            }
        }
    }

    private class SomeType {
        public boolean isValidType() {
            return false;
        }
    }
}
