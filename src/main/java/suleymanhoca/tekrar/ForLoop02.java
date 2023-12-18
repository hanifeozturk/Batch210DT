package suleymanhoca.tekrar;

public class ForLoop02 {
    public static void main(String[] args) {
        for (int i = 3; i < 100; i=i+3) {
            System.out.print(i+" ");

        }
        System.out.println("---------------");

        int sum = 0;
        for (int i = 0; i < 6; i++) {
           sum = sum + i;

        }
        System.out.println("Toplam : " + sum);
        System.out.println("---------------");
        
        int sum1 = 0;
        for (int i = 11; i <14 ; i++) {
            sum1 = sum1+i;
        }
        System.out.println("tplam = "+ sum1);
        System.out.println("---------------");

        int sum3 = 0;

        for (int i = 21; i < 26; i++) {
            sum3 = sum3 + i;
        }
        System.out.println("Toplam = " + sum3);
        System.out.println("---------------");

        int sum4 = 0;
        for (int i = 1; i <51 ; i++) {
            sum4 = sum4+i;
        }
        System.out.println(sum4);
        System.out.println("---------------");

        int sum5 = 0;
        for (int i = 5; i <100 ; i=i+5) {
            sum5 = sum5+i;
        }
        System.out.println(sum5);

    }
}
