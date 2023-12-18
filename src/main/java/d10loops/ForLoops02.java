package d10loops;

public class ForLoops02 {
    public static void main(String[] args) {
        /*Ornek 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        ==> "Tramvay"==> "Tr"
        */

        String s = "Tramvay";

        for (int i = 0; i< s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a'){
                break;
            }
            System.out.println(s.charAt(i));
        }

        /*Ornek 2: Verilen bir String'de kucuk harfleri console'a yazdirmayan kodu yaziniz
        //"Pwd12?Ab" ==> P12?A
        */


        System.out.println("------------");

        String s1 = "Pwd12?Ab";

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (ch >= 'a' && ch <= 'z'){
                continue;
            }else {
                System.out.print(ch); //P12?A
            }
        }
        System.out.println("---------------");
        //ornek 3: Verilen bir String'i tersden yazan kodu yaziniz. Meshur bir interview sorusu
        //           String t = "Ali Can";  ==> "naC ilA"
        //son index her zaman length() - 1

        String t = "Ali Can";
        String ters = ""; //ters cevrilmis yeni datayi burada saklayacagiz

        for (int i = t.length()-1; i >=0 ; i++) {
            ters = ters + t.charAt(i);
            //ters2 = ters2 + s2.substring(i, i+1); da calisir


        System.out.println(ters); //naC ilA

        //ornek 3: Verilen bir String'i tersden yazan kodu yaziniz. Meshur bir interview sorusu
        //           String s2 = “Ali Can”;  ==> "naC ilA"
        //son index her zaman length() - 1

        String s2 = "Java";
        String ters2 = ""; //ters2 cevrilmis yeni datayi burada saklayacagiz

        for (int y = s2.length()-1; y >= 0 ;                                 y--) {
            ters2 = ters2 + s2.charAt(0); //ters2 = ters2 + s2.substring(i, i+1); da calisir
        }
        System.out.println(ters2); //naC ilA
    }



        }











    }

