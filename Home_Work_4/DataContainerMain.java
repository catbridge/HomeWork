package Home_Work_4;

import Home_Work_4.dto.DataContainer;

import java.util.Collection;
import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {

        DataContainer<String> container = new DataContainer<>(new String[1]);
        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");
        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);
        System.out.println(text1); //Привет
        System.out.println(text2); //Как дела
        System.out.println(text3); //Работаю
        System.out.println(text4); //Давай потом
        container.delete(text1);
        System.out.println(container.get(index1)); //Как дела

        container.sort(new Comparator<String>()//Cортировка 1 -
        {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        }
        );
        System.out.println(container);

        DataContainer.sort(container); //Cортировка 2 -
        System.out.println(container);
        

        container.delete("Работаю");
        System.out.println(container);



    }
}
