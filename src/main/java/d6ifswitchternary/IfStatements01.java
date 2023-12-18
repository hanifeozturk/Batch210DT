package d6ifswitchternary;

import java.util.Scanner;

public class IfStatements01 {


    public static void main(String[] args) {




        /*Ornek 1: Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki
        tabloya gore yazdiran kodu olusturunuz

        0-4 (dahil) ==> bebek
        5-12 (dahil)==> cocuk
        13-20 (dahil) ==> genc
        21-30 (dahil) ==> yetiskin
        30 ustu ==> Tanimlanmamis

        Tanimlanmamis Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz*/
        Scanner input = new Scanner(System.in);
        System.out.println("Kuallanici adi giriniz ");
        int age = input.nextInt();

        if (age < 0) {
            System.out.println("Gecerli bir yas giriniz");
        } else if (age < 5) { //age>= 0 && age<=4 yazabilirdim
            System.out.println("Bebek");
        } else if (age < 13) {
            System.out.println("Cocuk");
        } else if (age <= 20) {
            System.out.println("Genc");
        } else if (age < 31) {
            System.out.println("Yetiskin");
        } else {
            System.out.println("Tanimlanmamis yas");
        }

    }


}


