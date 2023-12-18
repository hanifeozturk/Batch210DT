package d3datatypesconcatenationscanner;

public class Variables02 {
    public static void main(String[] args){
        /*
        Non-primitive Data Types
        Not 1: Uretilen her bir class ayni zamanda bir Non-primitive Data Types'dir.
        Not 2: Non-primitive Data Types'larin isimleri buyuk harf ile baslar.
        Not 3: Non-primitive'ler icin Java meory'de buyuklugune gore degisen boyutlarda yer ayirir
         */
        //String Data Tipi (Class): Cumleler, kelimler, semboller, rakamlar icerebilir

        //Ornek 1: Ogrenci ismi icin bir variable olusturup deger olarak Ali Can atayiniz.

        String ogrenciAdi = "Ali Can";
        int age =7;
        /*
        Soru: primitive ve non-primitive data type'lari arasindaki farklar nelerdir?
         */

        // ornek: sehir ismii icin bi variable olustur ve once Ankara sonra Izmir degerlerini ata

        String cityName = "Ankara";
        System.out.println(cityName);

        cityName = "Izmir";
        System.out.println( cityName);

    }
}
