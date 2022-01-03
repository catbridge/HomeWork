package Home_Work_3.runners;

import Home_Work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import Home_Work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import Home_Work_3.calcs.simple.CalculatorWithMathCopy;
import Home_Work_3.calcs.simple.CalculatorWithMathExtends;
import Home_Work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();

        //4.1 + 15 * 7 + (28/5)^2
        double result = calc.Sum(calc.Sum(4.1, calc.Multiplication(15, 7)), calc.Exponentiation(calc.Division(28, 5), 2));
        System.out.println("4.1 + 15 * 7 + (28/5)^2 = " +result); //Ответ 140.45999999999998 - ответ верный!
        System.out.println("Количество математических операций: " + calc.getCountOperation());

        System.out.println("---------------------------------------------------");


        //CalculatorWithCounterAutoAgregation calculator = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathExtends());
        //CalculatorWithCounterAutoAgregation calculator = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoAgregation calculator = new CalculatorWithCounterAutoAgregation(new CalculatorWithOperator());

        //4.1 + 15 * 7 + (28/5)^2
        double result1 = calculator.Sum(calculator.Sum(4.1, calculator.Multiplication(15, 7)), calculator.Exponentiation(calculator.Division(28, 5), 2));
        System.out.println("4.1 + 15 * 7 + (28/5)^2 = " +result1); //Ответ 140.45999999999998 - ответ верный!
        System.out.println("Количество математических операций: " + calculator.getCountOperation());







    }
}
