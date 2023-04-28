package com.wjy.design.pay.payStrategy;

import com.wjy.design.pojo.PayBody;

public interface PayStrategy {
    public Boolean pay(PayBody payBody);
}
