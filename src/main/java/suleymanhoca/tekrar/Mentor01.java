package suleymanhoca.tekrar;

import java.util.Scanner;

public class Mentor01 {
    public static void main(String[] args) {
        // Mevsim Belirleme:
        //    Kullanıcıdan bir ay girişi alın ve bu ayın hangi mevsime ait olduğunu belirleyin.
        Scanner input = new Scanner(System.in);
        System.out.println("Bir ay giriniz");
        String mevsim = input.nextLine();


            switch (mevsim){
                case "Ocak":
                case "Subat":
                case "Aralik":
                    System.out.println("Kis");
                    break;


                case "Mart":
                case "Nisan":
                case "Mayis":
                    System.out.println("IlkBahar");
                    break;

                case "Haziran":
                case "Temmuz":
                case "Agustos":
                    System.out.println("Yaz");
                    break;

                case "Eylul":
                case "Ekim":
                case "Kasim":
                    System.out.println("SonBahar");
                    break;

                default:
                    System.out.println("Gecerli mevsim giriniz ");



            }


    }
}
