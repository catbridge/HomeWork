package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private int count = 0;

    @Override
    public double Exponentiation(double base, int degree) {
        count++; //Увеличиваем счётчик на 1
        return super.Exponentiation(base, degree);
    }

    @Override
    public double Module(double argument) {
        count++; //Увеличиваем счётчик на 1
        return super.Module(argument);
    }

    @Override
    public double Root(double argument, int degree) {
        count++; //Увеличиваем счётчик на 1
        return super.Root(argument, degree);
    }

    @Override
    public double Sum(double firstArg, double secondArg) {
        count++; //Увеличиваем счётчик на 1
        return super.Sum(firstArg, secondArg);
    }

    @Override
    public double Multiplication(double firstArg, double secondArg) {
        count++; //Увеличиваем счётчик на 1
        return super.Multiplication(firstArg, secondArg);
    }

    @Override
    public double Subtraction(double firstArg, double secondArg) {
        count++; //Увеличиваем счётчик на 1
        return super.Subtraction(firstArg, secondArg);
    }

    @Override
    public double Division(double firstArg, double secondArg) {
        count++; //Увеличиваем счётчик на 1
        return super.Division(firstArg, secondArg);
    }

    public long getCountOperation(){
        return count; //Вовращаем посчитанное кол-во проведенных операций.
    }
}
