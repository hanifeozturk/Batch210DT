package d24maps_exceptions;

import java.util.*;

public class Maps01 {
    public static void main(String[] args) {
        //Map'ler sozluk gibidir. Aciklamalidir. orn: Ali = 13;
        //Sol taraf yani key'ler tekrarsizdir. Value tarafi tekrarli olabilir
        //key tarafi icin set kullanilir. Value tarafi icinse List, data sayisindan eminsekte Array kullanabiliriz
        //Map'in elemanlarina komple "entry set - giris elemani" denir

        //Map nasil olusturulur?

        //1) HashMap: Key-value çiftlerini rastgele bir sırayla depolayan bir Map türüdür.En hizlisidir.
        //Map'lerde add calismaz cunku add eleman ekler, ben ise "entry set" ekleyecegim
        //Onun icin "out" kullanilabilir

        HashMap<String, Integer> myMap= new HashMap<>();
        myMap.put("Ali Can", 13);
        myMap.put("Veli Han", 18);
        myMap.put("Ayse Kaya", 15);
        myMap.put("Fatma Yilmaz", 19);

        System.out.println(myMap); //{Fatma Yilmaz=19, Ali Can=13, Veli Han=18, Ayse Kaya=15}

        //Sadece 'key' degerlerini nasil alabiliriz?
        Set<String> keyTarafi = myMap.keySet();
        System.out.println(keyTarafi); //[Fatma Yilmaz, Ali Can, Veli Han, Ayse Kaya]

        //----------------------------------

        //Sadece ‘value’ degerlerini nasil alabiliriz?
        //Bunun icin keySet() methodu kullanilir

        Collection<Integer> valueTarafi = myMap.values();
        System.out.println(valueTarafi); //[19, 25, 18, 15]

        //--------------------------------------------
        //get(): Bir key’e karşılık gelen değeri döndürür.key verirsiniz value’sunu getirir

        Integer yas = myMap.get("Ali Can");
        System.out.println(yas); //25

        //-------------------------------------------
        //Ornek 1: myMap’deki kisilerin yaslarinin ortalamasi nedir?

        int toplam = 0;

        Collection<Integer> yaslar = myMap.values();
        System.out.println(yaslar);

        for (Integer w : yaslar) {
            toplam = toplam + w;
        }
        System.out.println(toplam / yaslar.size());

        System.out.println("------------------------");
        //entrySet() metodu, HashMap’in tüm degerlerini içeren bir Set döndürür.
        // Dongu gibi ayri satirlarda yazdirir.Cunku Loop’lar direkt Map’ler ile kullanilamaz.
        //Bu yuzden ozel method gelistirilmis. Set’in icinde Map yapisi saklanir.

        Set<Map.Entry<String, Integer>> myEntrySet = myMap.entrySet();
        System.out.println(myEntrySet);

        for (Map.Entry<String, Integer> w : myEntrySet){  //Map.Entry<String, Integer> data type'dir
            System.out.println(w); //Map.Entry<String, Integer> yerine object yazabiliriz
        }
        //Fatma Yilmaz=19
        //Ali Can=25
        //Veli Han=18
        //Ayse Kaya=15

        System.out.println("------------------------");
        //Ornek 2:  Verilen Map'deki kisi isimlerinin character sayisi ile yaslarinin, toplamini bulunuz.

        //Java'da Map.Entry kullanarak bir Set üzerinde loop yapabilir ve
        // hem anahtarları (getKey()) hem de değerleri (getValue()) elde edebilirsiniz.

        HashMap<String,Integer> kisiler = new HashMap<>();
        kisiler.put("Ali", 3);
        kisiler.put("Can", 5);
        kisiler.put("Ayse", 2);

        int sum = 0;

        Set<Map.Entry<String, Integer>> mySet = kisiler.entrySet();
        System.out.println(mySet); //[Can=5, Ayse=2, Ali=3]

        for (Map.Entry<String, Integer> w : mySet){
            sum = sum + w.getKey().length() + w.getValue();
        }
        System.out.println(sum); //20


    }
}
