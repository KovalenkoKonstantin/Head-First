package ch8;

public class Dog extends Canine implements Pet {
  @Override
  public void beFriendly() {
    System.out.println("Do friendly stuff");

  }
  @Override
  public void play() {
    System.out.println("Do extra play stuff");
  }
  @Override
  public void roam() {

  }
  @Override
  public void eat() {

  }
  public static void anotherCuteEyes(){
    System.out.println("Blink with dog eyes");
  }
}