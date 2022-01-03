package Home_Work_3.runners;

import Home_Work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();

        ////4.1 + 15 * 7 + (28/5)^2

        double result = calculator.Sum(calculator.Sum(4.1, calculator.Multiplication(15, 7)), calculator.Exponentation(calculator.Division(28, 5), 2));
        System.out.println("4.1 + 15 * 7 + (28/5)^2 = " +result); // Ответ 140.45999999999998 - верный ответ!
    }
}
