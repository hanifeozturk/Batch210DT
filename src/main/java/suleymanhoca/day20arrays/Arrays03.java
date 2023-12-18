package suleymanhoca.day20arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        // iki arrays olustur bu arraylaerin birbirine esit olup olmagigini kontrol et
        //not: iki arrayin esit olabilmesi:
        //      1) Elemanlari ayni olmali
        //      2) Esit elemanlarin indeksleri de esit olmali
        //      {1, 2, 3} ve {1, 2, 3} esittir. Ama {1, 2, 3} ile {1, 3, 2} esit degildir

        int arr1 [] = {1, 2, 3};
        int arr2 [] = {1, 2, 3};
        System.out.println(arr1 == arr2);// false ci+unku referanslarini kontrol eder. farkli iki object oldugundan adresleri farklidir

        System.out.println(Arrays.equals(arr1, arr2)); // true cunku arrays.equals methodu sadece degerleri ve indeksleri kontrol eder adreslere bakmaz



    }
}
