package com.wjy.design.pay.payContext;

import com.wjy.design.pay.payStrategy.PayStrategy;
import com.wjy.design.pojo.PayBody;

public class PayContext {
    private PayStrategy payStrategy;

    public PayContext(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public Boolean execute(PayBody payBody) {
        return payStrategy.pay(payBody);
    }
}
