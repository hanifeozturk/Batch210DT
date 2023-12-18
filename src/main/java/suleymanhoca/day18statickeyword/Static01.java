package suleymanhoca.day18statickeyword;

public class Static01 {
    static int en = 12;
    static int boy = 10;
    static int alan;
    //bir variable i olustururken hesap yapmamiz gerekirse
    //"static block" olusturmal iyidir. yani ; "int alan = en*boy;" demek yerine
    //"static block" olusturup bu islemleri static block" un icine yazmak daha iyidir.
    static {
        alan = en * boy;
    }



    public static void main(String[] args) {

    }
}
