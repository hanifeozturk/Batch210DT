package d3datatypesconcatenationscanner;

public class Variables01 {

    private double atletFiyati2;

    public static void main(String[] args) {
        //4- long data type
        //Tam sayilar icindir. Hafizada 8 byte yer kaplar.

        int kisa = 274554665;
        long uzun = 2745546455256556555L;

        long hucreSayisi=123456789515555L;
        System.out.println(hucreSayisi);
        System.out.println(hucreSayisi);

        long sayi1=4567894563336551456L,  sayi2=8966512354423337L;

        System.out.println(" Sayilar toplami = "+sayi1+sayi2);



        // float data type: hafizasa 4 byte yer kaplar
        //Decimal - ondalikli sayilar icin kullanilir
        //Ozellikle fiyat degerleri icin kullanilir.

        //Not: Java ondalikli sayilari otomatik olarak double kabul eder.
        //float olmasinda israr ediyorsaniz sonunda F yada f koymali

        //iki tane float data tipinde variable olustur ve bunlarin tolamini yazdir

        float corapFiyati=585.88f , atletFiyati=856.1f;
        System.out.println("Toplam fiyat : "+ (corapFiyati+atletFiyati));

        //-------------2.yol
        float corapFiyati1 = 15.9f;
        float atletFiyati2 = 3.85f;

        System.out.println("Toplam fiyat : " + (corapFiyati1+atletFiyati2));

        //6- double data type hassas hesaplar

        double hucreAgirligi=0.000000000025;
        System.out.println(hucreAgirligi);

        //7- char data type
        //tek karakter icin kullanilir
        //tek tirnak icinde yazilir'

        //Or: char data typine gore ismin ilk harfi olan bir var. olustur ve yazdir

        char hanife='H';
        System.out.println('H');
        System.out.println(hanife);

        //8- Boolean data type
        // sadece true ya da false olmak uzere

        // Or: boolean data type emekli misin sorusu icin bir degisken olustur ve false atayin

        boolean isReal = true;
        System.out.println(isReal);
        System.out.println("-----------");
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = false;
        boolean b4 = false;

        System.out.println(b1&&b2);
        System.out.println(b2||b3);
        System.out.println(b2&&b4);
        System.out.println(b3||b4);


        System.out.println("-----------");


        // System.out.println(); System.out.print(); farki
        // System.out.println(); ekrana yazdiri yeni satira gecer
        //System.out.print(); ekrana yazdiri yeni satira gecmez

        System.out.print("Merhaba");
        System.out.print(" Dunya");

        System.out.println("Merhaba");
        System.out.println("Dunya");

    }


}
