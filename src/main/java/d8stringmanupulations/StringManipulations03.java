package d8stringmanupulations;

public class StringManipulations03 {
    public static void main(String[] args) {
        //Ornek 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv = “$456.99”;  String laptop = “$875.99"; ==> 456.99 + 875.99 = 1332.98
        String tv = "$456.99";
        String laptop = "$875.99";

        tv = tv.replace("$", "");
        laptop = laptop.replace("$","");

        Double totalPrice = Double.valueOf(tv) + Double.valueOf(laptop);

        System.out.println(totalPrice); //1332.98

        //-------------------------------------------
        //Ornek 2: Kullanici isminin ilk harflerini alip buyuterek console’a yazdiriniz.
        //      ”  ali cAN  ” ==> AC

        //trim() methodu, bir String'deki bastaki ve sondaki bosluklari siler.Aradakileri silmez
        //split(), String'i istediginiz karakterden parcalamaya yarar.

        String name = "   ali     cAN   ";

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);

        char last = name.trim().toUpperCase().split("\\s+")[1].charAt(0);
        System.out.println(last);

        System.out.println("" + first + last);

        //Ornek 3: Bir String’in belirli bir karakterinden baslayarak belirli bir karaktere kadar tum
        // karakterleri dynamic olarak aliniz //abc@gmail.com ===> gmail

        //1.yol : Hard Code, tavsiye edilmez
        String a = "abc@gmail.com";

        System.out.println(a.substring(4,9)); //gmail

        //2.yol : Dinamik
        //split() methodunun icinde '.' kullandiginizda onune \\ koyunuz

        //abc@gmail.com

        String company1 = a.split("@")[1].split("\\.")[0];
        System.out.println(company1); //gmail

        //3.yol : Dinamik

        //indexOf() metodu spesifik bir karakterin ilk gorunumunun index'ini verir

        int startingIndex = a.indexOf("@") + 1;
        //System.out.println(startingIndex); //3
        int endingIndex = a.indexOf(".");
        //System.out.println(endingIndex); //9

        String companyName = a.substring(startingIndex, endingIndex);
        System.out.println(companyName); //gmail








    }
}
