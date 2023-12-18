package suleymanhoca.day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

   static LocalDate date = LocalDate.now();


    public static void main(String[] args) {
        // bugunun tarihini ekrana yaz
        LocalDate date = LocalDate.now();
        System.out.println(LocalDate.now());

        System.out.println(LocalTime.now());

        System.out.println(LocalDateTime.now());


    }


    public static String plus45() {

        String plus45 = date.plusDays(45).toString();
        return plus45;

    }
}
