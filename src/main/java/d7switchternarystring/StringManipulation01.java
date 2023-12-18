package d7switchternarystring;

public class StringManipulation01 {
    public static void main(String[] args) {
    //Ornek 1: “s” String’inde kullanilan karakter sayisini bulunuz.

        String s = "Java is easy";
        int slenght = s.length();

       //System.out.println(slenght);//12

        //----------------

        ////Ornek 2: “s” String’inde ilk ve son indexteki karakterleri aliniz.

        // charAt() methodu

        char firstChar = s.charAt(0);
        System.out.println(firstChar);
        char lastChar = s.charAt(11);
        System.out.println(lastChar);

        char lastChar2 = s.charAt(s.length()-1);
        System.out.println(lastChar2);

        // //Ornek 3: "s" String'indeki ilk 4 karakteri aliniz.
        ////substring(int beginIndex, int endIndex) methodu belirtilen index aralaigini dondurur
        ////substring(0,4) ==> 0 yani ilk index dahil, 4 yani ikinci index harictir.

        String sub1 = s.substring(4);
        System.out.println(sub1);

        // orn4: "s" stringineki is kalimesini aliniz

        String sub2 = s.substring(5,7);
        System.out.println(sub2);// is

        // orn5: s String'indeki "easy" kelimesini al

        String sub3 = s.substring(8,12);
        System.out.println(sub3);


        ////Ornek 6: “s” String’inde easy kelimesinin var olup olmadigini kontrol ediniz.
        ////contains() method’u herhangi bir karakterin veya karakterlerin String’de var olup olmadigini kontrol eder.
        ////contains() methodu true veya false return eder. boolean

        boolean isExit = s.contains("easy");
        System.out.println(isExit);


        //Ornek 7: "s" String'inin belli bir harfle baslayip baslamadigini kontrol ediniz.
        //startsWith() methodu bir Strig'in ilk karakterini/karakterlerini kontrol eder
        //startsWith() methodu boolean return eder.

        boolean isStart = s.startsWith("J");
        System.out.println(isStart); // true

        //Ornek 8: “s” String’inin “easy” ile bitip bitmedigini kontrol ediniz.
        //endsWith() methodu bir Strig’in son karakterini/karakterlerini kontrol eder
        //endsWith() methodu boolean return eder.

        boolean isEnd= s.endsWith("easy");
        System.out.println(isEnd);


//




    }
}
