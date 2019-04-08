package com.richie.coding.design_pattern.proxy.dynamic;

import com.richie.coding.design_pattern.proxy.ITicketBuyer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Richie on 2018.04.01
 */
public class DynamicProxyBuyer implements InvocationHandler {
    // 被代理对象，即真正要买票的人
    private ITicketBuyer ticketBuyer;

    public DynamicProxyBuyer(ITicketBuyer ticketBuyer) {
        this.ticketBuyer = ticketBuyer;
    }

    public ITicketBuyer createProxy() {
        return (ITicketBuyer) Proxy.newProxyInstance(ITicketBuyer.class.getClassLoader(), new Class[]{ITicketBuyer.class}, this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("buyTicket".equals(method.getName())) {
            System.out.println("代理人来买票：");
        }
        return method.invoke(ticketBuyer, args);
    }
}
