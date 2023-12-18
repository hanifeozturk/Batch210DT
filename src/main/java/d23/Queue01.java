package d23;

import java.util.*;

public class Queue01 {
    public static void main(String[] args) {
      /* Java'da Queue, verilerin belirli bir düzen içinde saklandığı ve işlendiği bir veri yapısıdır.
       Ilk giren ilk çıkar (FIFO-first in first out) prensibine dayanır, yani ilk eklenen obje ilk çıkarılır.
       Queue, sıralı işlemler ve verilerin işlenmesi için kullanılır. Araya eleman eklemek mümkün değildir.

       İşte gerçek dünyadan birkaç örnek:
       Sıra Kuyruğu (Queue): Sıra bekleyenlerin önünde olan kişi önce hizmet alır. Bir örnek olarak,
       bir fast-food restoranındaki siparişlerin işlenmesini düşünebilirsiniz.
       İlk gelen sipariş, ilk hazırlanan ve teslim edilen sipariştir.
       Bilet Sırası: Bir konser veya etkinlik için bilet almak isteyen kişiler sıraya girerler.
       Biletler, sırayla satılır ve ilk gelen kişi ilk biletini alır.
       Çağrı Sırası: Müşteri hizmetleri çağrı merkezindeki müşteriler, sırayla operatörlere bağlanır.
       İlk çağrı bekleyeni önce konuşur, ardından sıradaki çağrı alınır.
       Dosya İşleme: Bilgisayar işletim sistemleri ve uygulamalar, dosyaları sırayla işlerler.
       Bir dosya işlem tamamlandığında, sıradaki dosya işlenir.

       Kuyruğun çalışma mantığı, elemanların kuyruğun sonuna eklenip başından çıkarılması şeklinde gerçekleşir.
       Queue, sıralı işlemler veya veriler gerektiğinde kullanışlıdır.

       Queue interface'i, LinkedList ve PriorityQueue gibi farklı sınıflar tarafından uygulanabilir. */

        //Queue nasil olusturulur?
        Queue<String> depo = new LinkedList<>();

        //Queue'ya eleman nasil eklenir?
        depo.add("sut");
        depo.add("et");
        depo.add("yumurta");
        depo.add("peynir");

        //2) remove(): Kuyruğun başındaki öğeyi kuyruktan kaldırır ve döndürür.
        // Kuyruk boşsa bir istisna fırlatır.
        String s = depo.remove();
        System.out.println(s); //sut
        System.out.println(depo); //[et, yumurta, peynir]

        //3)peek(): Kuyruğun başındaki öğeyi döndürür, kuyruk boşsa null döner.
        System.out.println(depo.peek()); //et
        System.out.println(depo); //[et, yumurta, peynir]


        //4)clear() metodu, kuyruğun içindeki tüm öğeleri kaldırır, böylece kuyruk boş bir duruma gelir.
        depo.clear();
        System.out.println(depo); //[]

        //5)poll(): Kuyruğun başındaki öğeyi kuyruktan kaldırır ve döndürür. Kuyruk boşsa null döner.
        System.out.println(depo.poll()); //null

        //6)element(): Kuyruğun başındaki öğeyi döndürür, ancak kuyruk boşsa bir istisna fırlatır.
        //System.out.println(depo.element()); HATA cunku queue bos

        //-------------------------
        // PriorityQueue (oncelik kuyrugu), bir FIFO (first in first out) yapısı ile nesneleri
        // öncelik sırasına göre sıralayan bir kuyruk (Queue) aracıdır.
        // Yani, en yüksek önceliğe sahip olan nesne, her zaman ilk olarak çıkar.


        //Örneğin, sayıları içeren bir PriorityQueue kullanıyorsanız,
        // sayılar kendi doğal sıralamalarına göre önceliklendirilir.

        //Gerçek hayattan bir örnek olarak, bir hastanedeki hastaların acil servise giriş sırası
        // priorityQueue olarak temsil edilebilir. Hastalar, aciliyet derecelerine göre sıralanır.
        // Aciliyeti en yüksek olan hasta, her zaman ilk olarak tedavi edilir.

        //PriorityQueue nasil olusturulur?
        PriorityQueue<String> acilSirasi = new PriorityQueue<>();

        //PriorityQueue'ya eleman nasil eklenir?
        //add(), belirtilen ogeyi kuyruga ekler
        //comparator

        acilSirasi.add("Mehmet");
        acilSirasi.add("Mahmut");
        acilSirasi.add("Ekrem");
        acilSirasi.add("Oya");
        acilSirasi.add("Tansu");

        System.out.println(acilSirasi); //[Ekrem, Mehmet, Mahmut, Oya, Tansu] - karisik

        //-------------------------
        //Deque (Double-Ended Queue), hem başından hem de sonundan eleman eklemeye
        // ve çıkartmaya izin veren bir veri yapısıdır.
        // Deque, FIFO (first in first out) veya LIFO (last in first out) olarak sıralanabilir.

        //-----------------------------------------
        //Deque nasil olusturulur?
        Deque<String> d = new LinkedList<>(); //Deque<String> d = new ArrayDeque<>(); te yazabilirdik

        //Deque nasil olusturulur?

        d.add("Mehmet");
        d.add("Mahmut");
        d.add("Ekrem");
        d.add("Oya");
        d.add("Tansu");
        System.out.println(d); //[Mehmet, Mahmut, Ekrem, Oya, Tansu]
        //Constructor LinkedList oldugu icin insert sirasina gore verdi

        //1) addFirst(E e): Deque'in başına bir öğe ekler. Dönüş türü void'dir çünkü
        // sadece eklemeyi gerçekleştirir ve değer döndürmez.

        d.addFirst("Ali");
        System.out.println(d); //[Ali, Mehmet, Mahmut, Ekrem, Oya, Tansu]
        for (String w : d){
            System.out.println(w);
        }
        //Ali
        //Mehmet
        //Mahmut
        //Ekrem
        //Oya
        //Tansu

        System.out.println("------------------");

        //2) addLast(E e): Deque’nin sonuna bir öğe ekler. Dönüş türü yine void’dir.
        d.addLast("Hasan");

        for (String w  : d){
            System.out.println(w);
        }
        System.out.println("------------------");

        //3)removeFirst(): Deque’nin başındaki öğeyi kaldırır ve kaldırılan öğeyi döndürür.
        // Bu method E türünde bir değer döndürür.(Burda String)
        System.out.println(d.removeFirst());
        System.out.println(d); //[Mehmet, Mahmut, Ekrem, Oya, Tansu, Hasan]

        //ArrayDeque nasil olusturulur?
        //ArrayDeque, basta ve sonda hizli ekleme/cikarma islemleri icin idealdir.
        //ArrayDeque, linkedList'e kiyasla daha yuksek performans sunar cunku icerikleri icin
        //array (dizi) tabanli bir yapi kullanir

        ArrayDeque<String> ad = new ArrayDeque<>();

        //Eleman ekleme
        ad.addFirst("ilk");
        System.out.println(ad); //[ilk]

        ad.addLast("son");
        System.out.println(ad); //[ilk, son]

        //Eleman cikarma
        String ilk =ad.removeLast();
        System.out.println(ad);

        String son = ad.removeLast();
        System.out.println(ad); //[]














    }
}
