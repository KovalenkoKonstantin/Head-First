package ch9;

import ch7.Overload;

public class Mushroom {
  public Mushroom(int size) {
  }
  @Overload
  public Mushroom() {
  }
  @Overload
  public Mushroom(boolean isMagic) {
  }
  @Overload
  public Mushroom(boolean isMagic, int size) {
  }
  @Overload
  public Mushroom(int size, boolean isMagic) {
  }
}