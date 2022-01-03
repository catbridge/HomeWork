package Home_Work_3.runners;

import Home_Work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import Home_Work_3.calcs.api.ICalculator;
import Home_Work_3.calcs.simple.CalculatorWithMathCopy;
import Home_Work_3.calcs.simple.CalculatorWithMathExtends;
import Home_Work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregationInterfaceMain {

    public static void main(String[] args) {

        //CalculatorWithCounterAutoAgregationInterface calculator = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        //CalculatorWithCounterAutoAgregationInterface calculator = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoAgregationInterface calculator = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());

        //4.1 + 15 * 7 + (28/5)^2
        double result = calculator.Sum(calculator.Sum(4.1, calculator.Multiplication(15, 7)), calculator.Exponentiation(calculator.Division(28, 5), 2));
        System.out.println("4.1 + 15 * 7 + (28/5)^2 = " +result); //Ответ 140.45999999999998 - ответ верный!
        System.out.println("Количество математических операций: " + calculator.getCountOperation());

    }
}
