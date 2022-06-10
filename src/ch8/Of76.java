package ch8;

import java.util.ArrayList;

public class Of76 extends Clowns {
  public static void main(String[] args) {
    ArrayList <Nose> i = new ArrayList<>();
    i.add(new Acts());
    i.add(new Clowns());
    i.add(new Of76());
    for (int x = 0; x < i.size(); x++) {
      System.out.println(i.get(x).iMethod()
                         + " " + i.get(x).getClass());
    }
  }
}