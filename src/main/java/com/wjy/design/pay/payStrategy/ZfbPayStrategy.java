package com.wjy.design.pay.payStrategy;

import com.wjy.design.pojo.PayBody;

public class ZfbPayStrategy implements PayStrategy{
    @Override
    public Boolean pay(PayBody payBody) {
        return true;
    }
}
