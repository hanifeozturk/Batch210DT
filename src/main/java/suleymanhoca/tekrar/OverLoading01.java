package suleymanhoca.tekrar;

public class OverLoading01 {
    public static void main(String[] args) {
        /*
        - methodun disinda iki sayinin toplamini ekrana yazdiran bir methot olustur

         */
        toplam(5,10);
        toplam(7);



    }
    public static void toplam (int num1, int num2){
        System.out.println(num1+num2);
    }
    public static void toplam (int num1){
        System.out.println(num1 + num1);
    }
}
