package com.rock.factory;

import com.rock.calculation.*;

/***
 * 简单工厂模式
 */
public class CalculateFactory {
    public static Calculate getCalculate(String operator) {
        Calculate calculate = null;
        switch (operator) {
            case "+":
                calculate = new CalculationAdd();
                break;
            case "-":
                calculate = new CalculationReduce();
                break;
            case "*":
                calculate = new CalculateRide();
                break;
            case "/":
                calculate = new CalculateExcept();
                break;
        }
        return calculate;
    }
}
