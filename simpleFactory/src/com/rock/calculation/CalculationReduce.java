package com.rock.calculation;

/**
 * 减法
 */
public class CalculationReduce extends Calculate {
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
