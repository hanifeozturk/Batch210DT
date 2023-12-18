package suleymanhoca.day22arraylist;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        ///equals() methodu iki listin birbirineesit olup olmadigini kontrol eder
        // List ler esit ise "true" , degilse " false" return eder

        List<String> list1 = new java.util.ArrayList<>();
        List<String> list2 = new java.util.ArrayList<>();

        System.out.println(list1.equals(list2));

        list1.add("A");
        list2.add("B");
        System.out.println(list1.equals(list2));

        list1.add("B");
        list2.add("A");
        System.out.println(list1.equals(list2));




    }
}
