package com.rock;

import com.rock.strategy.Context;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入总金额：");
        double money = scanner.nextDouble();
        System.out.print("请输入活动方式:(1：正常收费 2：折扣收费 3：满减收费)");
        int activityType = scanner.nextInt();
        switch (activityType) {
            case 1:
                Context normalContext = new Context(1);
                System.out.println("实付金额为：" + normalContext.getMoney(money));
                break;
            case 2:
                System.out.print("请输入折扣：");
                double discount = scanner.nextDouble();
                Context discountContext = new Context(2, discount);
                System.out.println("实付金额为：" + discountContext.getMoney(money));
                break;
            case 3:
                System.out.print("请输入满减条件金额：");
                double fullSubtractionMoney = scanner.nextDouble();
                System.out.print("请输入满减金额：");
                double reduceMoney = scanner.nextDouble();
                Context context = new Context(3, fullSubtractionMoney, reduceMoney);
                System.out.println("实付金额为：" + context.getMoney(money));
                break;
        }
    }
}
