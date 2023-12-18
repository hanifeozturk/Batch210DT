package d6ifswitchternary;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //Ornek 1:Kullanicinin vermis oldugu gün isimlerine bakarak Hafta Sonu veya Hafta ici olduguna karar veren kodu yaziniz.
        //Pazartesi ==> Hafta ici    Cumartesi ==> Hafta sonu


        Scanner input = new Scanner(System.in);
        System.out.println("Gun ismi giriniz");
        String gunIsmi = input.next();
        if (gunIsmi.equalsIgnoreCase("Cumartesi") || gunIsmi.equalsIgnoreCase("Pazar")){
            System.out.println("Hafta sonu");

        } else if (gunIsmi.equalsIgnoreCase( "Pazartesi") ||
        gunIsmi.equalsIgnoreCase( "Sali") ||
        gunIsmi.equalsIgnoreCase( "Carsamba") ||
        gunIsmi.equalsIgnoreCase( "Persembe") ||
        gunIsmi.equalsIgnoreCase( "cuma")) {
            System.out.println("Haftaici");

        }else {
            System.out.println("Gercerli bir gun giriniz");

        }


    }
}
