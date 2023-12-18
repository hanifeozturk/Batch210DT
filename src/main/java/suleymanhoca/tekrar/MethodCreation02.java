package suleymanhoca.tekrar;

import java.util.Scanner;

public class MethodCreation02 {
    public static void main(String[] args) {
         // Saati saniyeye ceviren, mili kilometreye, kilogrami grama ceviren
        //bir method  yaz
        // bu methodu main methodun disinda olusturup
        //main methodun icinden cagirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Birimi giriniz");
        String  birim = scan.nextLine().toUpperCase();
        System.out.println("Miktari giriniz");
        double miktar = scan.nextDouble();
        donusturucu(birim,miktar);

        scan.close();
    }

    public static void donusturucu(String birim, double miktar) {
        switch (birim ) {
            case "saat":
                System.out.println(miktar*60*60);
                break;
            case "mil":
                System.out.println(miktar*1.6);
                break;
            case "kilogram":
                System.out.println(miktar*1000);
                break;
            default:
                System.out.println("saat, mil ve kilogram disinda bir birim girmeyiniz");
            }
    }
}
