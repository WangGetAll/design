package com.wjy.design.pay.strategyEnum;

public enum StrategyEnum {
    ZfbPayStrategy("com.wjy.design.pay.payStrategy.ZfbPayStrategy"),
    WcPayStrategy("com.wjy.design.pay.payStrategy.WcPayStrategy"),
    BkPayStrategy("com.wjy.design.pay.payStrategy.BkPayStrategy");
    private String value;

    StrategyEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}

