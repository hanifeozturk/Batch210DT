package suleymanhoca.tekrar;

public class Arrays03 {
    public static void main(String[] args) {
     // elemanlari 1 2 3 4 5 olan bir integer array olustur
     // bu arrayda 3 elemanin olup olmadihgibi kontrol et
     // varsa uc var yazdir
     //yoksa uc yok yazdir



        /* 1.yol

        int arr[] = new int[5];

        arr[0]= 1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        */

        int arr[]={1,2,3,4,5};

        int count = 0;

        for(int i=0; i<5 ; i++){
            if(arr[i]==3){
               count++;
            }
        }
        if (count>0) {
            System.out.println(count + " tane 3 var");
        }else {
            System.out.println("3yok");
        }



    }
}
