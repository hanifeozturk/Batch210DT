package d9stringloops;

public class ForLoops01 {
    public static void main(String[] args) {
    /*loop - dongu demektir
    Donguler tekrar eden kodlama islerini kolaylastirmak icin kullanilir

    Java da;

    1-for loop
    2-while loop
    3-do while loop
    4-for each (Collection'larda)

    */
        //1-for loop
        //for dongusu, temel olarak bir kod blogunu belirli sayida ve ust uste calistirmak icin kullanilir
        //yineleme - iteration



        // Or1: consola 4 kere "Hi!" yazdir

        // 1. yol tavsiye edilmez

        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");

        //2. yol

        for (int i = 1       ;      i < 5          ;      i++){ //i<=4, i++ ile i = i + 1 aynidir
            System.out.println("Hi!...");
        }

        //----------------

        //ornek 2: 20 (dahil) den 3 e kadaar tum tamsayilari console'a yazdir
        for (int i = 20; i > 2; i--){
            System.out.println(i);
        }

        //or 3: 3'den 20ye kadar tum cift sayilari yazdir 3-20 dahil

        System.out.println("--------------");

        for (int i = 3; i < 21; i++) {

            if (i % 2 == 0) { //i % 2 == 0 ile cift sayilari sectik
                System.out.println(i);
            }

        }


















    }
}
