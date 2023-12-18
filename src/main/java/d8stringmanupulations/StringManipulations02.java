package d8stringmanupulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {
    /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

    i)En az 8 karakter olsun
    ii)Space karakteri password'de olmasin
    iii)En az bir tane buyuk harf olsun
    iv)En az bir tane kucuk harf olsun
    v)En az bir tane rakam olsun */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String pwd = input.nextLine();

        //i)En az 8 karakter olsun
       boolean lengthControl = pwd.length()>7;
      //  System.out.println("karakter sayisi control" + lengthControl);

       // ii)Space karakteri password'de olmasin

        boolean spaceControl = pwd.replaceAll("[^ ]","").length()==0;
       // System.out.println("Space control" + spaceControl);
        // iii)En az bir tane buyuk harf olsun

        boolean upperCaseControl = pwd.replaceAll("[^A-Z]","").length()>0;
      //  System.out.println("upperCaseControl = " + upperCaseControl);


        // iv)En az bir tane kucuk harf olsun

        boolean lowerCaseControl = pwd.replaceAll("[^a-z]","").length()>0;
       // System.out.println("lowerCaseControl = " + lowerCaseControl);

        //v)En az bir tane rakam olsun

        boolean rakamCaseControl = pwd.replace("[^0-9]","").length()>0;
       // System.out.println("rakam kontrol =" + rakamCaseControl);

        // vi) En az bir sembol icermeli ODEV
        boolean sembolCaseControl = pwd.replaceAll("[a-zA-Z0-9]", "").length() > 0; // En az bir sembol içeriyor mu?
        System.out.println(sembolCaseControl);

        boolean isValid = lengthControl && spaceControl && upperCaseControl && lowerCaseControl && rakamCaseControl && sembolCaseControl;

        if (isValid){
            System.out.println("sifre gecerli");
        } else {
            System.out.println("sifre gecersiz");
        }










    }
}
