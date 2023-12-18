package d19static_oop;

public class Vehicle { //Constructor Hiyerasisi

    /*
    Child class'tan bir object olusturdugunuzda constructor'lar en ustteki parent class'tan
    baslatilarak alta doğru calistirilir
    */

    /*Düşünün ki bir otomobil üreticisi olduğunuzu ve farklı türde otomobiller üretiyorsunuz.

        1- Grandparent Class: Bu class, tüm otomobillerin temel özelliklerini içerir.
        Örneğin, otomobillerin markası, modeli, yakıt türü gibi ortak özellikleri burada tanımlanır.
        Bu sınıfın bir constructor'ı vardır ve yeni bir otomobil oluşturulduğunda bu constructor çağrılır.
        Bu constructor, otomobilin temel özelliklerini ayarlar.

        2- Parent Class: Bu class, Grandparent sınıfını genişletir ve daha özelleştirilmiş otomobil türlerini temsil eder.
         Örneğin, sedan otomobillerin özellikleri burada tanımlanabilir.
         Parent sınıfının constructor'ı, hem kendi özelliklerini hem de miras aldığı Grandparent sınıfının
         özelliklerini ayarlar.

        3- Child Class (Çocuk Sınıf): Bu class, Parent sınıfını genişletir ve daha spesifik bir otomobil türünü
        temsil eder, örneğin spor otomobillerini. Child sınıfının constructor'ı, hem kendi özelliklerini
        hem de miras aldığı Parent ve Grandparent sınıflarının özelliklerini ayarlar.

        **Yukarıdan aşağıya doğru constructorlar sırasıyla çalışır

        Sonuc: Her bir class, daha özelleştirilmiş bir otomobil türünü temsil eder ve her biri üst
        class özelliklerini miras alır ve kendi özelliklerini ekler*/

    //constructor olusturalim
    public Vehicle(){
        System.out.println("Honda, 2023, Benzin");
    }


    /*
Soru: Peki child bir class'ta Object olusturuldugunda Parent bunu nasil algiliyor da
kendi constructor'unu calistiriyor?

Cevap: Super() cagrisi ile yapilir. Super çağrısı, bir child class'ın constructor'unda,
parent class'in parametresiz constructor'unu çağırmak için kullanılan bir ifadedir.

super() çağrısı, bir child class'ta bir object oluşturulduğunda, otomatik olarak çağrılır.
Ancak, super() çağrısını manuel olarak da çağırabilirsiniz.
Bunu yapmak için, super() ifadesini, child class'ın constructor'unun başında kullanabilirsiniz.
Manuel olarak yazarsaniz parametreli constructor'lari da cagirabilirsiniz.

Neden super cagrisi yapalim?

1- super keyword'unu kullanirsaniz, hem parent class'in methodunu çağırabilir hem de bu
methodun davranışını child class'in ihtiyacına göre değiştirebilirsiniz.

2 - extends ise sadece miras almayı sağlar, ancak parent class'in methodlarını değiştirmez.
*/
}
