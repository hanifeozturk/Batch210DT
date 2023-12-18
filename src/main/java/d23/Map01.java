package d23;

import java.util.HashMap;

public class Map01 {
    public static void main(String[] args) {
        //Map'ler sozluk gibidir. Aciklamalidir. orn: Ali = 13;
        //Sol taraf yani key'ler tekrarsizdir. Value tarafi tekrarli olabilir
        //key tarafi icin set kullanilir. Value tarafi icinse List, data sayisindan eminsekte Array kullanabiliriz
        //Map'in elemanlarina komple "entry set - giris elemani" denir

        //Map nasil olusturulur?

        ////1) HashMap: Key-value çiftlerini rastgele bir sırayla depolayan bir Map türüdür.En hizlisidir.

        HashMap<String, Integer> myMap= new HashMap<>();
        myMap.put("Ali Can", 13);


    }
}
