package com.spring;

import com.spring.payment.PayementSertvice;
import com.spring.payment.PaymentGatwayImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        PayementSertvice sertvice= context.getBean("payment", PayementSertvice.class);
        sertvice.paymantGetway();
    }
}
