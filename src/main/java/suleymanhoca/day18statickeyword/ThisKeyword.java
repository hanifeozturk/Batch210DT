package suleymanhoca.day18statickeyword;

public class ThisKeyword {
    int x = 12;
    static int y = 13;

    ThisKeyword(int x){
        this.x = x;

    }

    public static void main(String[] args) {
        ThisKeyword obj1 = new ThisKeyword(15);


    }
}
