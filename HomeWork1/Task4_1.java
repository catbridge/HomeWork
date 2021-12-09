package HomeWork1;
import java.util.Scanner;

public class Task4_1 { //Правильное решение, выполняющее условия задания.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Today is a weekday? (true//false)");
        boolean weekday = scanner.nextBoolean();
        System.out.println("Today is a vacation? (true//false");
        boolean vacation = scanner.nextBoolean();
        boolean result = sleepIn(weekday, vacation);
        if (result){
            System.out.println("Сегодня можно спать");
        }else {
            System.out.println("Надо идти на работу");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {//Если не работчий день и отпуск
            return true; // Можно спать
        }
        return false; // Работаем

    }

}




