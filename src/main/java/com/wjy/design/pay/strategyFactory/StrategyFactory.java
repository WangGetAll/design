package com.wjy.design.pay.strategyFactory;

import com.wjy.design.pay.payStrategy.PayStrategy;
import com.wjy.design.pay.strategyEnum.StrategyEnum;

public class StrategyFactory {
    public static PayStrategy getPayStrategy(StrategyEnum strategyEnum) {
        PayStrategy payStrategy = null;
        try {
            payStrategy = (PayStrategy) Class.forName(strategyEnum.getValue()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return payStrategy;
    }
}
