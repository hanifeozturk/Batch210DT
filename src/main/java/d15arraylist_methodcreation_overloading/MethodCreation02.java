package d15arraylist_methodcreation_overloading;

public class MethodCreation02 {
    public static void main(String[] args) {
        //--------ornek 1 calistirma
        int sonuc1 = carpma(3, 5);
        System.out.println("sonuc1 = " + sonuc1); //sonuc1 = 15
    }
    //ornek 1: Iki sayiyi carpan bir method olusturunuz
     protected static int carpma (int a, int b){
         //protected, bu class'tan erisilebilir
         //bir de sadece miras alinan class'lardan erisilebilir
         return a * b;

     }
    //ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method olusturunuz
    private static int carpTopla(int a, int b, int c) {
        //private, sadece bu class'tan erisilebilir

        return a * b + c;
    }
    //ornek 3: Girilen bir kelimeyi konsola yazdiran bir method olusturunuz





    }
