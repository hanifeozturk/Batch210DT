package suleymanhoca.tekrar;

import java.util.Scanner;

public class IfElseStatement01 {
    public static void main(String[] args) {
        // kullanicidan password girmesini isteyin
        // password dogru ise " password dogru" yaz
        //yanlis ise " password yanlis tekrar dene " yaz
        // dogru password = Java2020

        Scanner psw=new Scanner(System.in);
        System.out.println("Password giriniz");
        String cevap = psw.next();

         if(cevap.equals("Java2020")){
             System.out.println("Password dogru");

         } else{
             System.out.println("Password yanlis tekrar deneyiniz");
         }
    }
}
