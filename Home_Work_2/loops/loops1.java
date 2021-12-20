package Home_Work_2.loops;

import java.util.Scanner;

public class loops1 {
    public static void main(String[] arr) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите положительное число от 1 до 25 "); //После 25 происходит переполнение
        int number = console.nextInt();
        long result = 1; //Могут возникнуть проблемы с переполнением...
        String res = "";
        for (int i = 1; i <= number; i++) {
            result *= i;
            if (i == number) {
                res += i;
            } else {
                res += i + " * ";
            }
        }

        System.out.print(res + " = " + result);

        if (result <= 0){ //Проверка переполнения
            System.out.println(" ");
            System.out.println("Произошла ошибка. Пожалуйста, введите число поменьше");
        }
    }
}

