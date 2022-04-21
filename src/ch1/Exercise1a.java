package ch1;

class Exercise1a {
    public static void main(String[] args) {

        int x = 1;
        int count = 0;
        while (x < 10) {//10-3=7 loops
            x++;//to prevent looping forever
            if (x > 3) {
                count++;
                System.out.println("big x :" + count + " loop");
            }
        }
    }
}
