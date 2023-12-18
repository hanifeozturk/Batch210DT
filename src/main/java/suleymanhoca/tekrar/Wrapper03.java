package suleymanhoca.tekrar;

import java.util.Scanner;

public class Wrapper03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adinizi soyadinizi giriniz");
        String adSoyad = input.nextLine();
        System.out.println("adiniz Soyadiniz: "+adSoyad);

        System.out.println("Lutfen adresinizi giriniz");
        String adres=input.nextLine();
        System.out.println("Adres: "+ adres);

        System.out.println("Lutfen yasinizi giriniz");
        int yas= input.nextInt();
        System.out.println("Yasiniz: "+ yas);

        System.out.println("Turkiye'de yasiyorum dogru veya yanlis yazalim ");
        boolean blTr = input.nextBoolean();
        System.out.println("Turkiyede yasiyorsunuz"+blTr);

    }
}
