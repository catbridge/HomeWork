package Home_Work_2.loops;

import java.util.Scanner;

public class loops1_1 { //Решение с  использованием рекурсии!
    public static void main(String[] arr) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите положительное число ");
        int number = console.nextInt();

        System.out.println(recursion(number));
    }
    public static int recursion(int n){
        int result = 1;

        if (n == 0) {
            System.out.print(" = ");
            return result;
        }
        if (n == 1) {
            System.out.print(" * 1 = ");
            return result;
        }

        System.out.print(n);
        if (n != 2) {
            System.out.print(" * ");
        }

        result = n * recursion(n-1);
        return result;

    }

}

