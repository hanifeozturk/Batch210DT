package d7switchternarystring;

public class Ternary02 {
    public static void main(String[] args) {
        //Ornek : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz

        int a = -123;
        a = Math.abs(a); // ads methodu mutlak deger alir.

        String result = (a>99 && a<1000) ? " uc basamakli" :" uc basamakli degildir";
        System.out.println(result);


    }
}
