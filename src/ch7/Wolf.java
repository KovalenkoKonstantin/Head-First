package ch7;

public class Wolf extends Animal {
  public void makeNoise() {

  }

  @Override
  public void stinks() {

  }

  @Override
  public void roam() {
    super.roam();
    System.out.println("awoo");
  }
  @Override
  public void eat() {
    super.eat();
    System.out.println("wruf-wruf");
  }

  public void sleep() {

  }
}
