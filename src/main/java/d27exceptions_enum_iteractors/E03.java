package d27exceptions_enum_iteractors;

public class E03 {
    public static void main(String[] args) {
        int a = 12;
        int b = 0;
        int[] c = {3, 5, 7, 9};
        getir(c, a, b);
    }
    public static void getir(int[] c, int a, int b){
        try {
            int idx = a / b;
            int element = c[idx];
            System.out.println(element);
        } finally {
            System.out.println("Database ile baglantiyi kesiniz");
        }
    }
}
