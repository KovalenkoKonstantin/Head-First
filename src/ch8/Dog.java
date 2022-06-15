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
    System.out.println("Wuf-wuf");
  }

  @Override
  public void stinks() {
    System.out.println("Long unwashed dog stinks");
  }

  @Override
  public void eat() {

  }
  public static void anotherCuteEyes(){
    System.out.println("Blink with dog eyes");
  }
}