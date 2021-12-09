package HomeWork1;
import java.util.Objects;
import java.util.Scanner;
public class Task4 { //Решение первым методом, без return.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Today is a weekday? (true//false)");
        boolean weekday = scanner.nextBoolean();
        System.out.println("Today is a vacation? (true//false");
        boolean vacation = scanner.nextBoolean();
        if (!weekday || vacation){
        System.out.println("Сегодня можно спать");}
        else {
            System.out.println("Надо идти на работу");
        }
    }
}




