package suleymanhoca.tekrar;

import java.util.Scanner;

public class Wrapper02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adinizi soyadinizi giriniz");

        String ad= input.next();
        String soyad = input.next();

        System.out.println("adiniz : " + ad);
        System.out.println("soyadiniz : " + soyad);
    }
}
