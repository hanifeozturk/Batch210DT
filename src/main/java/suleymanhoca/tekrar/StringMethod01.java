package suleymanhoca.tekrar;

public class StringMethod01 {
    public static void main(String[] args) {
    // indexOf methodu stringin icindeki karakterinyerini belirlemek icin kullanilir

    String  str1 = "Javva World";

        System.out.println(str1.indexOf('v')); // Ekrana 2 yazdirir cunku indekx sayimi 0 ' dan baslar.
        System.out.println(str1.indexOf('W'));
        System.out.println(str1.indexOf('w'));
        System.out.println(str1.indexOf('a'));

        System.out.println(str1.indexOf('a',2));

        System.out.println("---------------");

        System.out.println(str1.indexOf('v',2));
        System.out.println(str1.indexOf('v',3));

        System.out.println(str1.indexOf('a',1));

        System.out.println(str1.indexOf('a',5));

        System.out.println("-----------------");
        // "Alamanya" Stringini ikinci a karakterinin indeksini bulunuz.

        String str2 = "Alamanya";

        System.out.println(str2.indexOf('a'));

        int idx = str2.indexOf('a');

        System.out.println(str2.indexOf('a', idx+1));

        System.out.println(str2.indexOf('A'));

        System.out.println("-------------");

        String str3 = "Missisippi";

        str3.indexOf("is");
        System.out.println(str3.indexOf("is"));








    }
}
