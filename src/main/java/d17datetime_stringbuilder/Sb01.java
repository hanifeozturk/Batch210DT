package d17datetime_stringbuilder;

public class Sb01 {
    public static <StingBuilder> void main(String[] args) {
    /*
    1) "StringBuilder" classi da String ureten bir classtir.
    2) String class kullanarak String üretiriz, Java nicin StringBuilder classi da olusturdu?
    String class "immutable" (degistirilemez) String uretir,
    StringBuilder Class "mutable"(degistirilebilir) String üretir.
    3) "immutable" olmak demek orjinal degerin korunmasi, değistirilemez olmasi demektir
    "mutable" olmak demek orjinal degerin değistirilebilir olmasi demektir
    4) Bu nedenle, metin üzerinde sık sık ekleme, çıkarma veya değişiklik yapmanız gereken durumlarda
    StringBuilder kullanmak, daha verimli ve performanslı bir seçenek olabilir.
    5)StringBuilder, metin verilerini eklemek, çıkarmak, değiştirmek veya döndürmek için çeşitli yöntemler ve işlevler içerir.
    Bunlar arasında append, delete, insert, replace gibi sık kullanılan yöntemler bulunur.
    */
        
        //Immutable - degistirilemez
        
        String s = "Java";
        String t = s + "x";
        String w = t + ",";
        String s1 = "Java";
        
        String  c1 = new String("Ali");
        String c2 = "Ali"; // Ali degeri string pool a eklenir.
        System.out.println(c1);
        System.out.println(c2);
        
        String str1 = "abc";//pool
        String str2 = "abc";//pool
        
        String str3 = new String("abc");
        
        //--------------
        //StringBuilder b = "Ali"; //seklinde object uretemezsin
        StringBuilder sb1 = new  StringBuilder("Python");
        //append() methodu verilen degeri StringBuilder objesine ekler
        System.out.println(sb1);//Python
        sb1.append("!");
        System.out.println(sb1);

        //Odev: Bir String'i degistirdikten sonra tekrar ayni Styring'e yuklerseniz orjinal deger degisir mi?

        String a = "Money";
        a =  a + " More";
        System.out.println(a);
        System.out.println(a);








    }
}
