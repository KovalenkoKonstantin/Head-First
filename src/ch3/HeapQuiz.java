package ch3;

class HeapQuiz {//КучаВикторина
    int id = 0;

    public static void main(String[] args) {
        int x = 0;
        HeapQuiz[] hq = new HeapQuiz[5];
        while (x < 3) {
            hq[x] = new HeapQuiz();
            hq[x].id = x;//id = 0;1;2   |   hq[0].id=0  hq[1].id=1  hq[2].id=2
            x++;
        }
        hq[3] = hq[1];//hq[3]->id=2     |   hq[3]->id=2
        hq[4] = hq[1];//hq[4]->null     |   hq[4]->id=2
        hq[3] = null;//hq[3]->id=2      |   hq[3]->null
        hq[4] = hq[0];//hq[4]->id=2     |   hq[4]->id=0
        hq[0] = hq[3];//hq[0]->id=0     |   hq[0]->null
        hq[3] = hq[2];//hq[3}->id=null  |   hq[3]->id=2
        hq[2] = hq[0];//hq[2]->id=2     |   hq[2]->id=null

        for (int i = 0; i < hq.length; i++) {
            if (hq[i]==(null)) {
                System.out.println("hq[" + i + "] equals null");
            } else System.out.println("hq[" + i + "]" + " linked to id = " + hq[i].id);

            //System.out.println(hq[0].id);//null
            //System.out.println(hq[1].id);//id=1
            //System.out.println(hq[2].id);//null
            //System.out.println(hq[3].id);//id=2
            //System.out.println(hq[4].id);//id=0
        }
    }
}

