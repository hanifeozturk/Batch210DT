package suleymanhoca.day20arrays;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        // bir arrayin icinde belli bir elemanin var olup olmadigini kontrol edecegiz
        //bineraySearch() methodu bu is icin kullanilir
        //bineraySearch() methodu aranan eleman var olgugunda o elemanin indexini return eder
        //onemli not: binarySearch() methodu kullanmadan oncesort() kullanmak zorundayiz
        //Aksi takdirde binarySearch manali bir sonuc vermez.

        int arr[] = {1, 12, 12, 2, 4, 3};

        // yukarida verilen array de 3 elemani var mi

        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 3));
        System.out.println(Arrays.binarySearch(arr, 12));


    }
}
