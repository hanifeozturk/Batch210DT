package d2variable;

import java.util.Scanner;

public class ornek {


    public static void main(String[] args) {

        //Bir internet sitesinde sifresi 123444 olan bir hesap bulunmaktadir.
        //Kullanicidan kullanici adi ve sifresi aliniz ve karsilastiriniz. Dogru ise ekrana hesabiniz acildi yazin.
        // Yanlis ise Sifre yanlis yazin

        String kullaniciAdi = "Hanife";
        Scanner input = new Scanner(System.in);
        System.out.println("kullanici adinizi giriniz");
        String kullanicininGirdigiAd = input.next();

        int sifre=123444;
        Scanner input1 = new Scanner(System.in);
        System.out.println("kullanici sifresini giriniz");
        int kullanicininGirdigiSifre = input.nextInt();



        if(kullanicininGirdigiAd.equals(kullaniciAdi)&&sifre==kullanicininGirdigiSifre) {
            System.out.println("hesaba giris yaptiniz");
        } else {
            System.out.println("kullanici adi ya da sifre hatali");
        }





    }
}
