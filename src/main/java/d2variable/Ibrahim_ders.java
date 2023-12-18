package d2variable;

import java.util.Scanner;

public class Ibrahim_ders {


    public static void main(String[] args) {

         //variable icin bize int string double bazen char genellikle yeterli oluyor
        int sayi = 542455552;
        long uzunsayi = 5;
        String metin = "5ezzerd5gggh?dfgdgdfg4444  fdgfd  fdgfdg lerlertg lertler   ";
        char harf = 'd';
        String harf2 = "d";
        float sayi2 = 2.1f;
     //   float
        boolean deger = false;
        boolean deger2 = true;


        int kapisifresi = 1234;
        Scanner input = new Scanner(System.in);
        System.out.println("kapi sifresini giriniz");
        int kullaniciningirdigikod = input.nextInt();



        if(kapisifresi==kullaniciningirdigikod) {
            System.out.println("kapi acik");
        } else {
            System.out.println("sifre yanlis");
        }








    }


}
