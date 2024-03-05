package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class NotificationAop {

@Before("execution(* com.spring.payment.PaymentGatewayImpl.paymantGetway())")
    public void Before(){
        System.out.println("Payment started ::- ");
    }
}
