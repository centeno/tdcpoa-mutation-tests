package com.tdcpoa;

public class Product {

    public int getPrice(int amount, boolean coupon){
        if(amount >= 20 || coupon){
            return amount * 15;
        }
        return amount * 17;
    }

}