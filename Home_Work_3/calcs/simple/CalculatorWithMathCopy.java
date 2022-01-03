package Home_Work_3.calcs.simple;

import Home_Work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    public CalculatorWithMathCopy() {
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

    public double Exponentation (double base, double degree){ //Метод для возведения числа в степень (исп. Math).
        return Math.pow(base, degree);
    }
    public double Module (int arg){ //Метод для вычисления модуля числа (исп. Math).
        return Math.abs(arg);
    }

    public double SquareRoot (double arg){ //Метод для вычисления квадратного корня (исп. Math).
        return Math.sqrt(arg);
    }
}
