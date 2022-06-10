package ch7;

final class Vet {//final classes cannot be extended
  public void giveShot(Animal a) {
    // do horrible things to the Animal at
    // the other end of the ‘a’ parameter
    a.makeNoise();
  }
}

