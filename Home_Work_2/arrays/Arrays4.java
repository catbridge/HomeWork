package Home_Work_2.arrays;

import java.util.Arrays;
import java.util.Scanner;
import Home_Work_2.arrays.ArrayUtils1;

public class Arrays4 {
    public static void main(String[] args) {
        first();
        second();
        third();
        fourth();
        fifth();
        sixth();

    }

    public static void first() { //Cумма четных положительных чисел массива

        int[] container = ArrayUtils1.arrayRandom(5,99);
        System.out.print("Массив: ");
        System.out.println(Arrays.toString(container));
        int sum = 0; //переменная для записи суммы
        for (int i : container) {
            if (i % 2 == 0 && i > 0) {
                sum += i;
            }
        }
        System.out.println("Сумма четных положительных чисел массива : " + sum);
        System.out.println("_______________");
    }

    public static void second() { //Максимальный элемент массива с четным индексом.
        int[] container = ArrayUtils1.arrayRandom(5,99);
        System.out.print("Массив: ");
        System.out.println(Arrays.toString(container));
        int max = 0;
        for (int i = 0; i < container.length; i++) {
            if (container[i] > max && i % 2 == 0) { //Записываю в max максимальный элемент массива с чётным индексом.
                max = container[i];
            }
        }
        System.out.println("Максимальный элемент массива с чётным индексом " + max);
        System.out.println("________");
    }

    public static void third() {
        int[] container = ArrayUtils1.arrayRandom(5,99);
        System.out.print("Массив: ");
        System.out.println(Arrays.toString(container));
        int sum = 0; //Переменная для среднего арифметического.
        for (int i = 0; i < container.length; i++) {
            sum += container[i]; //Записываем сумму всех элементов массива

        }
        int average = sum / 5;
        System.out.println("Среднее арифметическое элементов массива: " + average);
        for (int x : container) {
            if (x < average) {
                System.out.println("Элемент массива, который меньше среднего арифметического: " + x);
            }
        }System.out.println("________");
    }

    public static void fourth() {
        int[] container = ArrayUtils1.arrayRandom(5,99);
        System.out.print("Массив: ");
        System.out.println(Arrays.toString(container));
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < container.length; i++) {
            if (container[i] < min) {
                min2 = min; //Минимальный элемент за исключением последнего записанного в min
                min = container[i]; //Минимальный элемент из всех просмотренных
            } else if (container[i] < min2 && container[i] != min) { // Добавляем запрет на элементы равные минимальному.
                min2 = container[i];
            }
        }
        if (min2 != Integer.MAX_VALUE) { //Если переменная менялась, то ...
            System.out.println();
            System.out.println("Второй по минимальности элемент массива : " + min2);
        } else { //Если не менялась, то ...
            System.out.println("Второго по минимальности элемента нет");
        }
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("________");
    }

    public static void fifth() { //Сжать массив, удалив элементы, принадлежащие интервалу (Работает, но нужно еще раз разобраться)
        Scanner console = new Scanner(System.in);
        int[] container = ArrayUtils1.arrayRandom(5,99);
        System.out.print("Массив: ");
        System.out.println(Arrays.toString(container));
        System.out.println("Укажите интервал элементов от a до b, которые нужно удалить");
        System.out.println("Введите значение a: ");
        int a = console.nextInt();
        System.out.println("Введите значение b: ");
        int b = console.nextInt();
        int abcount = 0;
        for (int i = 0; i < container.length; i++) {
            if (container[i] >= a && container[i] <= b) { //Этот элемент не нужен, т.к. вхдит в интервал.
                abcount++; //считаем сколько элементов в интервале
            } else {
                container[i - abcount] = container[i]; //Нужные ставим в финальную позицию.
            }
        }
        for (int i = container.length - abcount; i < container.length; i++) {
            container[i] = 0; // Заполняем нулями тот элемент, который удалили.
        }
        System.out.println("Финальный массив: " + Arrays.toString(container));
        System.out.println("________");

    }

    public static void sixth() {
        int[] container = ArrayUtils1.arrayRandom(5,99);
        System.out.print("Массив: ");
        System.out.println(Arrays.toString(container));
        int sum = 0;
        String res = "";
        for (int i = 0; i < container.length; i++) {
            int x = container[i];
            while (x > 0){
                //res += (x % 10) + " + " ;
                sum += x % 10;
                x /= 10;
            }
        }
        System.out.println("Сумма цифр массива = " + sum);
    }

}

