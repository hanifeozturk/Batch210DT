package d21oop;

public class AudiS5 implements Fren,Klima,Motor{

    @Override
    public void eco() {
            System.out.println("Audi S5 economik motor kullanir");
    }
    public void turbo(){
        System.out.println("Audi S5 turbo motor kullanir");
    }
    public void gas(){
        System.out.println("Audi S5 gas motor kullanir");
    }

    @Override
    public void analog() {
        System.out.println("Audi S5 analog klima kullanir");

    }

    @Override
    public void dijital() {
        System.out.println("Audi S5 dijital klima kullanir");
    }

    @Override
    public void abs() {
        System.out.println("Audi S5 abs fren kullanir");
    }

    @Override
    public void esp() {
        System.out.println("Audi S5 esp fren kullanir");
    }
    public void run() {
        System.out.println("Audi A4 havayastigi calistirir");
    }
}
