package loops;

public class loops1_4_2 {
    public static void main(String[] args) {
        long x = 1;
        while (x > 0) {
            x = 188 * x;
            System.out.println(x);
        }
        System.out.println("Значение после переполнения: " + x);
        System.out.println("Значение до переполнения: 1560496482665168896 ");
    }
}
