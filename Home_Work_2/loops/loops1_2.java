package loops;

import java.util.Scanner;

public class loops1_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число ");
        String num = console.nextLine();
        if (!isNumeric(num)){
            System.out.println("Вы ввели не число!");
            return;
        }
        int res = 1;
        if (Double.parseDouble(num) % 1 != 0) {
            System.out.println("Вы ввели не целое число!");
        }else {
            int num1 = Integer.parseInt(num);
            String result = "";
            String number = "";
            while (num1 != 0) {
                number += (num1 % 10);
                res = res * (num1 % 10);
                num1 =  num1 / 10;

            }
            int number1 = Integer.parseInt(number);
            while (number1 != 0) {
                if((number1/10) != 0){
                    result += (number1 % 10) + " * ";
                }else {
                    result += (number1 % 10);
                }
                number1 = number1 / 10;

            }
            System.out.print(result + " = " + res);
        }
    }


    public static boolean isNumeric(String str){ //Проверка на число
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
}
}