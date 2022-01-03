package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.simple.CalculatorWithMathCopy;
import Home_Work_3.calcs.simple.CalculatorWithMathExtends;
import Home_Work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregation {
    private long count = 0;

    public CalculatorWithCounterAutoAgregation(CalculatorWithOperator calc) {

    }
    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calc) {

    }
    public CalculatorWithCounterAutoAgregation(CalculatorWithMathExtends calc) {

    }



    public double Sum(double firstArg, double secondArg){ //Метод для сложения
        count++;
        return firstArg + secondArg;
    }

    public double Multiplication(double firstArg, double secondArg){ //Метод для умножения.
        count++;
        return firstArg * secondArg;
    }

    public double Subtraction (double firstArg, double secondArg){ //Метод для вычитания
        count++;
        return firstArg - secondArg;
    }

    public double Division (double firstArg, double secondArg){ //Метод для деления.
        count++;
        return firstArg / secondArg;
    }

    public double Exponentiation (double base, int degree){ //Метод для возведения числа в степень.
        count++;
        double result = base;
        if (degree == 0){
            return 1;
        }
        for (int i = 0; i < degree - 1; i++){
            result *= base;
        }
        return result;
    }

    public double Module (double argument){ //Метод для вычисления модуля числа.
        count++;
        if (argument >= 0){
            return argument;
        }
        return -argument;
    }

    public double Root (double argument, int degree){ //Метод для вычисления корня
        count++;
        for (int i = 0; i < argument; i++){
            if (Exponentiation(i, degree) == argument){
                return i;
            }else if (Exponentiation(i, degree) > argument){
                return 0;
            }
        }
        return 0;
    }

    public long getCountOperation(){
        return count;
    }

}
