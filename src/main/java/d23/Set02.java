package d23;

import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {
        //interview sorusu
        //ornek 1: Ogrenci email adreslerini natural order'da siralanmis olarak depolayiniz

        //Mail'ler unique(benzersiz). O yuzden set kullanacagiz, natural order dedigi icin de TreeSet kullanacagiz
        //System.nanoTime(); methodu genellikle performans olcumu icin kullanilir

        long t1 = System.nanoTime();

        //1. yol - yavas - her elemanda siralama yapar
        TreeSet<String> emails = new TreeSet<>();
        emails.add("k@gmail.com");
        emails.add("a@gmail.com");
        emails.add("z@gmail.com");
        emails.add("l@gmail.com");
        emails.add("u@gmail.com");
        emails.add("p@gmail.com");
        emails.add("g@gmail.com");
        emails.add("b@gmail.com");
        emails.add("t@gmail.com");
        emails.add("x@gmail.com");
        System.out.println(emails);

        long t2 = System.nanoTime();

        //TreeSet'ler cok yavas, biraz hizlandirabilir miyiz?
        // elemanlari eklerken en hizli olandan (HashSet) yardim alalim

        //2.yol - Tavsiye edilir - daha hizli

        HashSet<String> emailsHs = new HashSet<>();
        emailsHs.add("k@gmail.com");
        emailsHs.add("a@gmail.com");
        emailsHs.add("z@gmail.com");
        emailsHs.add("l@gmail.com");
        emailsHs.add("u@gmail.com");
        emailsHs.add("p@gmail.com");
        emailsHs.add("g@gmail.com");
        emailsHs.add("b@gmail.com");
        emailsHs.add("t@gmail.com");
        emailsHs.add("x@gmail.com");
        System.out.println(emailsHs);
//[b@gmail.com, k@gmail.com, g@gmail.com, t@gmail.com, x@gmail.com, p@gmail.com, z@gmail.com,
// u@gmail.com, a@gmail.com, l@gmail.com]

        //Bos bir TreeSet olusturalim
        TreeSet<String> emailHsTs = new TreeSet<>(emailsHs);
        System.out.println(emailHsTs);

        long t3 = System.nanoTime();

        System.out.println(t2-t1);
        System.out.println(t3-t2);



    }
}
