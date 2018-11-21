package com.rock.calculation;

public class CalculateExcept extends Calculate {
    @Override
    public double getResult() throws Exception {
        if (getNumberB() == 0)
            throw new Exception("除数不能为0");
        return getNumberA() / getNumberB();
    }
}
