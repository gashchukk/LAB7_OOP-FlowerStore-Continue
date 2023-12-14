package com.lab7.lab7.Payment;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class PayPalPaymentStrategy {
    private double price;
    private double checkout=0;
    
    public PayPalPaymentStrategy(double price){
        this.price = price;
    }
    @Override
    public void pay(double payedPrice){
        checkout += payedPrice;
    }
}
