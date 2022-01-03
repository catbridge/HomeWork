package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.api.ICalculator;

public class CalculatorWithMemory implements ICalculator {
    private long count = 0;
    private double memory;
    private double lastValue;


    public CalculatorWithMemory(ICalculator calculator) {

    }


    @Override
    public double Sum(double firstArg, double secondArg) {
        count++;
        lastValue = ICalculator.super.Sum(firstArg, secondArg); //Записываем результат операции в lastValue
        return ICalculator.super.Sum(firstArg, secondArg);
    }

    @Override
    public double Multiplication(double firstArg, double secondArg) {
        count++;
        lastValue = ICalculator.super.Multiplication(firstArg, secondArg); //Записываем результат операции в lastValue
        return ICalculator.super.Multiplication(firstArg, secondArg);
    }

    @Override
    public double Subtraction(double firstArg, double secondArg) {
        count++;
        lastValue = ICalculator.super.Subtraction(firstArg, secondArg); //Записываем результат операции в lastValue
        return ICalculator.super.Subtraction(firstArg, secondArg);
    }

    @Override
    public double Division(double firstArg, double secondArg) {
        count++;
        lastValue = ICalculator.super.Division(firstArg, secondArg); //Записываем результат операции в lastValue
        return ICalculator.super.Division(firstArg, secondArg);
    }

    @Override
    public double Exponentiation(double base, int degree) {
        count++;
        lastValue = ICalculator.super.Exponentiation(base, degree); //Записываем результат операции в lastValue
        return ICalculator.super.Exponentiation(base, degree);
    }

    @Override
    public double Module(double argument) {
        count++;
        lastValue = ICalculator.super.Module(argument); //Записываем результат операции в lastValue
        return ICalculator.super.Module(argument);
    }

    @Override
    public double Root(double argument, int degree) {
        count++;
        lastValue = ICalculator.super.Root(argument, degree); //Записываем результат операции в lastValue
        return ICalculator.super.Root(argument, degree);
    }
    //Метод добавления значения в память.
    public void addToMemory(){
        this.memory = this.lastValue; //Добавление резульатата операции в память.
    }
    //Метод получения значения из памяти.
    public double getFromMemory(){
        double tmp = this.memory; //Создаем временную переменную, в которую записываем результат из памяти.
        this.memory = 0; //Обнуляем память.
        this.lastValue = 0; //Обнуляем последнюю операцию.
        return tmp; //Возвращаем значение временной переменной, в которой был записан результат до обнуления.
    }

    public long getCountOperation(){
        return count;
    }
}
