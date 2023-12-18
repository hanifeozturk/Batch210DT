package suleymanhoca.tekrar;

import java.util.Scanner;

public class StringMethod2 {
    public static void main(String[] args) {
         String str1 = "cimbombom";
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));

        System.out.println(str1.length());

        System.out.println("-------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Isminizi yaziniz");
        String isim = input.nextLine();

        int lenght = isim.length();

        System.out.println(isim.charAt(lenght-1));

        String str5="karakartal";
        System.out.println(str5.contains("kar"));
    }
}
