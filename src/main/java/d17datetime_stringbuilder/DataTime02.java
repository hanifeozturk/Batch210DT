package d17datetime_stringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataTime02 {
    public static void main(String[] args) {
    /*DateTime Class ta kullanilan tarih saat formatlari

    HH : mm ==> 24'lu saat sistemi
    hh : mm ==> 12'li saat sistemi AM, PM gösterilmez
    hh : mm a ==> 12'li saat sistemi AM, PM
    HH : mm : ss ==> saniyeyi gosterir
    HH : MM ==> yanlis format cunku MM aylar icin kullanilir
    "mm" "minute" demektir. "MM" "month" demektir.

    dd-MM-yyyy ==> gun - ay - yil
    MMM ==> Aug
    MMMM ==> August  */

        //Anlik zamani nasil aliriz?
        //now(): gecerli saat bilgisi alir

        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);

        //ornek 2:“DateTimeFormatter”, bir Class’tir ve tarih ve saat verilerini belirli bir biçimde görüntülemek,
        // okumak ve işlemek için kullanılan önemli bir araçtır.

        //DateTimeFormatter, tarih ve saat nesnelerini “metin” yani String olarak biçimlendirmenize ve
        // metni tarih ve saat nesnelerine çözmenize olanak tanır.

        //ofPattern() metodu, belirli bir kalıba (pattern) göre tarih ve
        // zaman verilerini biçimlendirmek için kullanılır.
        //format() method’u LocalTime’i String’e istedigimiz formatta cevirir

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm a");

        String formattedTime = dtf1.format(myCurrentTime);
        System.out.println(formattedTime); //12:49 ÖS

        //Ornek 3: Date Object'i formati

        LocalDate myCurrentDate = LocalDate.now();

        //1-Kalibi (pattern) olustur
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

        String formattedDate = dtf2.format(myCurrentDate);
        System.out.println(formattedDate); //09-Kas-2023

        //ornek 4: Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?
        //ZoneId, zaman dilimi veya coğrafi bölge bilgisini temsil eder ve
        // tarih/saat işlemlerinde bu bilginin kullanılmasını sağlar.

        //Tokyo da
        LocalDate dateInTokyo =  LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);

        //Tokyoda saat kac

        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);

        //---------------
        //ornek 5: Tarih ve zamani ayni anda kullanalim.
        //LocalDateTime, tarih ve saatlerle çalışmak için kullanılır.

        LocalDateTime ltd = LocalDateTime.now();
        System.out.println(ltd);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd * MMM * yyyy - hh : mm a");
        String formattedLdt = dtf3.format(ltd);
        System.out.println(formattedLdt);





    }
}
