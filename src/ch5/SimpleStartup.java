package ch5;

class SimpleStartup {
    private int[] cellsArray;//an array that holds empty cells
    private int succesfulHits = 0;//number of successful hits

    public void setCellsLocation(int[] cellsLocation) {
        cellsArray = cellsLocation;
    }//pass an array to the method

    public String checkForHits(int guess) {
        String result = "miss";
        if (guess >= cellsArray.length) {
            //System.out.println("The number shoud be les than " + (cellsArray.length - 1));
        }
        for (int cell : cellsArray) {//iterate over the elements in an array or collection
            if (guess == cell) {
                result = "hit";
                succesfulHits++;
                break;
            } // end if
        } // end for
        if (succesfulHits == cellsArray.length) {
            result = "kill";
        } // end if
        //System.out.println(result);
        return result;
    } // end checkForHits method
} // close SimpleStartup class

