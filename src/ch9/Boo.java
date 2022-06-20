package ch9;

import ch7.Overload;

public class Boo {
  public Boo(int i) { }
  @Overload
  @Constructor
  public Boo(String s) { }
  @Overload
  @Constructor
  public Boo(String s, int i) { }
}


