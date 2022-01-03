package Home_Work_3.runners;

import Home_Work_3.calcs.additional.CalculatorWithMemory;
import Home_Work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calculator = new CalculatorWithMemory(new CalculatorWithOperator());

        //4.1 + 15 * 7 + (28/5)^2
        //calculator.Sum(calculator.Sum(4.1, calculator.Multiplication(15, 7)), calculator.Exponentiation(calculator.Division(28, 5), 2));
        //Разделим выражение на несколько этапов.
        calculator.Division(28, 5); //Выполняем деление
        calculator.addToMemory(); //Записываем результат деления в память калькулятора
        calculator.Exponentiation(calculator.getFromMemory(), 2); //Получаем записанное значание из памяти калькулятора и возводим его во 2 степень
        calculator.addToMemory(); //Добавляем результат возведения в степень в память
        calculator.Sum(calculator.getFromMemory(), calculator.Multiplication(15, 7)); // Суммируем результат возведения в степень из памяти с произведением чисел 15 и 7
        calculator.addToMemory(); //Добавляем результат предыдущей операции в память калькулятора
        double result = calculator.Sum(4.1, calculator.getFromMemory()); //Складываем число 4.1 с результатом последней операции, записываем в переменную как конечный результат.

        System.out.println("4.1 + 15 * 7 + (28/5)^2 = " +result); //Ответ 140.45999999999998 - ответ верный!
        System.out.println("Количество математических операций: " + calculator.getCountOperation()); //Выводим кол-во проведенных операций в консоль.
    }
}
