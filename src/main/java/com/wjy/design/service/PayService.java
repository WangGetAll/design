package com.wjy.design.service;

import com.wjy.design.component.PayHandler;
import com.wjy.design.pojo.PayBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayService {
    @Autowired
    private PayHandler payHandler;
    public Boolean pay(PayBody payBody) {
        int type = payBody.getType();
        boolean flag = false;
        if (type == 0) {
             flag = payHandler.zfbPay(payBody);
        } else if (type == 1) {
            flag = payHandler.wcPay(payBody);
        } else if (type == 2) {
            flag = payHandler.bkPay(payBody);
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
