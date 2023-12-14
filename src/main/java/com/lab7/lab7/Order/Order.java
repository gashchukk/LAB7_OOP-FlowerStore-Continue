package com.lab7.lab7.Order;

import java.util.LinkedList;

import com.lab7.lab7.Delivery.Delivery;
import com.lab7.lab7.Item.Item;
import com.lab7.lab7.Payment.Payment;

import lombok.Setter;

public  class Order {
    private LinkedList<Item> items;
    @Setter
    private Delivery DeliveryStrategy;

    @Setter
    private Payment PaymentStrategy;

   
     public void RemoveItem(Item item){
        items.remove(item);
    }
    double result=0;
     public double calculateTotalPrice(){
        
        for(Item item : items){
            result +=item.price();
            return result;
        }
       
    }
    public void addItem(Item item){
        items.add(item);
        PaymentStrategy.setPrice(calculateTotalPrice());
    }
   
}

