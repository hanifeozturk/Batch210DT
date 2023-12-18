package suleymanhoca.day21.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {
    public static void main(String[] args) {
       // ["A", "C", "B","C"] listini olusturun
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("C");
        list.add("B");
        list.add("C");
        System.out.println(list);

        //list'de eleman olarak B var mi
        System.out.println(list.contains("B")); //// eger B eleman olarak varsa true yokse false verir

        //list'de eleman olarak Z var mi
        System.out.println(list.contains("Z"));

        // list teki elemanlari alfabetik siraya gore sirala
        //Collections==> bir araya getirilmis parcalardir
        // bir list teki elemanlari alfabetik siraya (natural order ) dizmek icin
        //Collections.sort() methodu kullanilir ; argument olarak list'in adini koyariz.
        Collections.sort(list);
        System.out.println(list);

    }
}
