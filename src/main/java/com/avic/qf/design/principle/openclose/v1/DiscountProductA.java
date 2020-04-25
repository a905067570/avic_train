package com.avic.qf.design.principle.openclose.v1;

public class DiscountProductA extends ProductA{
    public DiscountProductA(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }

    public Double getPrice(){
        return super.getPrice()*0.6;
    }
}
