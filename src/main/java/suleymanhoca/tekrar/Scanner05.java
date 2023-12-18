package suleymanhoca.tekrar;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen dairenin yaricapini giriniz");

        float yariCap= input.nextFloat();
        double pi=3.14159;

        System.out.println("Dairenin cevresi = "+ pi*yariCap*yariCap);
        System.out.println("Dairenin cevresi = "+ 2*pi*yariCap);
        }


    }

