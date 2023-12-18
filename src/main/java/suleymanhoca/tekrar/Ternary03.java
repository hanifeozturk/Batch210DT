package suleymanhoca.tekrar;

import java.util.Scanner;

public class Ternary03 {
    public static void main(String[] args) {
       // Kullanicidan iki sayi aliniz
       // kucuk sayiyi ekrana yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi1 = input.nextInt();
        System.out.println("ikinci sayi giriniz");
        int sayi2 = input.nextInt();

        int sonuc= sayi1<sayi2 ? sayi1 : sayi2;
        System.out.println(sonuc);




    }
}
