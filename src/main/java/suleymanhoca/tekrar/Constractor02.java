package suleymanhoca.tekrar;

public class Constractor02 {
    public static void main(String[] args) {
        Constructor01 hondaAraba01 = new Constructor01();
        System.out.println("zamli fiyat"+(hondaAraba01.price + 1000));
        System.out.println("year"+(hondaAraba01.year-1));
        System.out.println(hondaAraba01.type.replace("Civic","Camry"));
        System.out.println(hondaAraba01.make.replace("Honda","Toyota"));
    }
}
