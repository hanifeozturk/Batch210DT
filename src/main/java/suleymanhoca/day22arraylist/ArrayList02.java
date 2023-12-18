package suleymanhoca.day22arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        //toArray() methodu List'i array'e cevirmek icin kullanilir

        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Can");
        System.out.println(list);

        //1. yontem: toArray() methodu'nun icinde parametre olarak new String[0] kullaniriz
        String arr[] = list.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));

        //2. yontem: olusturdugumuz array'in data type'ini objevt olarak secin
        Object[] arr1 = list.toArray();
        System.out.println(arr1);

        //asList() methodu array'leri liste cevirmek icin kullanilir.
        //asList methodu parametre olarak array'in ismini kabul eder
        String arr2[] = {"Aliye", "Canan"};

        //Array'den list'e cevirme yaptiginizda , elde ettiginiz list uzunluk olarak
        //esnek degildir. Yani arrayden olusturdugunuz list'e ekleme ve cikarma yapamazsiniz
        List<String> list1 = Arrays.asList(arr2);
        System.out.println(list1);

        list1.add("Emine");// exception cunku ekleme yapamayiz
        System.out.println(list1);

        list.remove("ALiye"); // exception cunku remove yapamayiz
        System.out.println(list1);

    }
}
