package suleymanhoca.tekrar;

public class Arrays01 {
    public static void main(String[] args) {
        // integer ile array yaz
        int arr1[] = new int[5];
        System.out.println(arr1);

        arr1[0] = 12;
        arr1[1] = 10;
        arr1[2] = 14;
        arr1[3] = 15;
        arr1[4] = 22;

        System.out.println(arr1[4]);

        for (int i = 0; i < 5 ; i++) {
            System.out.println(arr1[i]);

        }


    }
}
