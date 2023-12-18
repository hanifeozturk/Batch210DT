package suleymanhoca.tekrar;

public class Array02 {
    public static void main(String[] args) {
        // 4 elemanli char bir array olustur ve elemanlar yerlestir
        //tum elemanlari for dongusu ile

        char arr1[] = new char[4];

        arr1[0] = 'H';
        arr1[1] = 'L';
        arr1[2] = 'e';
        arr1[3] = 'n';

        for (int i = 0; i < 4; i++) {
            System.out.println(arr1[i]);

        }
        System.out.println(arr1.length);
        System.out.println(arr1[arr1.length-1]);



    }
}
