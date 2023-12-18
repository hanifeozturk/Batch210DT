package suleymanhoca.tekrar;

import java.util.Scanner;

public class InterviewSorusu01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yer degistirmek icin iki sayi yaziniz");

        double sayi3= input.nextDouble();
        double sayi4= input.nextDouble();

        sayi3 = sayi3 + sayi4;
        sayi4 = sayi3 - sayi4;
        sayi3 = sayi3 - sayi4;
        System.out.println("yer degistirilmis sayilar"+ sayi3 +" " + sayi4);

    }
}
