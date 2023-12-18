package suleymanhoca.tekrar;

import java.util.Scanner;

public class Wrapper01 {
    public static void main(String[] args) {
        //kullanicidan ad soyad alip ekrana yazdiran program yaz

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen adinizi soyadinizi giriniz");

        String ad = input.next();
        String soyad = input.nextLine();

        System.out.println("adiniz soyadiniz: "+ ad+" "+soyad);

    }
}
