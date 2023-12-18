package d21oop;

public class Civic extends Honda {//1-extens ile Hondanin cild i yapalim

    @Override //2- @overside yazdik
    public void engine(){    //3-body verebilmek icin abstract'i sildik
                            //4- suslu parantez ile body verdik
        System.out.println("Gas 1.6 Eco");
    }
}
