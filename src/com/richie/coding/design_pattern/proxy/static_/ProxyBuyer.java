package com.richie.coding.design_pattern.proxy.static_;

import com.richie.coding.design_pattern.proxy.ITicketBuyer;

/**
 * @author Richie on 2018.04.01
 */
public class ProxyBuyer implements ITicketBuyer {
    // 被代理对象，即真正要买票的人
    private ITicketBuyer realBuyer;

    public ProxyBuyer(ITicketBuyer realBuyer) {
        this.realBuyer = realBuyer;
    }

    @Override
    public void buyTicket() {
        System.out.println("代理人来买票:");
        realBuyer.buyTicket();
    }
}
