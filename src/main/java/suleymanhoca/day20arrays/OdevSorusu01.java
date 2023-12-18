package suleymanhoca.day20arrays;

public class OdevSorusu01 {
    public static void main(String[] args) {
       /*
    Bir array'de herhangi iki elemanin ayni olup olmadigini
    kontrol eden bir program yaz. ayni elaman varsa "ayni elemen var" yaz
    yokse "ayni elaman yok yaz
     */

        int arr[] = {1, 2, 3, 4, 3};

        int count = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
        }
        if (count>0){
            System.out.println("Ayni eleman var");
        }else{
            System.out.println("Ayni eleman yok");
        }
    }}
