package suleymanhoca.day15;

import java.util.Scanner;

public class MethodCreation03 {


    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Yapacaginiz islem icin bir sembol seciniz *, +, - , :");
        String sembol = input.next();
        System.out.println("iki sayi giriniz");
        double sayi1= input.nextDouble();
        double sayi2 = input.nextDouble();

        hesapMakinasi(sembol,sayi1,sayi2);

    }
    public static void hesapMakinasi (String sembol,double sayi1, double sayi2){
        switch (sembol){
            case "+":
                System.out.println(sayi1+sayi2);
                break;
            case "-":
                System.out.println(sayi1-sayi2);
                break;
            case "*":
                System.out.println(sayi1*sayi2);
                break;
            case ":":
                System.out.println(sayi1/sayi2);
                break;
            default:
                System.out.println("lutfen dogru islem isaretini giriniz");
        }

    }



    }

