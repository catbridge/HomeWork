package Home_Work_3.calcs.api;

public interface ICalculator {

    default double Sum(double firstArg, double secondArg){ //Метод для сложения
        return firstArg + secondArg;
    }

    default double Multiplication(double firstArg, double secondArg){ //Метод для умножения.
        return firstArg * secondArg;
    }

    default double Subtraction(double firstArg, double secondArg){ //Метод для вычитания
        return firstArg - secondArg;
    }

    default double Division(double firstArg, double secondArg){ //Метод для деления.
        return firstArg / secondArg;
    }

    default double Exponentiation(double base, int degree){ //Метод для возведения числа в степень.
        double result = base;
        if (degree == 0){
            return 1;
        }
        for (int i = 0; i < degree - 1; i++){
            result *= base;
        }
        return result;
    }

    default double Module(double argument){ //Метод для вычисления модуля числа.
        if (argument >= 0){
            return argument;
        }
        return -argument;
    }

    default double Root(double argument, int degree){ //Метод для вычисления корня
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
