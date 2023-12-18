package d2variable;


public class Variables01 {
    public static void main(String[] args){
        //Java bu satiri okumaz
        /*
        Java Strongly type'dir, bu nedenle Java'daki her degisken (variable) belirli veri turu (data type) ile iliskilendirilecektir.
         */
        String selam="Hello World..";
        System.out.println(selam);

        System.out.println("--------------");

        //ornek 2: tamsayi(int) data tipina ismi age ola bir variable olustur ve icine 15 yukle yazdir.

        int age=25;
        System.out.println(age);

        System.out.println("-----------");

        /*
        Not1: primitive data type'larini Java olusturmustur
        Not2: primitive data type'larinin isimlerinfe sadece kucuk harf kullanilir
        Not3: primitive data typle'larina gore memory'de farkli farkli yer kaplar
         */

        byte ogrenciYasi=15;
        System.out.println(ogrenciYasi);

        System.out.println("-----------");


        // ornek: sitemizin nufusu icin bir variable olusturun ve deger atayin

        short siteNufusu=30000;
        System.out.println(siteNufusu);

        //siteNufusu.sout kisa yol kisaltmasi

        System.out.println("-----------");

        // ornek:

        int ulkeNufusu=80321654;
        System.out.println("Ulke Nufusu : "+ ulkeNufusu);

        // iki tane int variable olustur ve toplamlarini bir etiketle yazdir.

        int a=12,b=13;
        System.out.println("Toplam: " +(a+b));
        System.out.println(a+b);
        System.out.println(ulkeNufusu + siteNufusu);

        System.out.println("ulkeNufusu = " + ulkeNufusu);


    }
}
