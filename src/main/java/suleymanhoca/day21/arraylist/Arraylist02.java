package suleymanhoca.day21.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Arraylist02 {
    public static void main(String[] args) {
        //List olusturun isim list01 olsun

        List<Integer> list01 = new ArrayList<>();
        //bu listin icinde eleman olup olmadigini kontrol edin. isEmpty() methodu kullaniyoruz
        //bos is true degil ise false verir

        System.out.println(list01.isEmpty());
        // bu liste bir eleman ekleyin
        list01.add(123);
        System.out.println(list01);
        System.out.println(list01.isEmpty());

        //List ten eleman silmek icin remove() methodu kullanilir.
        list01.add(124);
        list01.add(125);
        list01.add(124);
        System.out.println(list01);
        list01.remove(1);
        System.out.println(list01);
        //123 u sil
        list01.remove(0);
        System.out.println(list01);
        // List teki son elemani sil
        list01.remove(list01.size()-1);
        System.out.println(list01);

    }
}
