package suleymanhoca.tekrar;

public class IfStatement03 {
    public static void main(String[] args) {
        // bir char variable olustur ve bir buyuk harf deger ata
        // eger atanan deger, haftanin gunlerindenherhangi ibirinin ilk harfi ise o gunleri yazdir
        // eger atanan deger, haftanin gunlerindenherhangi birinin ilk harfi  degil ise
        //" boyle bir gun yok yazdir

        char ilkHarf= 'L';

        if(ilkHarf == 'P'){
            System.out.println("Pazartesi, Pazar, Persembe");
        }
        if(ilkHarf == 'S'){
            System.out.println("Sali");
        }
        if(ilkHarf == 'C'){
            System.out.println("Carsamba, Cuma, Cumartesi");
        }
        /*if(ilkHarf!= 'P'){
            System.out.println("boyle bir gun yok");
        }
        if(ilkHarf!= 'C'){
            System.out.println("boyle bir gun yok");
        }
        if(ilkHarf!= 'S'){
            System.out.println("boyle bir gun yok");
        }*/
        if(ilkHarf!= 'P'|| ilkHarf!='S'|| ilkHarf!='C'){
            System.out.println("boyle bir gun yok");
        }



    }
}
