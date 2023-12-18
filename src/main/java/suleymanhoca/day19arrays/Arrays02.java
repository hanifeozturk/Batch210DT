package suleymanhoca.day19arrays;

public class Arrays02<arr> {
    public static void main(String[] args) {
        //4 elemanli char bir array olustur, bu arraylere eleman yerlestirin
        //tum arrayleri for dongusuyle yaz

        char arr1[] = new char[4];

        arr1[0] = 'A';
        System.out.println(arr1[0]);
        arr1[1] = 'H';
        arr1[2] = 'L';
        arr1[3] = 'K';

        for (int i = 0; i < 4; i++) {
            System.out.println(arr1[i]);

        }
        System.out.println(arr1[arr1.length-1]);

    }



}
