package ch9;

public class TestLifeOne {
  public void read() {
    int s = 42;
    // ‘s’ can be used only
    // within this method.
    // When this method ends,
    // ‘s’ disappears completely.
    sleep();
  }


  public void sleep() {
//    s = 7;
  }
}