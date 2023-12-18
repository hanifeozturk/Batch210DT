package suleymanhoca.tekrar;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // kullanici iki tamsayi versin, program bu sayilarin toplamini ve carpmasini ekrana yazdirsin

        Scanner input=new Scanner(System.in);
        System.out.println();
        System.out.println("iki tam sayi yaziniz");

        int sayi1 =input.nextInt();
        int sayi2 = input.nextInt();

        System.out.println(sayi1 + sayi2);
        System.out.println(sayi1*sayi2);

        //karenin bir kenar uzunlugunu giriniz
        //karenin cevresini ve alanini yazdir

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen karenin bir kenar uzunlugunu yaziniz");

        int sayi = scan.nextInt();

        System.out.println("Karenin cevresi" + 4*sayi);
        System.out.println("KArenin alani" + sayi*sayi);

    }

}
