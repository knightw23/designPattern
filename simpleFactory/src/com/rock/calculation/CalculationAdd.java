package com.rock.calculation;

public class CalculationAdd extends Calculate {

    @Override
    public double getResult() throws Exception {
        return getNumberA()+getNumberB();
    }
}
