package com.rock.strategy;

import com.rock.calculation.ComputingCash;
import com.rock.calculation.DiscountBilling;
import com.rock.calculation.FullSubtraction;

public class Context {
    private ComputingCash computingCash;

    //收费方式
    private int billingMethod;

    //折扣
    private double discount;

    //满减条件金额
    private double fullSubtractionMoney;

    //满足条件减的金额
    private double reduceMoney;

    public Context(int billingMethod, double discount) {
        this.billingMethod = billingMethod;
        this.discount = discount;
        initFactory();
    }

    public Context(int billingMethod, double fullSubtractionMoney, double reduceMoney) {
        this.billingMethod = billingMethod;
        this.fullSubtractionMoney = fullSubtractionMoney;
        this.reduceMoney = reduceMoney;
        initFactory();
    }

    public Context(int billingMethod) {
        this.billingMethod = billingMethod;
        initFactory();
    }

    private void initFactory() {
        //1：正常收费  2：折扣收费  3：满减活动
        switch (billingMethod) {
            case 1:
                computingCash = new DiscountBilling();
                break;
            case 2:
                computingCash = new DiscountBilling(discount);
                break;
            case 3:
                computingCash = new FullSubtraction(fullSubtractionMoney, reduceMoney);
                break;
        }
    }


    /**
     * 计费方法
     *
     * @param money 总额
     * @return 应收金额
     */
    public double getMoney(double money) {
        return computingCash.getCash(money);
    }
}
