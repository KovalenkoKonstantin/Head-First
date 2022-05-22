package ch5;

class SimpleStartup {
    private int[] cellsArray;//an array that holds empty cells
    private int successfulHits = 0;//number of successful hits

    public void setCellsLocation(int[] cellsLocation) {
        cellsArray = cellsLocation;
    }//pass an array to the method

    public String checkForHits(int guess) {
        String result = "miss";

        for (int cell : cellsArray) {//iterate over the elements in an array or collection
            if (guess == cell) {
                result = "hit";
                successfulHits++;
                break;
            } // end if
        } // end for
        if (successfulHits == cellsArray.length) {
            result = "kill";
        } // end if
        System.out.println(result);
        return result;
    } // end checkForHits method
} // close SimpleStartup class

