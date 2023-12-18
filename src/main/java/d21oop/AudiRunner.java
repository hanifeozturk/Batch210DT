package d21oop;

public class AudiRunner {
    public static void main(String[] args) {
        //Motor m = new Motor() //HATA- Interface'lerden object uretemezsiniz
        AudiA4 a4 = new AudiA4();
        a4.turbo(); //Audi A4 turbo motor kullanir
        a4.analog(); //Audi A4 analog klima kullanir
        a4.esp(); //Audi A4 esp fren sistemi kullanir

        //a4.run();//Audi A4 havayastigi calistirir
        //ambiguity-belirsizlik ortaya cikmasin diye Java'ya hangi interface'deki run() methodunu
        //calistirmasini soyluyoruz
        ((Motor)a4).run(); //Audi A4 havayastigi calistirir
        //motor interface'inden gelen run() calisti

        //Motor. yapip fiyat'a ulastik. statik ispati
        //Motor.fiyat = 5000; //final ispati

        System.out.println(Motor.fiyat2);
        System.out.println(Klima.fiyat2);
        System.out.println(Fren.fiyat2);

        Motor.hiz(); //Interface uzerinden ulastik
        a4.guc(); // object uzerinden ulastik

    }

}