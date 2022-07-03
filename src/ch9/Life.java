package ch9;

public class Life {
    int size;

    public void setSize(int s) {
        size = s;
        // ‘s’ disappears at the
        // end of this method,
        // but ‘size’ can be used
        // anywhere in the class
    }
}

