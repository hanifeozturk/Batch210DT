package suleymanhoca.day20arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
      //bir arrayin elemanlarini kucukten buyuge gir ve ekrana iki durumu da yazdiriniz

        int arr[] = {5, 8, 9, 1, 4};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

       //Charlardan olusan bir string olustur ve ascennding order yapiniz

       char arr1[] = { 'e', 'h', 'd', 'q', 'Z'};
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        // String'lerden olusan bir array olusturun ve ascending order yapiniz

        String arrStr[] = {"Ali","ahmet", "Ahmet", "Can", "Beyza","65","12"};
        System.out.println(Arrays.toString(arrStr));

        Arrays.sort(arrStr);
        System.out.println(Arrays.toString(arrStr));







    }
}
