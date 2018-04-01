package com.richie.learning.design_pattern.proxy;

/**
 * @author Richie on 2018.04.01
 */
public class RealBuyer implements ITicketBuyer {

    @Override
    public void buyTicket() {
        System.out.println("我要一张北京到上海的复兴号商务座");
    }
}
