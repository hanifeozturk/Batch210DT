package suleymanhoca.tekrar;

public class methodcreation01 {
    public static void main(String[] args) {

        System.out.println(toplama(3,5.3));//8.3
        System.out.println(carpma(5,6));//30

    }
    // bir methodu main methodun icinden cagirmak icin mutlaka static kelimesini kullanmalisiniz b
    public static double toplama(int num1, double num2){
        return num1+num2;
    }
    public static int carpma(int num1, int num2){
        return num1*num2;
    }
}
