package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface implements ICalculator {
    private long count = 0;


    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator) {

    }


    @Override
    public double Sum(double firstArg, double secondArg) {
        count++;
        return ICalculator.super.Sum(firstArg, secondArg);
    }

    @Override
    public double Multiplication(double firstArg, double secondArg) {
        count++;
        return ICalculator.super.Multiplication(firstArg, secondArg);
    }

    @Override
    public double Subtraction(double firstArg, double secondArg) {
        count++;
        return ICalculator.super.Subtraction(firstArg, secondArg);
    }

    @Override
    public double Division(double firstArg, double secondArg) {
        count++;
        return ICalculator.super.Division(firstArg, secondArg);
    }

    @Override
    public double Exponentiation(double base, int degree) {
        count++;
        return ICalculator.super.Exponentiation(base, degree);
    }

    @Override
    public double Module(double argument) {
        count++;
        return ICalculator.super.Module(argument);
    }

    @Override
    public double Root(double argument, int degree) {
        count++;
        return ICalculator.super.Root(argument, degree);
    }

    public long getCountOperation(){
        return count;
    }
}
