package ch8;

public interface Pet {
  public abstract void beFriendly();
  default void play(){
    System.out.println("Play stuff");
  };
}