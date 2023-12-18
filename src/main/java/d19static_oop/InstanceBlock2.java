package d19static_oop;

public class InstanceBlock2 {
    //Eger tum constructor'larin icinde calismasi gereken ayni kodlar varsa
//tekrardan kurtulmak icin bu kodlari instance block icine yazariz

    public int year;

//2 tane constructor olusturalim

public InstanceBlock2(){
    System.out.println("Herkese selam");
}
    public InstanceBlock2(int year) {
        System.out.println("Herkese selam");
        this.year = year;
    }

}
