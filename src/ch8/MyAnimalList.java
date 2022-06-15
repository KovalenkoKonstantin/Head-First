package ch8;

import ch7.Animal;

public class MyAnimalList {

  private Animal[] animals = new Animal[5];
  private int nextIndex = 0;

  public void add(Animal anyAnimal) {
    if (nextIndex < animals.length) {
      animals[nextIndex] = anyAnimal;
      System.out.println("Animal added at index " + nextIndex);
      nextIndex++;
    }
  }
}