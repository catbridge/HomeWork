package Home_Work_3.calcs.simple;

import Home_Work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

    public CalculatorWithOperator()  {

    }

    public double Sum(double firstArg, double secondArg){ //Метод для сложения
        return firstArg + secondArg;
    }

    public double Multiplication(double firstArg, double secondArg){ //Метод для умножения.
        return firstArg * secondArg;
    }

    public double Subtraction (double firstArg, double secondArg){ //Метод для вычитания
        return firstArg - secondArg;
    }

    public double Division (double firstArg, double secondArg){ //Метод для деления.
        return firstArg / secondArg;
    }

    public double Exponentiation (double base, int degree){ //Метод для возведения числа в степень.
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
        if (argument >= 0){
            return argument;
        }
        return -argument;
    }

    public double Root (double argument, int degree){ //Метод для вычисления корня
        for (int i = 0; i < argument; i++){
            if (Exponentiation(i, degree) == argument){
                return i;
            }else if (Exponentiation(i, degree) > argument){
                return 0;
            }
        }
        return 0;
    }
}
