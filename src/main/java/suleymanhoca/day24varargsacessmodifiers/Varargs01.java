package suleymanhoca.day24varargsacessmodifiers;

public class Varargs01  {
    public static void main(String[] args) {
        // Varargs : Variable arguments
        //bir method olusturdugumuzda argument olarak istedigimiz kadar arhument girebilmemizi saglar

        System.out.println(missingChar("ali",1));
    }

    public static String missingChar(String str, int n) {

    String newString  = str.substring(0,n);

    return newString + str.substring(n+1,str.length());

    }

}
