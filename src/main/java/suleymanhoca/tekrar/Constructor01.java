package suleymanhoca.tekrar;

public class Constructor01 {
    int price = 20000;
    int year = 2020;
    String make = "Honda";
    String type = "Civic";

    public static void main(String[] args) {
        Constructor01 hondaAraba = new Constructor01();

        System.out.println(hondaAraba.price);
        System.out.println(hondaAraba.make);
        System.out.println(hondaAraba.type);
        System.out.println(hondaAraba.year);




    }
}
