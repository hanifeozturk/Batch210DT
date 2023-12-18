package suleymanhoca.tekrar;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen dikdorgenin iki kenarinin boyutlarini yaziniz.");

        int kenar1 = input.nextInt();
        int kenar2 = input.nextInt();

        System.out.println("Dikdortgenin alani = "+ kenar1*kenar2);
        System.out.println("Dikdortgenin Cevresi = "+ 2* (kenar1+kenar2));

    }
}
