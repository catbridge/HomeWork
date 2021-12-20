package Home_Work_2.arrays;

import java.util.Scanner;
import Home_Work_2.arrays.ArrayUtils;

public class Arrays2for {
    public static void main(String[] args) { //Вывод каждого элемента массива в консоль
        first();
        second();
        third();

    }

    public static void first (){
        int [] container = ArrayUtils.arrayFromConsole();
        System.out.print("Массив с элементами:  ");
        for (int i = 0; i < container.length; i++) {
            System.out.print(container[i]);
            if(i != container.length - 1){
                System.out.print(" , ");
            }
        }
        System.out.println(" ");
        System.out.println("__________");
    }




    public static void second (){
        int [] container = ArrayUtils.arrayFromConsole();
        System.out.println("Каждый воторой элемент в массиве: ");
        for (int i = 0; i < container.length; i++) { //Вывожу каждый элемент с нечетным индексом, получаю каждый второй элемент массива, так как первый элемент имеет индекс 0 - четный.
            if (i % 2 != 0){
                System.out.println(container[i]);
            }
        }
        System.out.println("__________");
    }


    public static void third(){
        int [] container = ArrayUtils.arrayFromConsole();
        System.out.println("Все элементы массива в обратном порядке: ");
        for (int i = container.length - 1; i >= 0; i--) {
            System.out.print(container[i]);
            if(i != 0){
                System.out.print(" , ");
            }
        }
        System.out.println();
        System.out.println("__________");
    }

}

