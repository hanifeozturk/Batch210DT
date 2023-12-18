package suleymanhoca.tekrar;

public class Constractor03  {
    String isim = "Ali Can";
    int yas = 33;
    int kilo = 85;
    String meslek = "Automation Tester";
    boolean emekli = false;

    Constractor03(){
        this.emekli = emekli;
        this.isim = isim;
        this.kilo = kilo;
        this.meslek = meslek;
        this.yas = yas;

    }
    Constractor03(String isim, int yas){
        this.emekli = emekli;
        this.isim = isim;
        this.kilo = kilo;
        this.meslek = meslek;
        this.yas = yas;

    }

    Constractor03(String isim){
        this.isim = isim;
    }


    public static void main(String[] args) {

        Constractor03 insan01 = new Constractor03();
        System.out.println(insan01.isim);

        Constractor03 insan02 = new Constractor03("Ayhan Yildiz",56);
        System.out.println(insan02.isim + insan02.yas);

        Constractor03 insan03 = new Constractor03("Ayse Yildiz");
        System.out.println(insan03.isim);


     }
}
