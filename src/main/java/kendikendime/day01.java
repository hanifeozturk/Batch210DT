package kendikendime;

import java.util.Scanner;

public class day01 {
    public static void main(String[] args) {
       /* int x = 12;
        int y = 15;
        x*=2;
        y/=3;
        x++;
        y--;
        System.out.println(x + y);*/

         /*System.out.println(2 + 3 = 5); //fa
        System.out.println(2+3 >= 5);//tr
         System.out.println(2+3 <= 5);//t
        System.out.println(2+4 != 5);//t
        */

        /*Scanner scan = new Scanner(System.in);
        System.out.println("cinsiyetinizi giriniz");
        String cinsiyet = scan.next();
        System.out.println("yasinizi giriniz");
        int yas = scan.nextInt();
        if(cinsiyet.equals("Erkek")) {
            if(yas<18) {
                System.out.println("Elma");
            }else {
                System.out.println("Armut");
            }
        }else if(cinsiyet.equals("Kadin")) {
            if(yas<18) {
                System.out.println("Portakal");
            }else {
                System.out.println("Erik");
            }
        }else {
            System.out.println("Domates");
        }*/

      /* Scanner scan = new Scanner(System.in);
        System.out.println("Enter an inteğer");
        int a = scan.nextInt();

        if(a%2==0) {
            if(a%3==0) {
                System.out.println("Woooow!");
            }else {
                System.out.println("Hmmmm!");
            }
        }else{
            if(a%3==0) {
                System.out.println("Normal!");
            }else {
                System.out.println("Yazik!");
            }
        }*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter password");
        String password = scan.nextLine();
        char initial = password.charAt(0);
        if(initial>='A' && initial<='Z') {
            if(initial=='A') {
                System.out.println("Gecerli");
            }else {
                System.out.println("Gecersiz");
            }
        }else if(initial>='a' && initial<='z') {
            if(initial=='z') {
                System.out.println("Gecerli");
            }else {
                System.out.println("Gecersiz");
            }
        }else {
            System.out.println("Bu ne?");
        }



    }
}
