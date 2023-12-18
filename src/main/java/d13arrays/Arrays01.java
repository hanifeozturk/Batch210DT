package d13arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Ornek 1: int turunde ages isminde bir Array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //      bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        int[] ages = new int[6];
        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 19;
        ages[3] = 44;
        ages[4] = 15;
        ages[5] = 32;

        //sort() methodu sayilari kucukten buyuge siralar (ascending order)
        //String data tiplerini alfabetik siralar (alphabetical order)
        //ascending order + alphabetical order = natural order
        //sort() methodu Array elemanlarini natural order’a gore siralar

        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));//[15, 19, 20, 23, 32, 44]
        int kucuk = ages[0];
        int uzunluk = ages.length-1;
        int buyuk = ages[uzunluk];

        int total = buyuk + kucuk;
        System.out.println(total);

        // 2.yol

        int minimum = ages[0];

        for (int w : ages){
            minimum = Math.min(minimum, w);
        }
        System.out.println(minimum);
        //System.out.println(maksimum); //44
        //System.out.println(minimum + maksimum); //59

        int maximum = 0;

        for (int a : ages) {
            maximum = Math.max(maximum,a);
        }
        System.out.println(maximum);





    }
}
