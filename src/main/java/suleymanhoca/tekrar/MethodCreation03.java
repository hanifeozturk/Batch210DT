package suleymanhoca.tekrar;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodCreation03 {
    public static void main(String[] args) {
        //Basit hesap makinasi
        // kullanicidan yapacagi islemi islem sembolu ile secmesini sagla
        // kullanicidan iki sayi girmesini iste
        //girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdiralim

        Scanner scan = new Scanner(System.in);
        System.out.println("+,-,*,: islemlerinden birini secinis");
        char islem = scan.next().charAt(0);
        System.out.println("islem yapmak icin iki sayi giriniz");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        hesapMakinasi(islem,num1,num2);

    }
    public static void hesapMakinasi (char islem, double num1, double num2) {
        switch (islem){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case ':':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("lutfen sadece +,-,*,: islemlerinden birini seciniz");
        }

    }


}
