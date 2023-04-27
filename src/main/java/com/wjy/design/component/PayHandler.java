package com.wjy.design.component;

import com.wjy.design.pojo.PayBody;
import org.springframework.stereotype.Component;

@Component
public class PayHandler {
    public boolean bkPay(PayBody payBody) {
        return false;
    }
    public boolean zfbPay(PayBody payBody) {
        return false;
    }
    public boolean wcPay(PayBody payBody) {
        return false;
    }
}
