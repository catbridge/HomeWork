package loops;

import java.util.Scanner;

public class loops1_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        double number = console.nextDouble();
        System.out.println("Введите степень, в которую нужно возвести число");
        int degree = console.nextInt();
        double res = 1;

        for (int i = 0; i < degree; i++) {
            res = res * number; //Умножаем число столько раз, сколько укажет пользователь для степени. И записываем результат в переменную res.
        }
        System.out.println(number + " ^ " + degree + " = " + res);
        }
}
