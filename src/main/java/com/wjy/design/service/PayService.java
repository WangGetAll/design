package com.wjy.design.service;

import com.wjy.design.pay.payStrategy.BkPayStrategy;
import com.wjy.design.pay.payContext.PayContext;
import com.wjy.design.pay.payStrategy.WcPayStrategy;
import com.wjy.design.pay.payStrategy.ZfbPayStrategy;
import com.wjy.design.pay.strategyEnum.StrategyEnum;
import com.wjy.design.pay.strategyFactory.StrategyFactory;
import com.wjy.design.pojo.PayBody;
import org.springframework.stereotype.Service;

@Service
public class PayService {
    public Boolean pay(PayBody payBody) {
        int type = payBody.getType();
        boolean flag = false;
        if (type == 0) {
            flag = new PayContext(StrategyFactory.getPayStrategy(StrategyEnum.ZfbPayStrategy)).execute(payBody);
        } else if (type == 1) {
            flag = new PayContext(StrategyFactory.getPayStrategy(StrategyEnum.WcPayStrategy)).execute(payBody);
        } else if (type == 2) {
            flag = new PayContext(StrategyFactory.getPayStrategy(StrategyEnum.BkPayStrategy)).execute(payBody);
        } else {
            throw new UnsupportedOperationException("不支持");
        }
        if (flag) {
            saveToDB(payBody);
        }
        return flag;
    }

    private void saveToDB(PayBody payBody) {

    }
}
