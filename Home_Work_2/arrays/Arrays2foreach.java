package Home_Work_2.arrays;

import Home_Work_2.arrays.ArrayUtils;

public class Arrays2foreach {
    public static void main(String[] args) { // Только операток foreach
        first();
        second();
        third();

    }

    public static void first() { //Вывод каждого элемента массива в консоль
        int[] container = ArrayUtils.arrayFromConsole();
        System.out.print("Массив с элементами:  ");
        for (int i : container) {
            System.out.print(i);
            if (i != container.length) {
                System.out.print(" , ");
            }
        }
        System.out.println(" ");
        System.out.println("__________");
    }


    public static void second() { //Вывод каждого второго элемента в консоль
        int[] container = ArrayUtils.arrayFromConsole();
        System.out.println("Каждый воторой элемент в массиве: ");
        int index = 0;
        for (int i : container) {
            if (index % 2 != 0) {
                System.out.print(i + ", ");
            }
            index++;
        }
        System.out.println();
        System.out.println("__________");
    }


    public static void third() { //Вывод всех элементов массива в обратном порядке
        int[] container = ArrayUtils.arrayFromConsole();
        System.out.println("Все элементы массива в обратном порядке: ");
        String result = "";
        for (int i : container) {
            result = i + "," + result;
        }
        System.out.print(result);
    }

}