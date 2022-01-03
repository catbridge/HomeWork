package Home_Work_3.runners;

import Home_Work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();
        //4.1 + 15 * 7 + (28/5)^2
        //double result = calculator.Sum(calculator.Sum(4.1, calculator.Multiplication(15, 7)), calculator.Exponentiation(calculator.Division(28, 5), 2));
        double a = calculator.Multiplication(15, 7);
        calculator.incrementCountOperation();
        double b = calculator.Sum(4.1, a);
        calculator.incrementCountOperation();
        double x = calculator.Division(28, 5);
        calculator.incrementCountOperation();
        double z = calculator.Exponentiation(x, 2);
        calculator.incrementCountOperation();
        double result = b + z;
        calculator.incrementCountOperation();
        System.out.println("4.1 + 15 * 7 + (28/5)^2 = " +result); //Ответ 140.45999999999998 - ответ верный!
        System.out.println("Математических операций проведено: " + calculator.getCountOperation()); //Вызов метода, хранящего число операций.
    }
}
