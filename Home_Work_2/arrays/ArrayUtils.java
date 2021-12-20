package Home_Work_2.loops;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtils {
    public static void main(String[] args) {
        int [] container = arrayFromConsole();
        System.out.println("Был создан массив: " + Arrays.toString(container));


    }

    public static int[] arrayFromConsole(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = console.nextInt();
        int [] container = new int[size];
        System.out.println("Введите элементы массива по одному");
        for (int i = 0; i < size; i++) {
            container[i] = console.nextInt();
        }
        return container;

    }
}
