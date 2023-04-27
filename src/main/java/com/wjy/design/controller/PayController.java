package com.wjy.design.controller;

import com.wjy.design.pojo.PayBody;
import com.wjy.design.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {
    @Autowired
    private PayService payService;
    @PostMapping("/pay")
    public Boolean pay(@RequestBody PayBody payBody) {
        return payService.pay(payBody);
    }
}
