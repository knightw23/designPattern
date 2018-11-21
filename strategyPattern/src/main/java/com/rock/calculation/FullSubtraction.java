package com.rock.calculation;

/***
 * 满减算法
 */
public class FullSubtraction extends ComputingCash {

    /**
     * 达到多少金额满减
     */
    private double fullSubtractionMoney;

    /**
     * 达到金额，减多少
     */
    private double reduceMoney;

    public FullSubtraction(double fullSubtractionMoney, double reduceMoney) {
        this.fullSubtractionMoney = fullSubtractionMoney;
        this.reduceMoney = reduceMoney;
    }

    /**
     * 满减算法
     *
     * @param money 原价
     * @return 应付金额
     */
    public double getCash(double money) {
        if (money >= fullSubtractionMoney) {
            return money - Math.floor(money / fullSubtractionMoney) * reduceMoney;
        }
        return money;
    }
}
