package d11loops;

public class ForLoops02 {
    public static void main(String[] args) {
      /*
        ornek 1: Asagidaki ciktiyi verecek kodu yaziniz
            Week: 1
              Day: 1
              Day: 2
              Day: 3
              .....
            Week: 2
              Day: 1
              Day: 2
              Day: 3
              ....    */

        /*for (int i = 1; i < 5; i++) {
            System.out.println("Week" + i);

            System.out.println("    Day :1");
            System.out.println("    Day :2");
            System.out.println("    Day :3");
            System.out.println("    Day :4");
            System.out.println("    Day :5");
            System.out.println("    Day :6");
            System.out.println("    Day :7");*/

        for (int i = 1; i < 5; i++) {
            System.out.println("Week" + i);

            for (int j = 1; j < 8; j++) {
                System.out.println("    Day:" + j);
            }
        }
        /* Ornek 2:
        Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz

             X X X X X
             X X X X X
             X X X X X    */

        System.out.println("-----------");

        int satir = 3;
        int sutun = 5;

        for (int i = 1; i <= satir ; i++) {
            for (int j = 1; j <= sutun ; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }

        //Odev : Asagidaki sekli for-loop kullanarak çizdiriniz.
        /*

         *
         * *
         * * *
         * * * *

         */




    }
}

