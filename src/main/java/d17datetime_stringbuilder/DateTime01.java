package d17datetime_stringbuilder;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        //Date Data Tipi (Class)
        //ornek 1: now(): Geçerli tarihi alır.Tarih bilgisini yerel bilgisayarınızın saatinden alır,
        // yani sizin bilgisayarınızın saatinden gelir

        LocalDate myDate = LocalDate.now(); //now() statik bir methoddur.
        System.out.println(myDate); //2023-11-09

        //ornek 2 : getMonthValue(): Tarihin ayını (1-12 arasında) alır.
        //Java’da Month veri türü, bir enum (enumeration) türüdür (numaralandırma türüdür).
        //Degisme ihtimali olmayan datalari depolamak icin kullanilir.Haftanin gun isimleri, Ay isimleri gibi

        System.out.println(myDate.getMonthValue());
        Month  ay = myDate.getMonth();
        System.out.println(ay);

        System.out.println(myDate.getYear());
        System.out.println(myDate.getDayOfYear());
        System.out.println(myDate.getDayOfMonth());
        System.out.println(myDate.getDayOfWeek());

        //ornek 4:getDayOfMonth(): Ayin gününü alır.
        //ileriki tarihe nasil gidilir?

        int gun = myDate.getDayOfMonth();
        System.out.println(gun); //9

        DayOfWeek gun2 = myDate.getDayOfWeek();
        System.out.println(gun2); //THURSDAY, getDayOfWeek ENUM yapisidir

        //ornek 5:
        //plusDays(): Belirtilen gün sayısını tarihe ekler ve yeni bir LocalDate döndürür.
        //plusMonths(): Belirtilen ay sayısını tarihe ekler ve yeni bir LocalDate döndürür.
        //plusYears(): Belirtilen yil sayısını tarihe ekler ve yeni bir LocalDate döndürür.
        // Bu methodlar, orijinalleri değiştirmez, yeni bir gun,ay ve tarih nesnesi oluşturur.

        LocalDate newDate = myDate.plusYears(1).plusMonths(2).plusDays(4);
        System.out.println(newDate);


        /*ornek6
        minusYears(): Bir LocalDate veya LocalDateTime nesnesinden belirtilen yıl sayısını çıkarır.
        minusMonths() : Bir LocalDate veya LocalDateTime nesnesinden belirtilen ay sayısını çıkarır.
        minusDays() : Bir LocalDate veya LocalDateTime nesnesinden belirtilen gün sayısını çıkarır.
        Sonuç olarak, çıkarma işleminden sonra elde edilen tarihi döndürürler.*/


        System.out.println(myDate.minusYears(1).minusMonths(3).minusDays(1));

        //ornek 7: Specifik bir tarih objesi nasil olusturulur?
        //of(int year, int month, int dayOfMonth): Belirtilen yıl, ay ve günle bir LocalDate örneği oluşturur.

        LocalDate date1 = LocalDate.of(1980,8,3);
        LocalDate date2 = LocalDate.of(2010,5,4);
        System.out.println("date 1 =" + date1 + ", date 2 =" + date2);

        //isAfter(): Bir tarihin başka bir tarihten sonra olup olmadığını kontrol eder.boolean verir
        //isBefore(): Bir tarihin başka bir tarihten once olup olmadığını kontrol eder.boolean verir

        Boolean sonrami = date1.isAfter(date2);
        System.out.println(sonrami);

        Boolean oncemi = date1.isBefore(date2);
        System.out.println(oncemi);

        //ornek 8: Kullanicidan aldiginiz tarih gecmise ait ise “Gecersiz tarih girdiniz” mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise “Zamani girebilirsiniz” deyiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen verilen sirada tarih giriniz. yil-ay-gun");

        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        //Kullanicidan alinan verilerle bir tarih olusturalim

        LocalDate girilenTarih = LocalDate.of(year,month,day);

        if (girilenTarih.isBefore(LocalDate.now())){ //girilen tarih su andan once mi?
            System.out.println("Gecersiz tarih girdiniz");
        }else {
            System.out.println("Zamani girebilirsiniz");
        }

        //ornek 9: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.

        System.out.println("Lutfen verile sirada tarih bilgisini giriniz. yil-ay-gun");

        int y = input.nextInt();
        int m = input.nextInt();
        int g = input.nextInt();

        LocalDate date = LocalDate.of(y,m,g);
        System.out.println(date.getDayOfWeek());









    }
}
