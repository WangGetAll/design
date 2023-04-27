package com.wjy.design.pojo;

import lombok.Data;

@Data
public class PayBody {
    private String account;
    private int type;
    private String product;
    private int amount;
}
