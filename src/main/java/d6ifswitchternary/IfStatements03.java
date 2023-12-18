package d6ifswitchternary;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        /*Ornek 1: Kullanicidan 0'dan kucuk deger giremiyecek sekilde verileri aldiktan sonra;
Eger calisan kadin ise;
60 yasindan buyukse "Emekli Olabilir "yazdirin
Eger calisan erkek ise;
65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz */
        //nested = ic ice gecmis
        Scanner input = new Scanner(System.in);

        System.out.println("Cinsiyetinizi giriniz");
        String gender = input.next(); //next() tek kelime alir

        System.out.println("Yasinizi giriniz");
        int age = input.nextInt();


      if (age<0){
          System.out.println("lutfen 0 dan kucuk yas girmeyiniz");
      } else if (gender.equalsIgnoreCase( "kadin")) {
          if (age>60){
              System.out.println("emekli olabir");
          }else {
              System.out.println("calismali");
          }


      } else if (gender.equalsIgnoreCase("erkek")) {
          if (age>65){
              System.out.println("emekli olabilir");
          }else {
              System.out.println("calismali");
          }

      }else {
          System.out.println("sizin icin farkli bir tanimlama yaoilmadi");

      }
      }

    }

