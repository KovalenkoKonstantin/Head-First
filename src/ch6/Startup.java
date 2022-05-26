package ch6;

import java.util.ArrayList;

public class Startup {
    private ArrayList<String> cellsLocation;
    private String name;

    public void setCellsLocation(ArrayList<String> cellsLocation) {
        this.cellsLocation = cellsLocation;
    }
//    public void setCellsLocation(ArrayList<String> loc) {
//        cellsLocation = loc;
//    }
    public void setName(String name) {
        this.name = name;
    }
//    public void setName(String n) {
//        name = n;
//    }


    public String checkYourself(String userInput) {
        String result = "miss";
        int index = cellsLocation.indexOf(userInput);//Returns the index of the first occurrence of the specified element
        // in this list, or -1 if this list does not contain the element
        if (index >= 0) {
            cellsLocation.remove(index);
            if (cellsLocation.isEmpty()) {//Returns true if this list contains no elements.
                result = "kill";
                System.out.println("Ouch! You sunk " + name + "   : ( ");
            } else {
                result = "hit";
            } // end if
        } // end outer if
        return result;
    } // end method
} // close class
