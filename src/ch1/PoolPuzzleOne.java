package ch1;
/*
what we have/left
        x > 0
        x > 3;
        x -=1;
        x -=2;
        System.out.print("an");//definition
        System.out.print("annoys");//definition
*/

/*
what we need:
  a noise
  annoys
  an oyster
*/
public class PoolPuzzleOne {
    public static void main(String[] args) {

        int x = 0;//static

        while (x < 4) {//definition for while
            System.out.print("a");//definition
            if (x < 1) {//static
                System.out.print(" ");//definition
            }
            System.out.print("n");//definition
            if (x > 1) {//definition
                System.out.print(" oyster");//definition
                x += 2;//definition
            }
            if (x == 1) {//static
                System.out.print("noys");//definition
            }
            if (x < 1) {//definition
                System.out.print("oise");//definition
            }
            System.out.println();//static
            x++;//definition
        }
    }
}
