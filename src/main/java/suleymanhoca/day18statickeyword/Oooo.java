package suleymanhoca.day18statickeyword;

import java.util.Arrays;
import java.util.Scanner;

public class Oooo {
    public static void main(String[] args) {
        //Kullanicidan bir cumle ve bir kelime isteyin
//kelimenin cumledeki kullanimina bakarak
//asagidaki 3 cumleden uyqun olani yazdirin.
//-"Girilen kelime cumlede kullanilmamis"
//-"Girilen kelime cumlede 1 kere kullanilmis"
//-"Girilen kelime cumlede 1'den fazla kullanilmis"
        Scanner input = new Scanner(System.in);
        System.out.println("bir cumle yaziniz");
        System.out.println("bir kelime yaziniz");

        String cumle = input.nextLine();
        String kelime = input.nextLine();
        int i = 0;
        String[] metin = cumle.split(" ");
        for (String w: metin) {
            if(w.contains(kelime)) {
                i++;
            }
        }

        if(i>1) {
            System.out.println("birden fazla");
        } else if(i==0) {
            System.out.println("hic");
        } else {
            System.out.println("bir defa");
        }

        if (cumle.contains(kelime)){
            System.out.println("girilen kelime cumlede kullanilmistir");
        }else {
            System.out.println("girilen kelime cumlede kullanilmamistir");
        }

    }
}
