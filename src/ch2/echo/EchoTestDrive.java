package ch2.echo;
/*output:
        helloooo...
        helloooo...
        helloooo...
        helloooo...
        10*/

public class EchoTestDrive {
    public static void main(String[] args) {
        Echo e1 = new Echo();//static
        Echo e2 = new Echo();
//       - or -
//    Echo e2 = e1;    // bonus "24” answer
        int x = 0;//static
        while (x < 4) {
            e1.hello();//static
            e1.count ++;
            if (x == 3) {
                e2.count ++;//static
            }
            if (x > 0) {
                e2.count = e2.count + e1.count;//static
            }
            x ++;
        }
        System.out.println(e2.count);//static
    }
}
