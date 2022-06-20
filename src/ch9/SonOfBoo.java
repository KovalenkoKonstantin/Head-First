package ch9;

import ch7.Overload;

class SonOfBoo extends Boo {
    @Constructor
    @Overload
    public SonOfBoo() {
        super("boo");
    }
    @Constructor
    @Overload
    public SonOfBoo(int i) {
        super("Fred");
    }
    @Constructor
    @Overload
    public SonOfBoo(String s) {
        super(42);
    }

//  public SonOfBoo(int i, String s) {
//  }

//  public SonOfBoo(String a, String b, String c) {
//    super(a, b);
//  }
    @Constructor
    @Overload
    public SonOfBoo(int i, int j) {
        super("man", j);
    }

//  public SonOfBoo(int i, int x, int y) {
//    super(i, "star");
//  }
}
