package Home_Work_2.arrays;

public class Arrays2while {
    public static void main(String[] args) { //Только оператор while
        first();
        second();
        third();

    }

    public static void first (){ //Вывод каждого элемента массива в консоль
        int [] container = ArrayUtils.arrayFromConsole();
        System.out.print("Массив с элементами:  ");
        int i = 0; //Здесь будем считать индекс.
        while (i < container.length){
            System.out.print(container[i]);
            i++; //После каждого прохода по циклу увеличиваем переменную с индексом.
            if(i != container.length){
                System.out.print(" , ");
            }
        }

        System.out.println(" ");
        System.out.println("__________");
    }





    public static void second (){ //Вывод каждого второго элемента в консоль
        int [] container = ArrayUtils.arrayFromConsole();
        System.out.println("Каждый воторой элемент в массиве: ");
        int i = 0; //Здесь будем считать индекс.
        while (i < container.length){
            i++; //После каждого прохода по циклу увеличиваем переменную с индексом.
            if (i % 2 != 0){
                System.out.println(container[i]);
            }
        }
        System.out.println("__________");
    }


    public static void third(){ //Вывод всех элементов массива в обратном порядке
        int [] container = ArrayUtils.arrayFromConsole();
        System.out.println("Все элементы массива в обратном порядке: ");
        int i = container.length + 1;
        while (i > 1){
            i--; //После каждого прохода по циклу уменьшаем переменную с индексом.
            System.out.print(container[i - 1] + ", ");

        }
        System.out.println("");
        System.out.println("__________");
    }
}


