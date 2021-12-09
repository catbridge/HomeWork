package HomeWork1;
import java.util.Scanner;

public class Task5_1 { //Выполняет условие при помощи if
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();

        if (name.equals("Вася")) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }

        if (name.equals("Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        }

        if (!name.equals("Вася") && !name.equals("Анастасия")){
            System.out.println("Добрый день, а вы кто?");


        }
    }
}

