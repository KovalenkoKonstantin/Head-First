package ch9;

import ch7.Overload;

public class Duck {
  int size;

  @Constructor
  public Duck() {//default constructor
  }

  @Overload
  @Constructor
  public Duck(int duckSizeInPounds) {
    System.out.println("Quack");

    size = duckSizeInPounds;

    System.out.println("This duck's size is " + size + " grands");
  }

  public void setSize(int size) {
    this.size = size;
  }

  public int getSize() {
    return size;
  }
}

// terrible way to provide a default value:
//public Duck(int newSize) {
//  if (newSize == 0) {
//    size = 27;
//  } else {
//    size = newSize;
//  }
//}
