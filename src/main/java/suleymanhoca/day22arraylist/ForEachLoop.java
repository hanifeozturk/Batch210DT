package suleymanhoca.day22arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {
        //For each loop for loopun ust versiyonudur.
        // Diger adi "Enhanced (zenginlestirilmis) for loop"

        int arr[] = {12, 21, 13, 43};

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

        //for each loop kullanarak elemanlari ekrana yazdir
        for(int w : arr) {
            System.out.println(w);
        }
        //String iceren bir Array olusturun
        // elemanlarini arada bosluk birakarak for each loop ile ekrana yazdir .

        String arr1[] = {"Hello", "World"};
        System.out.println(Arrays.toString(arr1));

        for (String w : arr1){
            System.out.print(w+" ");
        }

        //Integer elemanlari iceren bir list olusturun. for each loop kullanarak
        // bu elemanlarin toplamini ekrana yazdir

        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(21);
        list.add(33);
        list.add(23);
        System.out.println(list);

        int sum=0;

        for ( int w : list){
            sum = sum + w;
        }
        System.out.println(sum);






    }

}
