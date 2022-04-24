package ch4.puzzle4;
//need result 543345
public class Puzzle4 {//static
    public static void main(String[] args) {//static
        Value[] values = new Value[6];
        int number = 1;//static
        int i = 0;//static
        while (i < 6) {//static
            values[i] = new Value();
            values[i].intValue = number;
            number *= 10;//static
            i ++;
        }

        int result = 0;//static
        i = 6;//static
        while (i > 0) {//static
            i --;
            result = result +//static
                    values[i].doStuff(i);
        }
        System.out.println("result " + result);//static
    }
}

