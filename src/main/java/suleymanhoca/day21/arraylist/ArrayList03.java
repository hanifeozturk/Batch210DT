package suleymanhoca.day21.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        //["Ali", "Can", "Ayse", "Ali"] listini olusturun

        List<String> list01 = new ArrayList<>();
        System.out.println(list01);
        list01.add("Ali");
        list01.add("Can");
        list01.add("Ayse");
        list01.add("Ali");
        System.out.println(list01);

        list01.remove("Ali");
        System.out.println(list01);

        list01.remove("Kemal");
        System.out.println(list01);//remove methodu listede olmayanlar icin hata vermez.

        System.out.println(list01.remove("Ali"));

        System.out.println(list01.remove(0));
        System.out.println(list01); //[Ayse]

        //Ayse elemanini "Guzel Ayse"  yapalim. set() methodu kullanin
        System.out.println(list01.set(0,"Guzel Ayse")); // degismeyen onceki halini yazar, yani ayse
        System.out.println(list01);

        // List'e "Kenan" ve "Zeynep" ekleyin
        list01.add("Kenan");
        list01.add("Zeynep");
        System.out.println(list01);
        list01.clear();
        System.out.println(list01);

    }
}
