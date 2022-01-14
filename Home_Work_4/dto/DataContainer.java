package Home_Work_4.dto;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[] data){
        this.data = data;
    }

    /**
     * Метод для добавления объекта обобщенного типа в контейнер
     * @param item - данные обобщенного типа
     * @return индекс объекта в контейнере. Вернет -1 если объект нельзя поместить в контейнер
     */

    public int add (T item){
        if (item == null){
            return -1;
        }

        int freeIndex = findFreeIndex();
        this.data[freeIndex] = item;
        return freeIndex;
    }

    /**
     * Метод, возвращающий объект из контейнера по его индексу
     * @param index - индекс возвращаемого объекта
     * @return объект с индексом index. В случае ошибки, вернет null.
     */
    public T get(int index){
        if (isIndexNotValid(index)){
            return null;
        }
        return this.data[index];
    }

    /**
     * Метод возвращает массив объектов контейнера
     * @return массив объектов контейнера
     */
    public T[] getItems(){
        return this.data;
    }

    /**
     * Данный метод удаляет объект из контейнера по его индексу
     * @param index индекс элемента который необходимо удалить
     * @return true -  если объект удален, false - если его нельзя удалить
     */

    public boolean delete (int index){
        //если запрашеваемого индекса нет - возвращаем false
        if (isIndexNotValid(index)){
            return false;
        }
        //Удаление последнего элемента контейнера
        if (index == this.data.length - 1){
            newDataLength(this.data.length - 1);
            return true;
        }
        //Смещение всех элементов контейнера начиная от index на одну позицию влево
        for (int i = index; i < this.data.length - 1; i++){
            this.data[i] = this.data[i + 1];
        }
        newDataLength(this.data.length - 1);
        return true;
    }

    /**
     * Данный метод удаляет все объекты из контейнера по содержанию объекта
     * @param item - объект, который нужно удалить
     * @return true - объект удален, false - объект нельзя удалить
     */
    public boolean delete (T item){
        int itemIndex = findItem(item);
        //Если элемент не найден
        if (itemIndex == -1){
            return false;
        }
        //Удаляем элемменты равные item
        do {
            delete(itemIndex);
            itemIndex = findItem(item);
        } while (itemIndex != -1);
        return true;
    }

    /**
     * Данный метод выполняет сортировку контейнера
     * @param comparator выполняет сравнение элементов контейнера.
     */
    public void sort (Comparator<T> comparator){
        sorter(this.getItems(), comparator);
    }

    /**
     * Метод выполняет сортировку контейнера с использованием CompareTo объекта контейнера
     * @param container контейнер объектов
     */
    public static <T> void sort (DataContainer<? extends Comparable<T>> container){
        sorter(container.getItems(), null);
    }

    /**
     * Метод выводит содержимоей data в виде строки
     * @return элементы data
     */
    @Override
    public String toString() {
        for (T item : this.data){
            if (item == null){
                return "";
            }
        }
        return "Содержимое data: " + Arrays.toString(data);
    }

    /**
     * Данный метод выполняет сортировку массива
     * @param array массив для сортировки
     * @param comparator коморатор для объектов контейнера. Если равен null - используется campareTo
     */
    public static <T> void sorter (T[] array, Comparator<T> comparator){
        boolean isSwap;
        boolean needSwap;

        do {
            isSwap = false;
            for (int i = 0; i < array.length - 1; i++){
                if (comparator == null){
                    Comparable o1 = (Comparable) array [i];
                    Comparable o2 = (Comparable) array [i + 1];
                    needSwap = (o1.compareTo(o2) > 0);
                } else {
                    needSwap = (comparator.compare(array[i], array[i+1]) > 0);
                }
                if (needSwap){
                    swap(array, i, i + 1);
                    isSwap = true;
                }
            }
        }while (isSwap);

    }



    /**
     * Метод меняет местами элементы массива
     * @param array массив
     * @param from индекс 1 элемента
     * @param to индекс 2 элемента
     * @param <T> тип элементов массива
     */
    private static <T> void swap (T[] array, int from, int to){
        T tmp = array[from];
        array[from] = array[to];
        array[to] = tmp;
    }

    /**
     * Метод проверяет валидность индекса
      * @param index - индекс контейнера
     * @return true - индекс не верный, false - индекс верный.
     */
    private boolean isIndexNotValid(int index){
        return (index >= this.data.length || index < 0);
    }

    /**
     * Метод возвращается свободный индекс в контейнере. Если свободного нет - рассширяет массив.
     * @return свободный индекс в контейнере.
     */
    private int findFreeIndex(){
        for (int i = 0; i < this.data.length; i++){
            if (this.data[i] == null){
                return i;
            }
        }
        newDataLength(this.data.length + 1);
        return this.data.length - 1;
    }


    /**
     * Метод изменяет длину массива data до length
     * @param length новая длина массива
     */
    private void newDataLength (int length){
        this.data = Arrays.copyOf(this.data, length);
    }

    /**
     * Метод возвращает индекс объекта item в контейнере
     * @param item объект, индекс которого нужно найти
     * @return индекс объекта item в контейнере. Вернет -1 если объект не найден.
     */
    private int findItem (T item){
        for (int i = 0; i < this.data.length; i++){
            if (Objects.equals(this.data[i], item)){
                return i;
            }
        }
        return -1;
    }



}

