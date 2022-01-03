package Home_Work_3.calcs.simple;

import Home_Work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    //Переопределенные методы из родительского класса CalculatorWithOperator для возведения в степень, вычисления числа по модулю и корня.
    @Override
    public double Exponentiation(double base, int degree) {
        return Math.pow(base, degree);
    }

    @Override
    public double Module(double argument) {
        return Math.abs(argument);
    }

    @Override
    public double Root(double argument, int degree) { //
        return Math.sqrt(argument);
    }
}
