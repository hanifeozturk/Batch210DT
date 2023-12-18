package suleymanhoca.tekrar;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
      //  Kullanicidan alinan sayinin kupunu hesaplayan bir program yaz

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");

        int sayi = input.nextInt();

        System.out.println("Sayinin kupu = " + sayi*sayi*sayi);

    }
}
