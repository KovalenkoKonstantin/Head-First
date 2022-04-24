package ch4;

public class Mix4 {
    int counter = 0;

    //static int variable1 = 9;
    //static int variable2 = 5;//14   1
    //static int variable1 = 20;
    //static int variable2 = 5;//25   1
    //static int variable1 = 7;
    //static int variable2 = 7;//14   1
    static int variable1 = 19;
    static int variable2 = 1;//20   1

    public static void main(String[] args) {
        int count = 0;

        Mix4[] mixes = new Mix4[20];
        int i = 0;
        while (i < variable1) {
            mixes[i] = new Mix4();
            mixes[i].counter = mixes[i].counter + 1;
            count ++;
            count = count + mixes[i].maybeNew(i);
            i ++;
        }
        System.out.println(count + " " +
                mixes[1].counter);
    }

    public int maybeNew(int index) {
        if (index < variable2) {
            Mix4 mix = new Mix4();
            mix.counter ++;
            return 1;
        }
        return 0;
    }
}
