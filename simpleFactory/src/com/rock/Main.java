package com.rock;

import com.rock.calculation.Calculate;
import com.rock.calculation.CalculationAdd;
import com.rock.factory.CalculateFactory;

import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个参数：");
        double nubmerA = scanner.nextDouble();
        System.out.println();
        System.out.print("请输入运算符：");
        String op = scanner.next();
        System.out.println();
        System.out.println("请输入第二个参数：");
        double numberB = scanner.nextDouble();
        Calculate calculate = CalculateFactory.getCalculate(op);
        calculate.setNumberA(nubmerA);
        calculate.setNumberB(numberB);
        System.out.println(calculate.getResult());

    }

}
