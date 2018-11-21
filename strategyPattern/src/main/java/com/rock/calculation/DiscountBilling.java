package com.rock.calculation;

/**
 * 打折计费
 */
public class DiscountBilling extends ComputingCash {

    /**
     * 折扣
     */
    private double discount = 10;

    /**
     * 折扣，默认不打折
     *
     * @param discount 打几折
     */
    public DiscountBilling(double discount) {
        this.discount = discount;
    }

    public DiscountBilling() {
    }

    public double getCash(double money) {
        return money * (discount / 10);
    }
}
