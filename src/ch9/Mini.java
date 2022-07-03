package ch9;

import ch7.Overload;

import java.awt.Color;

class Mini extends Car {
  private Color color;
  @Constructor
  public Mini() {//the no-arg constructor supplies a default color and calls the overloaded real constructor
    this(Color.RED);
  }
  @Constructor
  @Overload
  public Mini(Color c) {//constructor that does the real work of initializing the object
    super("Mini");
    color = c;
    // more initialization
  }

  public Mini(int size) {
    this(Color.RED);
    // won't compile
//    super(size);
  }
}

