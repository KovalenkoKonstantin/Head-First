package ch9;

public class TestLifeOne {
  public void read() {
    int s = 42;
    // āsā can be used only
    // within this method.
    // When this method ends,
    // āsā disappears completely.
    sleep();
  }


  public void sleep() {
//    s = 7;
  }
}