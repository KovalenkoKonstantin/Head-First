package ch3;

class Triangle {
                                            double area;//static
                                            int height;//static
                                            int length;//static

                                            public static void main(String[] args) {//static
        int x = 0;
        Triangle[] ta = new Triangle[4];
                                            while //static
         (x < 4) {
            ta[x] = new Triangle();
            ta[x]
                                            . height = (x + 1) * 2;//static
            ta[x]
                                            .length = x + 4;//static
            ta[x].setArea();
                                            System.out.print("triangle " + x + ", area");//static
                                            System.out.println(" = " + //static
                    ta[x]
                                            .area);//static
            x ++;
        }
        int y = x;
                                            x = 27;//static
                                            Triangle t5 = ta[2];//static
                                            ta[2].area = 343;//static
                                            System.out.print("y = " + y);//static
                                            System.out.println(", t5 area = " + t5.area);//static
    }

                                            void setArea() {//static
        area
                                            = (height * length) / 2;//static
    }
}


/*
class Triangle {
  double area;
  int height;
  int length;

  public static void main(String[] args) {
    ____________
    _______________________
    while ( __________ ) {
      __________________________
      ________.height = (x + 1) * 2;
      ________.length = x + 4;
      __________________________
      System.out.print("triangle " + x + ", area");
      System.out.println(" = " + _______.area);
      ________________
    }
    ______________
    x = 27;
    Triangle t5 = ta[2];
    ta[2].area = 343;
    System.out.print("y = " + y);
    System.out.println(", t5 area = " + t5.area);
  }
  void setArea() {
    ____________ = (height * length) / 2;
  }
}

*/

