package suleymanhoca.day19arrays;

public class Arrays03 {
    public static void main(String[] args) {
        // Elemanlari 1,2,3,4,5 olan bir integer array olusturun
        //Bu arrayde 3 elemaninin olup olmadigini kontrol et,
        //varsa ekrana yazdir "3 var"
        //yoksa "3 yoktur" yazdir
        //kac tane uc oldugunu da yazdirin

      /*  int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        */

       int arr[] = {1, 2, 3, 4, 3};

       int count =0; // flag denir

        for (int i = 0; i < 5; i++) {
        if(arr[i]==3){
            count++;
        }}

        if (count>0){
            System.out.println(count + " tane 3 var");
        }else {
            System.out.println("3 yok");
        }




        }
}
