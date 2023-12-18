package suleymanhoca.tekrar;

import java.util.Scanner;

public class Ternary04 {
    public static void main(String[] args) {
        // kullanicidan bir sayi al
        //sayi 0 dan buyuk esitse 10 dan kucuk olup oladigini kontrol ediniz
        // 10 dan kucuk ise " rakam' yazdir degilse "pozitif" yazdir
        //sayi 0dan kucukse ekrana negatif yazdir

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayi giriniz");
        double num = input.nextDouble();

        Object result = (num >=0) ? (num<10 ? "Rakam" : "Pozitif") :  "Negatif";
        System.out.println("result" + result);



    }

}
