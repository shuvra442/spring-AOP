package com.spring.payment;

public class PaymentGatwayImpl implements PayementSertvice{
    @Override
    public void paymantGetway() {

//        now we add some more extra function to add some msg before the debited payment
        System.out.println("payment successfully debited ");


        System.out.println("payment successfully created");
    }
}
