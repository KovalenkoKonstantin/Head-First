package ch9;

import ch7.Overload;

public class Duck2 {
  int size;

  @Constructor
  public Duck2() {//default constructor
    // supply default size
    size = 27;
  }

  @Overload
  @Constructor
  public Duck2(int duckSize) {
    // use duckSize parameter
    size = duckSize;
  }
}

