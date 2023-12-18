package d5incrementifswitch;

import java.util.Scanner;

public class ss {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "Cinsiyetiniz giriniz");
        String gender = input.next(); //net() tek kelime alir

        System.out.println("Yasinizi giriniz");
        int age = input.nextInt();

        String anotherString;
        if(age< 0) {
            System.out.println("Lutfen 0'san kucuk yas girmeyiniz");

        } else if (gender.equalsIgnoreCase( "Kadin")) {
            if(age>60){
                System.out.println("Emekli olabilir");
            }
        } else if (gender.equalsIgnoreCase("Erkek")) {
            if(age>65){
                System.out.println("Emekli olabilir");
            }else{
                System.out.println("Calismali");
            }
        } else {
            System.out.println("Sizin icin farkli bir tanimlama yapilmadi");
        }
    }
}
