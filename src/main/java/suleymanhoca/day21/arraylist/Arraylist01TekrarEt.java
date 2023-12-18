package suleymanhoca.day21.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Arraylist01TekrarEt {
    public static void main(String[] args) {
         //Arraylerde length sabittir degistirilemez
        //ArrayList (List) lerde length esnektir. sie eleman ekledikce List length ini arttirir
        //siz eleman sildikce List length ini azaltir.

        int arr[] = {1, 2 , 3};

        List<String> list01 = new ArrayList<>();
        System.out.println(list01);//[]

        //Liste eleman eklemek icin add() methodu kullanilir
        list01.add("Ali");
        System.out.println(list01);

        list01.add("Can");
        System.out.println(list01);

        // Veli yi Ali ve Can in arasina koycam
        list01.add(1,"Veli");
        System.out.println(list01);

        //[Han, Ali, Kemal, Veli, Can, Ayse) list01 i bu hale getirin
        list01.add(0,"Han");
        list01.add(2,"Kemal");
        list01.add(5,"Ayse");
        System.out.println(list01);

        //List01' in eleman sayisi ekrana yazdir

        System.out.println(list01.size());


    }
}
