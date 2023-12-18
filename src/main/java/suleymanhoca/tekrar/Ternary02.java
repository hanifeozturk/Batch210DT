package suleymanhoca.tekrar;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {
        //Kullanicidan iki sayi al
        //bu sayilar esit ise toplamlari eksana yazdir
        //bu sayilar birbirinden farkli ise carpimlari ekrana yazdir
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double num1=input.nextDouble();


        System.out.println("Lutfen ikinci sayi giriniz");
        double num2=input.nextDouble();
        double sonuc = num1==num2 ? num1+num2 : num1*num2;
        System.out.println(sonuc);







    }
}
