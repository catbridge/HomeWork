package Home_Work_2.sorts;
public class SortsUtils {
    public static void main(String[] args) {
        System.out.println("Сортировка методом пузырька: ");
        BubbleSort();
        System.out.println();
        System.out.println("_________________________________");
        System.out.print("Сортировка шейкерным методом: ");
        ShakeSort();

    }

    public static void BubbleSort (){ //Пузырьковая сортировка
        int[] a = {9, 1, 5, 99, 9, 9};

        System.out.print("[");
        for (int num : a) { //Массив до сортировки
            System.out.print(num + ",");
        }
        System.out.print("]");
        int count = 0;
        do {
            count = 0;
            for (int i = 0; i < a.length - 1; i++) { //Сортировка пузырьком
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    count++;
                }
            }
        }
        while (count > 0) ;
        System.out.print( " -> [");
        for (int num : a) { //Массив после сортировки
            System.out.print(num + ",");
        }
        System.out.print("]");
    }

    public static void ShakeSort (){ //Шейкерная сортировка

        int[] array = {9, 1, 5, 99, 9, 9};
        int left = 0; //левая граница
        int right = array.length - 1; //правая граница
        System.out.println();
        System.out.print("[");
        for (int num : array) { //Массив до сортировки
            System.out.print(num + ",");
        }
        System.out.print("] -> ");

        do {
            //Сдвигаем к концу массива "тяжелые элементы"
            for (int i = left; i < right; i++){
                if(array[i] > array[i + 1]){
                    array[i] ^= array [i+1];
                    array[i+1] ^= array [i];
                    array[i] ^= array[i+1];
                }
            }
            right--; //уменьшаем правую границу

            //Cдвигаем к началу массива "легкие элементы"
            for (int i = right; i > left; i--){
                if(array[i] < array[i-1]){
                    array[i] ^= array [i-1];
                    array[i-1] ^= array [i];
                    array[i] ^= array[i-1];
                }
            }
            left++; //увеличиваем левую границу
        }while (left <= right);

        System.out.print("[");
        for (int i : array) {
            System.out.print(i + "," ); //Вывод отсортированного массива на экран.
        }
        System.out.print("]");
    }
}

