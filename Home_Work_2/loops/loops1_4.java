package Home_Work_2.loops;

public class loops1_4 {
    public static void main(String[] arr) {
        long x = 1;
        while (x > 0) {
            x = 3 * x;
            // System.out.println(x);
        }
        System.out.println("Значение после переполнения: " + x);
        System.out.println("Значение до переполнения: 4052555153018976267 "); //нашел опытным путём
    }
}
