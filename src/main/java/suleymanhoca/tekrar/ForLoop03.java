package suleymanhoca.tekrar;

public class ForLoop03 {
    public static void main(String[] args) {
     int product = 1;
        for (int i = 1; i < 5; i++) {
            product = product*i;
        }
        System.out.println(product);
        System.out.println("---------------");
        
        int product1 = 1;
        for (int i = 2; i < 13; i=i+2) {
            product1 = product1 * i;
        }
        System.out.println(product1);
        System.out.println("---------------");

        int product2 = 1;
        for (int i= 6; i > 0 ; i--) {
            product2 = product2 * i;
        }
        System.out.println(product2);

    }
}
