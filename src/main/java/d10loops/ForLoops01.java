package d10loops;

public class ForLoops01 {  public static void main(String[] args) {
    //Ornek 1: 3'den 20'ye kadar tum cift sayilari console'a yazdiriniz(20 dahil)

    for (int i = 3; i < 21; i++) {
        if (i % 2 == 0) {
            System.out.println(i);
        }
    }

}
}
