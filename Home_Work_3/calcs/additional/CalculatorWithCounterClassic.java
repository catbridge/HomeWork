package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    protected int counter = 0;

    public void incrementCountOperation(){
        counter++;

    }

    public long getCountOperation(){
         return counter;
     }

}
