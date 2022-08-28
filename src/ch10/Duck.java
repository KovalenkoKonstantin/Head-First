package ch10;

public class Duck {
  private int size;
  private static int duckCount = 0;//initialized only when the class is first loaded

  public Duck() {
    duckCount++;
  }//it will keep incrementing each time
  // the Duck constructor runs ->
  // the Duck constructor is static and won't be reset to 0.

  public void setSize(int s) {
    size = s;
  }

  public int getSize() {
    return size;
  }

  public static void main(String[] args) {
    Duck duck = new Duck();
    duck.setSize(50);
    System.out.println(duck.getSize());
  }
}