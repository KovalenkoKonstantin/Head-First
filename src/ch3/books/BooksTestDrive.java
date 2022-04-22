package ch3.books;

class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].title = "The Grapes of Java";//first position
        myBooks[1].title = "The Java Gatsby";//second position
        myBooks[2].title = "The Java Cookbook";//third position
        myBooks[0].author = "bob";//first
        myBooks[1].author = "sue";//second
        myBooks[2].author = "ian";//third


        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x ++;
        }
    }
}

