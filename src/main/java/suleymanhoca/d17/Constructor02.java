package suleymanhoca.d17;

public class Constructor02 {
    public static void main(String[] args) {
        Constructor01 obj1 = new Constructor01();
        obj1.buyume(33);
        obj1.isimDegistir("Kemal Can");
        System.out.println(obj1.isim);
        System.out.println(obj1.yas);

        //bir variable static olarak olusturulmussa object olusturlmadan vlass ismiyle kullanarak ulasilabilir
        System.out.println(Constroctor03.ad);
        System.out.println();


    }
}
