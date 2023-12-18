package d5incrementifswitch;

import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {
      //Ornek 1: Kullanicidan gun sayisini aldiginizda gun ismini yazan kodu yaziniz
        // 1==> Pazar, 2 ==> Pazartesi …
/*Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num = input.nextInt();

        if (num>0){
            System.out.println(num + "sifirdan buyuktur");

        } else if (num<0) {
            System.out.println(num+ "sifirdan kucuktur");

        } else {
            System.out.println(num + " = sifirdir ");*/
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu yaziniz?");
        int num = input.nextInt();

        if (num<=0) {
            System.out.println("lutfen kacinci gun oldugunu 0 ile 7 sayilar arsinda yaziniz");
        } else if (num==1){
            System.out.println("pazar");

        } else if (num==2){
            System.out.println("pazartesi");

        }else if (num==3){
            System.out.println("sali");

        }else if (num==4){
            System.out.println("carsamba");

        }else if (num==5){
            System.out.println("persembe");

        }else if (num==6){
            System.out.println("cuma");

        }else  if (num==7) {
            System.out.println("cumartesi");
        }else {
            System.out.println("tesekkurler");

        }
        }


    }

