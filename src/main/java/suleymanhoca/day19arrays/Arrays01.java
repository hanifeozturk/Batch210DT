package suleymanhoca.day19arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Integer Array olusturalim
        int arr1[] = new int[5];

        System.out.println(arr1); // Array in referansini verir
        System.out.println(arr1[0]); // Arratyin indexi 0 olanelemani ekrana yazdirir
        System.out.println(arr1[3]);

        arr1[0] = 12;
        System.out.println(arr1[0]);

        arr1[4] = 22;
        System.out.println(arr1[4]);

        arr1[1] = 3;
        arr1[2] = 85;
        arr1[3] = 852;

        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);

        System.out.println("---------------");

        //Array'deki elemanlari ekrana yazdirmak icin for dongusu ile yazdir

        for (int i = 0; i < (5); i++) {
            System.out.println(arr1[i]);

        }



    }
}
