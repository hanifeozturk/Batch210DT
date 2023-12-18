package suleymanhoca.day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public abstract class Arrays01 {
    public static void main(String[] args) {
         /*
    Kullanicidan kac elemanli bir array girmesini isteyin
    Bu array' in tum elemanlarini ekrana yazdir
    bu arrayin ilk elemanini son eleman yapin ve tum elemanlari ekrana yazdir
    mesela; arrar {1,2,3} ise ekrana {2,3,1} seklinde yazdirin
     */
    Scanner input = new Scanner(System.in);
        System.out.println("kac elemanli bir array girmek istersiniz  ");
        int uzunluk = input.nextInt();

       int arr1 [] = new  int[uzunluk];
        System.out.println("arraylarin degerlerini giriniz");


        for (int i = 0; i < uzunluk ; i++) {
            int sayi = input.nextInt();
            arr1[i]=sayi;
        }
            System.out.println(Arrays.toString(arr1));


        int arr2 [] = new  int[uzunluk];
        for (int i = 1; i <uzunluk ; i++) {
            arr2[i-1] = arr1[i];
        }
        arr2[uzunluk-1] = arr1[0];

        System.out.println(Arrays.toString(arr2));






//        for (int i = 0; i < 1; i++) {
//            int i =
//        }







    }

}
