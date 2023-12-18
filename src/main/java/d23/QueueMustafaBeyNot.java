package d23;

public class QueueMustafaBeyNot {
    /*

    Collections (koleksiyonlar), Object'leri depolamak ve işlemek için kullanılan bir class'lar ve interface'ler
    kümesidir.

    Collection'lar non-Primitive data tipleri ile kullanilir, Yani referansi olan data turleri ile
    primitive data turleri is referansa sahip degildir. Kendisi bir degerdir.

LIST
 A-> ArrayList
     ArrayList<String> list1 = new ArrayList<>(); ->Olusturma
     List<Character> b = new ArrayList<>(); ->olusturma
     List<Integer> num = Arrays.asList(12, 23, 10, 19); ->Olusturma(remove(), add() gibi methodlari kullanamazsiniz)
     add(25) -> Ekleme
     size() ->Boyutunu verir
     ages.add(1, 18) -> Index belirterek ekleme
     ages.addAll(newAges) ->Baska bir ArrayList'i tumuyle ekleme
     indexOf()->Istenilen elemanin index'ini verir
     get(3)->Verilen index'deki elemani verir
     set(2, 5)->Verilen index'deki elemani verilen deger ile degistirir
     Collections.sort(num) ->Collection ile sort etmek
     num.sort(null); ->List methodu ile sort etmek (dogal siralama icin null gecilmesi gerekir)
     System.out.println(ages); ->Yazdirma

 B-> LinkedList
     Her eleman, bir önceki ve bir sonraki elemanı işaret eden (pointer) bağlantılara sahiptir.
     Bu nedenle, ekleme ve silme işlemleri hızlıdır, ancak elemanlara erişim, başka bir elemandan
     başlayarak ilerlemeyi gerektirir. Yani ArrayList'e gore erisim yavastir.

     LinkedList<String> myList = new LinkedList<>();
     myList.add("Ali") ->Ekleme
     myList.add(1, "Zeynep") ->Belirtilen konuma eleman ekleme
     myList.addFirst("Hasan") -> Listenin basina oge ekler
     myList.addLast("Huseyin") ->Listenin sonuna bir öğe ekler.
     myList.remove("Ali") ->Belirtilen öğeyi listeden kaldırır ve boolean dondurur
     myList.removeFirstOccurrence("Yusuf") ->Belirtilen eleman bastan arar, ilkini siler
     myList.removeLastOccurrence("Yusuf") ->Belirtilen elemani sondan arar, ilkini siler
     myList.peek() ->Ilk elemana erisir ama silmez. Yoksa null doner
     myList.element() ->ilk elemani alir ama silmez, eleman yoksa execption verir
     myList.poll() ->Ilk elemanı alır ve kaldirir,eleman yoksa null doner
     myList.pop() ->ilk elemanını alır ve koleksiyondan kaldırır. Yoksa exeption verir
     System.out.println(myList); ->Yazdirma


QUEUE((FIFO-first in first out) ilk giren ilk cikar)
    Elemanların kuyruğun sonuna eklenip başından çıkarılması şeklinde gerçekleşir. Queue, sıralı işlemler
    veya veriler gerektiğinde kullanışlıdır.
    Queue interface'i, LinkedList(hem de List Interface'ini kullanabilir) ve PriorityQueue gibi farklı class'lar
    tarafından uygulanabilir. (Semaya bakiniz)


    Queue<String> depo = new LinkedList<>() ->Olusturma
    depo.add("sut") ->Eklenan eleman var olanlarin sonuna eklenir
    remove(): Kuyruğun başındaki öğeyi kuyruktan kaldırır ve döndürür. Kuyruk boşsa bir exeptcion fırlatır.
    poll(): Kuyruğun başındaki öğeyi kuyruktan kaldırır ve döndürür. Kuyruk boşsa null döner.
    peek(): Kuyruğun başındaki öğeyi döndürür, kuyruk boşsa null döner.
    element(): Kuyruğun başındaki öğeyi döndürür,silmez ancak kuyruk boşsa bir istisna fırlatır.
    clear() Kuyruğun içindeki tüm öğeleri kaldırır, böylece kuyruk boş bir duruma gelir.


  A->PriorityQueue(oncelik kuyrugu)
    FIFO (first in first out) yapısı ile nesneleri öncelik sırasına göre sıralayan bir kuyruk (Queue) aracıdır.
    Yani, en yüksek önceliğe sahip olan nesne, her zaman ilk olarak çıkar. Onceligin nasil belirlendigini Lambda
    dersinde gorecegiz. Mesela farkli siralarda farkli oncelikli hastalar hastaneye geliyor. Basi agriyanlara
    farkli kaza gecirenlere farkli oncelik vermesi gerekir. Lambda dersinde gorecegiz.

    PriorityQueue<String> acilSirasi = new PriorityQueue<>() ->Olusturma
    add() -> belirtilen ogeyi kuyruga ekler
    System.out.println(acilSirasi) ->Yazdirma


  B->Deque
    (Double-Ended Queue), hem başından hem de sonundan eleman eklemeye ve çıkartmaya izin veren bir veri yapısıdır.
    Deque, FIFO (first in first out) veya LIFO (last in first out) olarak sıralanabilir.

    Deque<String> d = new LinkedList<>()
    d.add("Mehmet") ->Constructor LinkedList oldugu icin insert sirasina gore siralar
    d.addFirst("Ali") ->Sadece ekler, donus yapmaz
    d.addLast("Hasan") ->Sona ekler, donus yapmaz
    d.removeFirst() ->Ilk elemani kaldirir ve doner


    ArrayDeque<String> ad = new ArrayDeque<>();
    ad.addFirst("ilk") ->Basa eleman ekleme
    ad.addLast("son")  ->Sona eleman ekleme
    ad.removeFirst()   ->Ilk elemani siler ve doner
    ad.removeLast()    ->Son elemani siler ve doner


SET(UNIQ-BENZERSIZ)
 A->HashSet(Uniq+Karisik)
    HashSet<String> hs = new HashSet<>() ->Olusturma
    HashSet<String> hs2 = new HashSet<>(Arrays.asList("Rukiye", "Muhammed")) ->Eleman ekleme farkli yol
    Set<String> hs3 = Set.of("Ayse", "Ali", "Can") ->Bu sekilde olusturulursa degistirilemez
    hs.add("Sinan") ->Ekleme-> Tekrarli ekleme hata vermez, uzerine yazar
    hs.add(null) ->null'i eleman kabul eder
    System.out.println(hs) ->Yazdirma

  B->LinkedHashSet(Uniq+Insertion Order)
     LinkedHashSet<Integer> lhs = new LinkedHashSet();
     lhs.add(14) ->Eleman ekleme
     lhs.add(null) ->null ekleyebiliriz
     lhs.retainAll(ls) -> Iki farkli LinkedHashSet icinde ortak elemanlari bulur,method'u uygulanana atar.
     System.out.println(lhs) ->Yazdirma

 C->TreeSet(Uniq+Naturel Order )
    TreeSet<Character> ts = new TreeSet<>();
    ts.add('G'); ->Eleman ekleme
    ts.add('A');
    ts.add('Z');
    ts.add('R');
    ts.add('U');
    ts.add(null) ->null koyamazsiniz
    System.out.println(ts); //[A, G, R, U, Z] - natural order (A-Z, sayilarda kucukten buyuge)

    subset() belirli bir aralıktaki elemanları içeren yeni bir küme oluşturmak için kullanılır.
    subSet() methodu, belirtilen aralıkta bulunan elemanlardan oluşan bir sorted set alt kümesi oluşturur.
    Bu nedenle, subSet() yöntemini kullanmak için,SortedSet türünden bir değişken oluşturmanız gerekir.

    Belirttigimiz iki degerin ASCII degerleri arasinda kalan elemanlari doner
    SortedSet<Character> ss = ts.subSet('G', 'U'); //ilk dahil, ikincisi haric.
    ts.subSet('B','H'); de [G] verirdi

    Not:TreeSet icerisine her eleman ekleyisimizde naturel order yapmaya calisacagi icin yavas kalacaktir.
        Bunun yerine HashSet olusturup elemanlari buraya ekleriz. Sonra da bu HashSet'i LinkedSet'e ekleriz.
        Bu sekilde tek bir sefer naturel ordar yapmakla zaman kaybedecektir
        HashSet insert order, TreeSet naturel order oldugu icin

        ornek:
        HashSet<String> emailsHs = new HashSet<>();
        emailsHs.add("k@gmail.com");
        emailsHs.add("a@gmail.com");
        emailsHs.add("z@gmail.com");

        TreeSet<String> emailHsTs = new TreeSet<>(emailsHs);

}
     */
}
