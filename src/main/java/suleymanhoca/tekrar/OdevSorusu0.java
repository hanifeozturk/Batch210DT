package suleymanhoca.tekrar;

import java.util.Locale;
import java.util.Scanner;

public class OdevSorusu0 {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Yasadiginiz ulkenin ismini giriniz");
        String ulke = scan.nextLine();

        ulke.charAt(1);
        ulke.charAt(ulke.length()-2);
        System.out.println(ulke.toUpperCase().charAt(1));
        System.out.println(ulke.toUpperCase().charAt(ulke.length()-2));*/

        /*
        System.out.println("------------------");

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Baslangic degerlerini giriniz");
        int num1 = scan1.nextInt();
        System.out.println("Bitis degerlerini giriniz");
        int num2 = scan1.nextInt();

        if(num1>num2){
            System.out.println("Baslangic degeri bitis degerinden kucuk olmalidir");
        }else {
            for (int i = num1; i <= num2; i=i+1) {
                if(i%3==0){
                    System.out.println(i);
                }*/
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Baslangic Harflerini giriniz");
        char ch1 = scan1.next().toUpperCase().charAt(0);
        System.out.println("Bitis Harflerini giriniz");
        char ch2 = scan1.next().toUpperCase().charAt(0);

        System.out.println(ch1+ "-"+ch2);

        if(ch1>ch2) {
            System.out.println("Alfabetik siraya gore giriniz");
            }else {
            for (char i = ch1; i <=ch2 ; i++) {
                System.out.println(i + " ");
            }

        }






    }
}
