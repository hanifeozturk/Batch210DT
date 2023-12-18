package d21oop;

public class HondaRunner {
    public static void main(String[] args) {

        // Honda h = new Honda(); //HATA, abstract bir class'tan object uretemezsiniz
        Civic c = new Civic();
        c.engine(); //Gas 1.6 Eco

        Accord a = new Accord();
        a.engine();

        a.music(); //Pro


    }
}
