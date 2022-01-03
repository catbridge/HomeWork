package Home_Work_3.runners;

import Home_Work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();

        //4.1 + 15 * 7 + (28/5)^2
        double result = calculator.Sum(calculator.Sum(4.1, calculator.Multiplication(15, 7)), calculator.Exponentiation(calculator.Division(28, 5), 2));
        System.out.println("4.1 + 15 * 7 + (28/5)^2 = " +result); //Ответ 140.45999999999998 - ответ верный!
        System.out.println("Математических операций проведено: " +calculator.getCountOperation()); //Выводим кол-во произведенных операций в консоль.
    }
}
